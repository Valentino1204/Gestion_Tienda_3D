FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/gestion_negocio-0.0.1.jar
COPY ${JAR_FILE} Gestion_Tienda_3D.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/Gestion_Tienda_3D.jar"]