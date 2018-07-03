#!groovy

pipeline{
  agent{
    label "master"
  }
  stages{
    stage('Build image'){
      steps{
        sh 'mvn clean install'
      }
    }
  }
}
