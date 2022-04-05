FROM openjdk:8
VOLUME /tmp
ADD target/testtech.jar /testtech.jar
CMD ["java", "-jar","/testtech.jar"]
EXPOSE 8080