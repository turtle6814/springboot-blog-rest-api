FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY target/springboot-blog-rest-api-0.0.1-SNAPSHOT.jar /app/springboot-blog-rest-api-0.0.1.jar

ENTRYPOINT ["java", "-jar", "springboot-blog-rest-api-0.0.1.jar"]