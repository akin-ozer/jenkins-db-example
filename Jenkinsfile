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
    stage('Maven Compile'){
      steps{
        sh 'mvn clean compile'
      }
    }
    stage('Deploy'){
      steps{
        dir('/target') {
          sh "cp demo-docker-example.jar var/lib/origin"
        }
      }
    }
  }
}
