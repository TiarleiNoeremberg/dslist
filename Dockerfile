FROM eclipse-temurin:17-jdk-alpine AS build
COPY . .
#RUN mvn clean package -DskipTests

FROM openjdk:17.0.2-jdk-slim
#COPY --from=build /target/demo-0.0.1-SNAPSHOT.jar demo.jar
# ENV PORT=8080
EXPOSE 8080
ENTRYPOINT ["java","-jar"]



#FROM ubuntu:latest AS build
#RUN apt-get update
#RUN apt-get install openjdk-17-jdk -y
#COPY . .
#RUN ./maven bootYar --no-daemon

#FROM openjdk:11-ea-17-jdk-slim
#EXPOSE 8080
#COPY --from=build /build/libs/demo-1.jar app.jar

#ENTRYPOINT [ "java", "-jar", "app.jar" ]