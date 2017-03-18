# Unleash Mini WS

In this workshop you will learn how to use [Unleash](https://github.com/Unleash/unleash) in a typical Java Web Application, based on [Spring Boot](https://spring.io/guides/gs/spring-boot/).

Step-by-step instructions are found in the [Java client documentation](https://github.com/Unleash/unleash-client-java).

## Getting started

1. Clone this project
2. Build project with maven: `mvn clean install`
3. Run `src/main/java/no/finn/unleash/example/DemoApplication.java` from your IDE
4. Open [http://localhost:8080](http://localhost:8080)

## Tasks

1. [Add the Unleash dependency to your project](docs/task-1.md)
2. [Create and enable your own feature toggle](docs/task-2.md)
3. [Check the toggle value in you code](docs/task-3.md)
4. [Change toggle to GradualRolloutRandom strategy](docs/task-4.md)
5. [Add UserWithId strategy for internal users](docs/task-5.md)
6. [Change to GradualRolloutUserId for stickiness](docs/task-6.md)

7. Unit testing
