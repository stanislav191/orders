FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY . /app

EXPOSE 8081

CMD ["./target/release/app"]

ENTRYPOINT ["java","-jar","/orders-0.0.1-SNAPSHOT.jar"]
