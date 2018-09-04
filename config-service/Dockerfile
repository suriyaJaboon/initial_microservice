FROM maven:3.5.0-jdk-8-alpine
WORKDIR /usr/src/app
COPY ./target/config-service-0.0.1.jar /usr/src/app/
#COPY ./service-yml /usr/src/app/service-yml
EXPOSE 8888
CMD ["java", "-Xms10m", "-jar", "config-service-0.0.1.jar"]