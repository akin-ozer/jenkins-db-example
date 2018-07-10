FROM openjdk:8
ADD target/demo-docker-example.jar demo-docker-example.jar
ENTRYPOINT ["java","-Dspring.profiles.active=container", "-jar", "demo-docker-example.jar","container-entrypoint"]
EXPOSE 8080

#"-Dspring.profiles.active=container" is used to determine active profile in docker image
#profiles defined in application.yml