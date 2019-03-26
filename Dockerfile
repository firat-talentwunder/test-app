FROM openjdk:8-jdk-alpine 
RUN apk --no-cache add curl
COPY build/libs/*.jar test-app.jar
CMD java ${JAVA_OPTS} -jar test-app.jar