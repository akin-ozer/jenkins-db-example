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
        sh "cd /home/jenkins/.m2/repository/com/example/demo/0.0.1-SNAPSHOT"
        sh "cp demo-docker-example.jar var/lib/origin"
      }
    }
  }
}
