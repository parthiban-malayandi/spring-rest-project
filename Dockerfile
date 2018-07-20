FROM openjdk:8
ADD target/spring-rest-project.jar  spring-rest-project.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","spring-rest-project.jar"]