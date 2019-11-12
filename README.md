# micronaut-consul-demo

Microservice demo based on 

* [Micronaut](https://micronaut.io/) framework
* [Consul](https://www.consul.io/) as service discovery

## Services

### Ping

```bash
mvn -f services/ping/pom.xml compile exec:exec
```

Starts service on http://localhost:8081 and register as service at the locally running Consul agent 

#### Endpoints

* `GET /ping` returns ping message
* `GET /pong` returns response from `http://<pong-service>/pong`


## Services

### Pong

Starts service on http://localhost:8082 and register as service at the locally running Consul agent

```bash
mvn -f services/pong/pom.xml compile exec:exec
```

#### Endpoints

* `GET /pong` returns pong message
* `GET /ping` returns response from `http://<ping-service>/ping`
