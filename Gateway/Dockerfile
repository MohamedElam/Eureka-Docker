# Use the appropriate base image with JDK
FROM openjdk:18

# Set the working directory inside the container
WORKDIR /app

# Copy the built JAR file into the container
COPY ./target/*.jar app.jar

# Entry point command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
