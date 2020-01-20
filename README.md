# jenkins-db-example

This project is made for using Spring Boot for different environments.

It has 3 different profiles for docker, local and openshift database access.

Jenkinsfile is created for Openshift CI and depends a MySQL app working.

Docker compose file depends locally created spring jar image, it creates and links spring jar itself.

Dockerfile is basic, just creates the image to local but it needs to be changed based on which profile to be used from application.yml and needs a .jar in /target directory.

To create a maven build, package etc. you need to have following:
    
- Openshift deployment: You need to create MySQL app first and then you need to create redhat openjdk app with default profile is openshift.

- Localhost with docker image MySQL: You need to create the MySQL image first and use the corresponding profile to simply run the project.

- Docker spring image with docker image MySQL: You need to dockerize spring app and use 

> docker-compose up


Dockerfile, Jenkinsfile, application.yml, docker-compose.yaml have the comments inside to help make necessary changes.

 
 
 added github actions
