FROM openjdk:8-jdk-alpine
RUN mkdir -p /app
WORKDIR /app

COPY Reverse.java /app

#compile file java
RUN javac Reverse.java

#running java
CMD ["java","Reverse"]
