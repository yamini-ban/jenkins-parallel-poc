pipeline {
    agent any
    stages{
        stage('build') {
            steps {
                sbt clean compile
            }
        }
    }
}