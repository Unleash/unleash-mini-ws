# Check the toggle value in your code

Use your newly created toggle to enable an awesome new feature in your project.

TASK:

1. Use/Call `req.isEnabled` in the `routes/index.js` and output the result to the view via the enabled property.
2. Check http://localhost:8080 and verify that the box changes color from red (disabled) to green (enabled).

There will be a slight lag when you enable/disable the toggle, since the client SDK caches all toggles for 10 seconds by default. Feel free to change the caching time in your project's Unleash configuration.

Metrics are reported to the server in 1 minute intervals by default. This can also be changed in the Unleash configuration.

Awesome? [Fire up task 4](task-4.md).
