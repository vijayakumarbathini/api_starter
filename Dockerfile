# Stage 1: Build the JAR
FROM maven:3.8.4-openjdk-17-slim AS builder

WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests


# Stage 2: Create a smaller image
FROM openjdk:17-jdk-slim

WORKDIR /app
COPY --from=builder /app/target/api_starter-0.0.1-SNAPSHOT.jar app.jar
RUN ls -al /app

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
