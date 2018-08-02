FROM openjdk:8-jdk-alpine
LABEL maintainer="ritesh_ranjan@infosys.com"

VOLUME /tmp

EXPOSE 8080

ARG JAR_FILE=target/SWSEAdapter-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} SWSEAdapter.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/SWSEAdapter.jar"]