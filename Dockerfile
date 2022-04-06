FROM openjdk:8
VOLUME /tmp
ADD target/testtech-0.0.1-SNAPSHOT.jar /testtech-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar","/testtech-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080