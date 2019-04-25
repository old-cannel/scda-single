FROM java:8-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ./${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Duser.timezone=GMT+08","-jar","/app.jar"]
