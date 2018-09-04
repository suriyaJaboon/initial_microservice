#!/bin/bash
./mvnw clean package
java "-Xmx100m" "-jar" "./target/eureka-server-0.0.1.jar"

