FROM openjdk:13-jdk-alpine
VOLUME /tmp
RUN mkdir /api
COPY . /api
WORKDIR /api
EXPOSE 8080
EXPOSE 5005
#RUN /api/gradlew build
#RUN mv /api/build/libs/*.jar /api/api.jar
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/work/api.jar"]

