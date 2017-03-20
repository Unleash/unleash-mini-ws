# Change to GradualRolloutUserId for stickiness

Stickiness may be important for ensuring consistent user experiences while rolling out new features.

TASK:

1. Find your toggle in the [Unleash UI](http://unleash.herokuapp.com/), remove the `gradualRolloutRandom` and `userWithId` strategy, 
2. Add the `gradualRolloutUserId` strategy.
2. Adjust the rollout percentage to see at which threshold the toggle activates for userId `user`.

Unleash provides stickiness by hashing the `userId` together with a `groupId`, using the final two digits for activation. The `groupId` is useful for mixing up users between toggles.

Well done!
