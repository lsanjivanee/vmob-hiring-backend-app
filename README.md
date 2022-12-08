# Valtech Mobility Backend Application

This application simulates a backend application.

It is based on Spring Boot 3.

The application exposes a REST service on default port 8080, which returns simple facts.
- [http://localhost:8080/](http://localhost:8080/)

For Kubernetes the application exposes a ready and a liveness probe on a management port.
- [http://localhost:8081/actuator/health/readiness](http://localhost:8081/actuator/health/readiness)
- [http://localhost:8081/actuator/health/liveness](http://localhost:8081/actuator/health/liveness)