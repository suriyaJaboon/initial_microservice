FROM maven:3.5.0-jdk-8-alpine
WORKDIR /usr/src/app
COPY ./target/gateway-service-0.0.1.jar /usr/src/app/
EXPOSE 8091
CMD ["java", "-Xms10m", "-jar", "gateway-service-0.0.1.jar"]