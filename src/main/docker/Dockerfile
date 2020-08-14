#с помощью мавен плагина(org.apache.maven.plugins:maven-resources-plugin) перемещаем содержимое папки src/main/docker в папку target/

FROM adoptopenjdk/openjdk11:jre-11.0.7_10-alpine

ENV SPRING_OUTPUT_ANSI_ENABLED=ALWAYS \
    JAVA_OPTS=""

# Add a jhipster user to run our application so that it doesn't need to run as root
RUN adduser -D -s /bin/sh valya

WORKDIR /home/valya

ADD *.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]

EXPOSE 8080