FROM eclipse-temurin:17-jdk AS builder

WORKDIR /app
COPY . .
RUN ./mvnw clean package -DskipTests -Dmaven.test.skip=true

FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=builder /app/target/desafio-service-*.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]