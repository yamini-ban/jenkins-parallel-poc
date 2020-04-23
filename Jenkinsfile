pipeline {
    agent any
    stages{
        stage('build') {
            steps {
                sh "sbt clean compile"
            }
        }
        stage('parallel-test') {
          steps {
            parallel(
              a: {
                sh "sbt \"testOnly Test1Spec\""
              },
              b: {
                sh "sbt \"testOnly Test2Spec\""
              }
            )
          }
        }
    }
}