@Library('threepoints-sharedlib') _

pipeline {
    agent any

    stages {
        stage('Análisis SonarQube') {
            steps {
                // Llama a la función sonarAnalysis de la librería compartida
                sonarAnalysis(abortOnFailure: true, abortPipeline: false)
            }
        }
    }
}
