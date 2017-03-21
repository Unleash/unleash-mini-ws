# Change toggle to GradualRolloutRandom strategy

A common use case for feature toggling is gradual rollout of a new feature. This is provided in Unleash with the GradualRolloutRandom strategy.

TASK:

1. Find your toggle in the [Unleash UI](http://unleash.herokuapp.com/), remove the `default` strategy, and add the `gradualRolloutRandom` strategy.
2. Set it to 50%, and see the box on [your homepage](http:/localhost:8080) changing color roughly half the times you reload the page.

Again, there may be a 10 second lag due to caching in the client SDK.

Got it? [Task 5 is next](task-5.md).