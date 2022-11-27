FROM openjdk:17-alpine
VOLUME /tmp
COPY target/*.jar demo-api.jar
ENTRYPOINT ["java","-jar","/demo-api.jar"]