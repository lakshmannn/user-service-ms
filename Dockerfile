FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY --from=build /app/target/user-service.jar user-service.jar
EXPOSE 8089
ENTRYPOINT ["java", "-jar", "user-service.jar"]
