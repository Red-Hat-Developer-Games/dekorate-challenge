FROM openjdk:8u171-alpine3.7
COPY ./target/dekorate-challenge-1.0-SNAPSHOT.jar dekorate-challenge.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","dekorate-challenge.jar"]