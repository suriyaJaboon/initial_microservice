FROM maven:3.5.0-jdk-8-alpine
WORKDIR /usr/src/app
COPY ./target/eureka-server-0.0.1.jar /usr/src/app/
EXPOSE 8090
CMD ["java", "-Xms10m", "-jar", "eureka-server-0.0.1.jar"]