pipeline {
    agent any

    tools {
        maven 'Maven-3.9.16'
        jdk 'java 26.0.1'
    }

    stages {

        stage('Clone Code') {
            steps {
                echo 'Cloning code from GitHub...'
                git branch: 'main', url: 'https://github.com/YOUR_USERNAME/my-java-app.git'
            }
        }

        stage('Build with Maven') {
            steps {
                echo 'Building the project...'
                bat 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                echo 'Packaging the app...'
                bat 'mvn package'
            }
        }

    }

    post {
        success {
            echo '✅ Build Successful!'
        }
        failure {
            echo '❌ Build Failed! Check the logs.'
        }
    }
}