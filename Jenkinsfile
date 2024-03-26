// @Library('threepoints-sharedlib') _

// pipeline {
//     agent any

//     stages {
//         stage('Análisis SonarQube') {
//             steps {
//                 // Llama a la función sonarAnalysis de la librería compartida
//                 sonarAnalysis(abortOnFailure: true, abortPipeline: false)
//             }
//         }
//     }
// }

@Library('threepoints-sharedlib') _

pipeline {
    agent any

    stages {
        stage('Análisis SonarQube') {
            steps {
                script {
                    // No es necesario pasar branchName si se usa el multibranch pipeline y env.BRANCH_NAME
                    sonarAnalysis(abortOnFailure: true, abortPipeline: false)
                }
            }
        }
    }
}
