FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/gestion_negocio-0.0.1.jar
COPY ${JAR_FILE} app_gestion.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app_gestion.jar"]