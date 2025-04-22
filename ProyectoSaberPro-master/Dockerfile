# Build stage
FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app

# Copy the project files
COPY pom.xml .
COPY src ./src

# Ensure correct permissions
RUN chmod -R 777 /app

# Build the application
RUN mvn clean package -DskipTests && ls -l target/

# Runtime stage
FROM openjdk:17-jdk-slim
WORKDIR /app

# Copy the built JAR from the build stage
# Ajustado para tu nombre de archivo específico
COPY --from=build /app/target/PruebaSaberPRO-1.jar app.jar

# Environment variables (customize as needed)
ENV SPRING_PROFILES_ACTIVE=prod
ENV SERVER_PORT=8022

# Expose the application port
EXPOSE 8022

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
