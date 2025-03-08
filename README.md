# RedisExample

A really simple example of pub-sub using Redis.

Run redis server by:
docker run --name redis-server -p 6379:6379 -d redis

Invokes the rest endpoint at /publish and pass a message.
The controller calls the publisher to publish
The subscriber gets the message and prints