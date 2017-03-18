# Unleash Mini WS

In this workshop you will learn how to use [Unleash](https://github.com/Unleash/unleash) in a typical Java Web Application, based on [Spring Boot](https://spring.io/guides/gs/spring-boot/).

Step-by-step instructions are found in the [Java client documentation](https://github.com/Unleash/unleash-client-java).

## Getting started

1. Clone this project
2. Build project with maven: `mvn clean install`
3. Run `src/main/java/no/finn/unleash/example/DemoApplication.java` from your IDE
4. Open [http://localhost:8080](http://localhost:8080)

## Tasks

1. [docs/task-1.md](Add the Unleash dependency to your project)
2. [docs/task-2.md](Create and enable your own feature toggle)
3. [docs/task-3.md](Check the toggle value in you code)
4. [docs/task-4.md](Change toggle to GradualRolloutRandom strategy)
5. [docs/task-5.md](Add UserWithId strategy for internal users)
6. [docs/task-6.md](Change to GradualRolloutUserId for stickiness)

7. Unit testing
