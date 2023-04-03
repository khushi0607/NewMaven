pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git branch: 'master', url: 'https://github.com/khushi0607/NewMaven.git'
  
            }
        }
        stage('Deploy') {
            steps {
                build 'NewMaven'
            }
        }
        stage('Test') {
            steps {
                sh "mvn -Dmaven.test.failure.ignore=true clean package"
            }
        }
    }
}
