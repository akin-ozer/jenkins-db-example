#!groovy

pipeline{
  agent{
     steps{
        sh 'mvn clean compile'
      }
      steps{
        sh 'mvn deploy'
      }
  }
}
