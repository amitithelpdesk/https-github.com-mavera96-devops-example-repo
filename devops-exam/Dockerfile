FROM maven:3.9.6-eclipse-temurin-17 AS builder
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests=false

FROM eclipse-temurin:17-jre-jammy
RUN useradd -u 1001 springuser
USER springuser
WORKDIR /app
COPY --from=builder /app/target/*.jar app.jar

ENV SPRING_PROFILES_ACTIVE=dev

HEALTHCHECK --interval=30s --timeout=3s \
  CMD curl -f http://localhost:8080/actuator/health || exit 1

ENTRYPOINT ["sh", "-c", "java -Dspring.profiles.active=$SPRING_PROFILES_ACTIVE -jar app.jar"]
