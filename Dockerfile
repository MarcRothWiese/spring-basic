FROM openjdk:11-jre-slim-buster
COPY ./build/springer-1.0.1.jar /usr/app/
WORKDIR /usr/app
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "springer-1.0.1.jar"]