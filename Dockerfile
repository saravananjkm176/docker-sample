FROM openjdk:8-jre-alpine
#ADD target/docker-sample-1.0.jar docker-sample-1.0.jar
#EXPOSE 1976
#ENTRYPOINT["java", "-jar", "docker-sample-1.0.jar"]
COPY target/docker-sample-1.0.jar docker-sample-1.0.jar
ENTRYPOINT ["java","-jar","/docker-sample-1.0.jar"]