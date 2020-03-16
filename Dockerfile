FROM openjdk:8-jdk-alpine
COPY target/java-assignment-1.0-SNAPSHOT.jar /java-assignment-1.0-SNAPSHOT.jar
ENTRYPOINT exec java $* -jar /java-assignment-1.0-SNAPSHOT.jar
