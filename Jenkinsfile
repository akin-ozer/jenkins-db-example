#!groovy

pipeline{
  agent none{
     steps{
        sh 'mvn clean compile'
      }
      steps{
        sh 'mvn deploy'
      }
  }
}
