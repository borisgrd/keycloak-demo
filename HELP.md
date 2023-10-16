# Reference (Credits)
Following through the original video tutorial https://youtu.be/vmEWywGzWbA?si=oLnk_EA_1jCrcWrC

- Use RBAC (role base auth)  with spring security (spring boot rest api app ) and keycloak as auth provider 

- Note: https://www.baeldung.com/spring-security-method-security - Spring Method Security doc in Baeldung

- Note: http://localhost:9090/realms/boris/.well-known/openid-configuration

- Worth to read and follow through: https://github.com/ch4mpy/spring-addons -> https://github.com/ch4mpy/spring-addons/tree/master/samples/tutorials 


# Steps with KeyCloak console

## create realm (boris)

## create client (boris-rest-api) 

## create user (boris)

## create realm roles for realm "boris" (ex. user_role and admin_role) and assign them to user "boris"

## create client roles (client_user and client_admin)

## associate realm roles with client roles (they become composite) -> user "boris" can now be a client user and client admin

# Code change

## added Lanbda DSL to the SecurityConfig


# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.4/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.4/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.1.4/reference/htmlsingle/index.html#web)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

