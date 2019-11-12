package net.einself.micronaut.consul.pong.web;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import net.einself.micronaut.consul.pong.cloud.PingClient;

import javax.inject.Inject;
import java.util.Map;

@Controller("/ping")
public class PingController {

  @Inject
  private PingClient pingClient;

  @Get(produces = MediaType.APPLICATION_JSON)
  public Map<String, Object> ping() {
    return pingClient.ping().blockingGet();
  }

}
