package net.einself.micronaut.consul.ping.web;

import io.micronaut.context.annotation.Value;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

@Controller("/ping")
public class PingController {

  @Value("${micronaut.application.name}")
  private String applicationName;

  @Get(produces = MediaType.APPLICATION_JSON)
  public Map<String, Object> ping() {
    return Map.of(
            "applicationName", applicationName,
            "message", "ping",
            "timestamp", Instant.now().toEpochMilli()
    );
  }

}
