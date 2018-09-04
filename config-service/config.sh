#!/bin/bash
./mvnw clean package
java "-Xmx100m" "-jar" "./target/config-service-0.0.1.jar"
