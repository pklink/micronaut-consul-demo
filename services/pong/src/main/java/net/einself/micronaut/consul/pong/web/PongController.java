package net.einself.micronaut.consul.pong.web;

import io.micronaut.context.annotation.Value;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.time.Instant;
import java.util.Map;

@Controller("/pong")
public class PongController {

  @Value("${micronaut.application.name}")
  private String applicationName;

  @Get(produces = MediaType.APPLICATION_JSON)
  public Map<String, Object> pong() {
    return Map.of(
            "applicationName", applicationName,
            "message", "pong",
            "timestamp", Instant.now().toEpochMilli()
    );
  }

}
