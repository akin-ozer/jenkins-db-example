#!groovy

pipeline{
  agent{
    label 'linux'
  }
  stages{
    stage('Maven Install'){
      steps{
        sh 'mvn clean compile'
      }
    }
    stage('Deploy'){
      steps{
        sh 'mvn deploy'
      }
    }
  }
}
