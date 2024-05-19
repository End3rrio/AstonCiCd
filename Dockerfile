FROM openjdk:21-slim
ADD target/AstonCiCd-1.0-jar-with-dependencies.jar /opt/Service.jar
EXPOSE 7070
ENTRYPOINT ["java", "-jar", "/opt/Service.jar"]