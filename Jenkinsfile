#!groovy

pipeline{
  agent{
    label "master"
  }
  stages{
    stage('Build image'){
      steps{
        sh 'oc login https://api.starter-us-west-1.openshift.com --token=0uh0BRkl9AIwA0i7GeHd3FONKl4VgSECeHGdLG-IHCw'
        sh 'oc new-app --image-stream="openshift/redhat-openjdk18-openshift:1.2 redhat-openjdk18-openshift~https://github.com/akin-ozer/jenkins-example'
      }
    }
  }
}
