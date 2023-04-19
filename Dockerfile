FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY target/orders-0.0.1-SNAPSHOT.jar app.jar

CMD ["spring-boot:run"]
