#с помощью мавен плагина(org.apache.maven.plugins:maven-resources-plugin)
#перемещаем содержимое папки src/main/docker/ в папку target/
#заполняем значения переменные типа @var@

FROM adoptopenjdk/openjdk11:jre-11.0.7_10-alpine

ENV SPRING_OUTPUT_ANSI_ENABLED=ALWAYS \
    JAVA_OPTS=""

# Add a jhipster user to run our application so that it doesn't need to run as root
RUN adduser -D -s /bin/sh valya
WORKDIR /home/valya

ADD entrypoint.sh entrypoint.sh
RUN chmod 755 entrypoint.sh && chown valya:valya entrypoint.sh
USER valya

ADD @project.build.finalName@.jar app.jar

ENTRYPOINT ["./entrypoint.sh"]

EXPOSE 8080