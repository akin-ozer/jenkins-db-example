#!groovy

pipeline{
  agent{
    label "maven"
  }
  stages{
    stage('Maven clean install'){
      steps{
        sh 'mvn clean install'
      }
    }
    stage('Build image'){
      steps{
        sh 'oc start-build --from-dir'
      }
    }
  }
}
