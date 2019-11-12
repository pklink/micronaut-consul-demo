package net.einself.micronaut.consul.ping.web;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import net.einself.micronaut.consul.ping.cloud.PongClient;

import javax.inject.Inject;
import java.util.Map;

@Controller("/pong")
public class PongController {

  @Inject
  private PongClient pongClient;

  @Get(produces = MediaType.APPLICATION_JSON)
  public Map<String, Object> pong() {
    return pongClient.pong().blockingGet();
  }

}
