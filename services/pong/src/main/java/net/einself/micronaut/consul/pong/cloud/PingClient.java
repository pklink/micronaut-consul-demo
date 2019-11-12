package net.einself.micronaut.consul.pong.cloud;


import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Single;

import java.util.Map;

@Client(id = "ping")
public interface PingClient {

  @Get("/ping")
  Single<Map<String, Object>> ping();

}
