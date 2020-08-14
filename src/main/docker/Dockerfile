FROM adoptopenjdk/openjdk11:jre-11.0.7_10-alpine

ENV SPRING_OUTPUT_ANSI_ENABLED=ALWAYS \
    JAVA_OPTS=""

#с помощью мавен плагина(org.apache.maven.plugins:maven-resources-plugin) перемещаем содержимое папки src/main/docker в папку target/
ADD *.jar /tmp/app.jar

WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "app.jar"]

EXPOSE 8080