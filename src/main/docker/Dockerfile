#с помощью мавен плагина(org.apache.maven.plugins:maven-resources-plugin) перемещаем содержимое папки src/main/docker в папку target/

FROM adoptopenjdk/openjdk11:jre-11.0.7_10-alpine

ENV SPRING_OUTPUT_ANSI_ENABLED=ALWAYS \
    JAVA_OPTS=""

WORKDIR /tmp

ADD *.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]

EXPOSE 8080