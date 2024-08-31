FROM maven:3.8.6-jdk-17 AS build
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/demo-0.0.1-SNAPSHOT.jar app.jar
COPY pom.xml .
COPY src ./src
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]