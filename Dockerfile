
FROM amazoncorretto:19-alpine-jdk

COPY target/porf-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
