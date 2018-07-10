FROM openjdk:8
ADD target/demo-docker-example.jar demo-docker-example.jar
ENTRYPOINT ["java","-Dspring.profiles.active=container", "-jar", "demo-docker-example.jar","container-entrypoint"]
EXPOSE 8080