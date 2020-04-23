pipeline {
    agent any
    stages{
        stage('build') {
            steps {
                sh "${tool name: 'sbt', type:'/home/knoldus/Downloads/sbt/bin/sbt-launch.jar'}/bin/sbt compile"
            }
        }
    }
}