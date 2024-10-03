# spring-boot-weather

## Description
Build a weather API that fetches and returns weather data. 
In this project, instead of relying on our own weather data, we will build a weather API that fetches and returns weather data from a 3rd party API. This project will help you understand how to work with 3rd party APIs, caching, and environment variables.

As for the actual weather API to use, you can use your favorite one, as a suggestion, here is a link to Visual Crossing’s API, it’s completely FREE and easy to use.

Regarding the in-memory cache, a pretty common recommendation is to use Redis, you can read more about it here, and as a recommendation, you could use the city code entered by the user as the key, and save there the result from calling the API.

At the same time, when you “set” the value in the cache, you can also give it an expiration time in seconds (using the EX flag on the SET command). That way the cache (the keys) will automatically clean itself when the data is old enough (for example, giving it a 12-hours expiration time).

## Tips
Some Tips

Here are some tips to help you get started:

   -  Start by creating a simple API that returns a hardcoded weather response. This will help you understand how to structure your API and how to handle requests.
   -  Use environment variables to store the API key and the Redis connection string. This way, you can easily change them without having to modify your code.
   -  Make sure to handle errors properly. If the 3rd party API is down, or if the city code is invalid, make sure to return the appropriate error message.
   -  Use some package or module to make HTTP requests e.g. if you are using Node.js, you can use the axios package, if you are using Python, you can use the requests module.
   -  Implement rate limiting to prevent abuse of your API. You can use a package like express-rate-limit if you are using Node.js or flask-limiter if you are using Python.

This project will help you understand how to work with 3rd party APIs, caching, and environment variables. It will also help you understand how to structure your API and how to handle requests.

## Reference
https://roadmap.sh/projects/weather-api-wrapper-service