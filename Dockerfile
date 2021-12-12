#FROM openjdk:8-jdk-alpine
FROM azul/zulu-openjdk:17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} customer.jar
ENTRYPOINT ["java","-jar","/customer.jar"]