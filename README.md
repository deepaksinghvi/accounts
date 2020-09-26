#SpringBoot-Postgres-Docker-Kubernetes
SpringBoot Based Microservice\
Depends on Postgres DB\
Docker Image pushed to docker-hub\
Deployed on localcluster (minikube) and AWS using EKS



##1. Build & Run locally

    mvn clean install
    mvn spring-boot:run

###Docker Compose can also be used to run locally
    docker-compose up

Access at http://localhost:8080/accounts/swagger-ui/ using sagger UI

##2. Deploy to Kubernetes Cluster
### Login to dockerhub account or whichever is the repository
    docker login --username=deepaksinghvi
    
###Docker Build    
    docker build -t deepaksinghvi/accounts .

###Docker Run
    docker run --rm -p 8080:8080 deepaksinghvi/accounts

###List Docker Images
    docker images | grep deepaksinghvi
###output of docker images
    deepaksinghvi/accounts     latest    11839fc6f43a    39 seconds ago      126MB

###Tag the docker image
    docker tag 11839fc6f43a deepaksinghvi/acounts:latest

###Docker Push
    docker push deepaksinghvi/accounts
    
    