FROM maven:4.0.0-rc-4-eclipse-temurin-21-alpine as build
WORKDIR /app
COPY . .
RUN mvn clean install -DskipTest
FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY --from=build /app/target/*.jar /app/bff-agendador-tarefas.jar
EXPOSE 8083

CMD ["java", "-jar", "/app/bff-agendador-tarefas.jar"]



