package net.einself.micronaut.consul.ping.cloud;


import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Single;

import java.util.Map;

@Client(id = "pong")
public interface PongClient {

  @Get("/pong")
  Single<Map<String, Object>> pong();

}
