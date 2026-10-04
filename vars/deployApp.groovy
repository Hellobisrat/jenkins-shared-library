def call() {
    echo "Deploying application..."
    sh """
        # your real deployment commands go here
        # example:
        kubectl apply -f deployment.yaml
    """
}
