FROM openjdk:11
ADD target/ths-springboot-0.0.2-SNAPSHOT.jar hello-world-springboot.jar
EXPOSE 9447
ENTRYPOINT [ "java", "-jar", "hello-world-springboot.jar" ]