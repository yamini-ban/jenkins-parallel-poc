pipeline {
    agent any
    stages{
        stage('build') {
            steps {
                sh "${tool name: 'sbt', type:'org.jvnet.hudson.plugins.SbtPluginBuilder$SbtInstallation'}/bin/sbt compile"
            }
        }
    }
}