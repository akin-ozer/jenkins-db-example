#!groovy

pipeline{
  agent{
    label "master"
  }
  stages{
    stage('Build image'){
      steps{
        sh 'oc login https://api.starter-us-west-1.openshift.com --token=0uh0BRkl9AIwA0i7GeHd3FONKl4VgSECeHGdLG-IHCw'
        sh 'oc new-app https://github.com/akin-ozer/jenkins-example.git'
      }
    }
  }
}
