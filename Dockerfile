FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY . /app

EXPOSE 8081

ENTRYPOINT ["java","-jar","/app.jar"]
