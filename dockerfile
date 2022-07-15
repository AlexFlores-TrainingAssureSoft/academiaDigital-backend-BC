# Maven build container 

FROM maven:3.8.5-openjdk-11 AS maven_build

COPY pom.xml /tmp/

COPY src /tmp/src/

WORKDIR /tmp/

RUN mvn package

#pull base image

FROM openjdk

#expose port 8080
EXPOSE 8080

COPY --from=maven_build /tmp/target/academia-digital-backend-0.0.1-SNAPSHOT.jar /data/academia-digital-backend-0.0.1-SNAPSHOT.jar

#default command
ENTRYPOINT [ "java","-jar","/data/academia-digital-backend-0.0.1-SNAPSHOT.jar" ]
