FROM openjdk:11-jre-slim-buster
COPY ./build/springer*.jar /usr/app/app.jar
WORKDIR /usr/app
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "app.jar"]
