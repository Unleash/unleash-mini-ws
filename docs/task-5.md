# Add UserWithId strategy for internal users

Aggregated strategies in Unleash gives you the opportunity to configure multiple strategies for each toggle. This is especially useful when you want to give a few selected team member access to a new feature while gradually rolling out to everybody else.

**Your homepage has a login form the accepts the user `user` with password `password`**


TASK:
1. Provide this userId to Unleash via an UnleashContext in `HomepageController` injected as the last argument to the `isEnabled` call, as described in the [online documentation](https://github.com/Unleash/unleash-client-java).
2. Find your toggle in the [Unleash UI](http://unleash.herokuapp.com), and add the `userWithId` strategy alongside the other strategy (`gradualRolloutRandom`).
3. Add the userId `user` to the configuration. These would usually be ID's resolved by your backend, but for now we just make it up :-)
3. [Your homepage](http:/localhost:8080) should now always display the green box then you're logged in.

The ordering of aggregated strategies for a toggle usually doesn't matter, as they are sequentially evaluated until one returns true. One exception where ordering may matter is custom strategies with side effects like tracking.

Alrighty then! [Task 6 is last](task-6.md).
