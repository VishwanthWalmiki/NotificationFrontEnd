# Stage 1: Build the JAR using Maven
FROM maven:3.9.6-eclipse-temurin-17 AS builder
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Stage 2: Use a lightweight JDK image to run the application
FROM eclipse-temurin:17-jdk
WORKDIR /app

# Copy only the built JAR file from the previous stage
COPY --from=builder /app/target/WebNotificationApp-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080 (Spring Boot default)
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
