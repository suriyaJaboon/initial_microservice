#!/bin/bash
./mvnw clean package
java "-Xmx100m" "-jar" "./target/gateway-0.0.1.jar"
