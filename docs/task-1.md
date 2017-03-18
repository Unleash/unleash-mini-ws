# Adding Unleash dependency to you project

1. Add the Java client dependency to you project's `pom.xml` file, and re-run `mvn clean install`.
2. Wire up the Unleash instance in `UnleashConfiguration`, following the example given in the online documentation.
    * Choose unique `appName` and `instanceId`
3. Inject the new Unleash instance into `HomepageController`, using the following code snippet

```java
private final Unleash unleash;

@Autowired
public HomepageController(Unleash unleash) {
    this.unleash = unleash;
}
```
