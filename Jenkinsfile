#!groovy

pipeline{
  agent{
    label 'master'
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
