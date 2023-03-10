FROM openjdk:17
EXPOSE 8080
ADD /target/springboot-azure.jar springboot-k8s-azure.jar
ENTRYPOINT ["java","-jar","springboot-k8s-azure.jar"]