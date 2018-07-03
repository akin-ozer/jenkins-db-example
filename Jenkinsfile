#!groovy

pipeline{
  agent{
    label "master"
  }
  stages{
    stage('Remove old'){
      steps{
        script{
          sh 'oc login https://api.starter-us-west-1.openshift.com --token=0uh0BRkl9AIwA0i7GeHd3FONKl4VgSECeHGdLG-IHCw'
          try{
            sh 'oc delete all -l app=myjavaapp'
          }catch(Exception e){
            sh 'echo myjavaapp was not running'
          }
        }
      }
    }
    stage('Build app'){
      steps{
        sh 'oc import-image --from=registry.access.redhat.com/redhat-openjdk-18/openjdk18-openshift s2i-java --confirm'
        sh 'oc new-app s2i-java~https://github.com/akin-ozer/jenkins-example --name=myjavaapp'
      }
      steps{
        sh 'oc expose svc/myjavaapp'
      }
    }
  }
}
