#!groovy

pipeline{
  agent{
    label 'jnlp'
  }
  stages{
    stage('Maven clean install'){
      steps{
        sh 'mvn clean install'
      }
    }
    stage('Maven Compile'){
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
