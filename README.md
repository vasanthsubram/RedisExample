# RedisExample

A really simple example of pub-sub using Redis.
User invokes the rest endpoint at /publish and passes a message.
The controller calls the publisher to publish
The subscriber gets the message and prints