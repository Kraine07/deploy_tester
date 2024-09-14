

FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Run the application
FROM eclipse-temurin:21
WORKDIR /app
COPY --from=build /app/target/*.jar deploy_test.jar
EXPOSE 3000
CMD ["java", "-jar", "deploy_test.jar"]
