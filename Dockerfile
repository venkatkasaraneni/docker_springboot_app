FROM openjdk:11
ADD target/ths-springboot-0.0.1-SNAPSHOT.jar hello-world-springboot.jar
EXPOSE 8085
ENTRYPOINT [ "java", "-jar", "hello-world-springboot.jar" ]