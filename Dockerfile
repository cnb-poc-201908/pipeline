FROM openjdk:8

ADD build/libs/demo.jar /app.jar

EXPOSE 8080

CMD ["java", "-jar", "/app.jar"]
