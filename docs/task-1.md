# Add the Unleash dependency to you project

TASK:

1. Add the Java client dependency to you project's `pom.xml` file, and re-run `mvn clean install`.
2. Wire up the Unleash instance in `UnleashConfiguration`, following the example given in the [online documentation](https://github.com/Unleash/unleash-client-java).
    * Choose unique `appName` when configuring Unleash!
3. Inject the new Unleash instance into `HomepageController`, using the following code snippet:

```java
private final Unleash unleash;

@Autowired
public HomepageController(Unleash unleash) {
    this.unleash = unleash;
}
```

You should now see your project's `appName` and `instanceId` registered under [Unleash UI -> Applications](https://unleash.herokuapp.com/#/applications).

Ready? [Go on to task 2](task-2.md).
