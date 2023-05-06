FROM openjdk:11

ARG artifact=target/docker-jenkins-integration.jar

WORKDIR /opt/app

COPY ${artifact} docker-jenkins-integration.jar

ENTRYPOINT ["java","-jar","docker-jenkins-integration.jar"]
