FROM openjdk:11
COPY ./target/docker-demo-0.0.1-SNAPSHOT.jar docker-demo-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","docker-demo-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080