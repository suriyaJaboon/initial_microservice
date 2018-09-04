FROM maven:3.5.0-jdk-8-alpine
WORKDIR /usr/src/app
COPY ./target/search-service-0.0.1.jar /usr/src/app/
EXPOSE 8093
CMD ["java", "-Xms10m", "-jar", "search-service-0.0.1.jar"]