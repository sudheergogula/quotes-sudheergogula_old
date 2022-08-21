FROM amazoncorretto:11-alpine-jdk
LABEL app="quotes"
COPY target/quotes-*.jar quotes.jar
ENTRYPOINT ["java", "-jar", "/quotes.jar"]