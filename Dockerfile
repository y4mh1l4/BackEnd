
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template

FROM amazoncorrecto:19-alpine-jdk

COPY target/porf-0.0.1-SNAPSHOT.jar porf-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/porf-0.0.1-SNAPSHOT.jar"]
