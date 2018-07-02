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
          sh 'oc start-build mavenapp --from-dir . --follow'
        }
      }
    }
  }
}
