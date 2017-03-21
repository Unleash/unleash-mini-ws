# Add the Unleash dependency to you project

TASK:

1. Cd into `app` and run  `npm install`
2. Add / install `unleash-client` via npm `npm install unleash-client --save`.
2. Init up the Unleash instance, following the example given in the [online documentation](https://github.com/Unleash/unleash-client-node).
    * Choose unique `appName` when configuring Unleash!
3. Create a middleware using the following code snippet:

```js
app.use((req, res, next) => {
  req.isEnabled = (toggleName, context = {}, defaultValue = false) => {
    return instance.isEnabled(toggleName, Object.assign({
      userId: req.userId,
    }, context), defaultValue)
  }
  next();
})
```

You should now see your project's `appName` and `instanceId` registered under [Unleash UI -> Applications](https://unleash.herokuapp.com/#/applications).

Ready? [Go on to task 2](task-2.md).
