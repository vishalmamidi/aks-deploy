FROM openjdk:17-jdk-alpine

EXPOSE 8080

WORKDIR /app

COPY /build/libs/aks-deploy-0.0.1-SNAPSHOT.jar /app/aks-deploy-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "./aks-deploy-0.0.1-SNAPSHOT.jar"]
