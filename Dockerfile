FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY . /app

CMD ["spring-boot:run"]
