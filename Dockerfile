FROM openjdk:17-jdk-alpine

VOLUME /tmp

COPY target/maven-pipeline-1.0.jar app.jar

ENTRYPOINT ["java","-jar", "/app.jar"]
