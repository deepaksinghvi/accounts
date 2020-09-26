FROM openjdk:8-jre-alpine
EXPOSE 8080
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-Dspring.profiles.active=postgres","-jar","accounts-0.0.1-SNAPSHOT.jar"]