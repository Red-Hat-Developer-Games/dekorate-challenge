FROM openjdk:8u171-alpine3.7
RUN apk --no-cache add curl
COPY target/*.jar dekorate-challenge.jar
CMD java -jar target/dekorate-challenge.jar