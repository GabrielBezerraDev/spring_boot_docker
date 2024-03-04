FROM eclipse-temurin:latest
WORKDIR /app
COPY . /app
RUN chmod +x mvnw
RUN ./mvnw dependency:go-offline
CMD ["./mvnw", "spring-boot:run"]

