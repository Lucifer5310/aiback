FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY build/libs/aiback-*.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "app.jar"]
