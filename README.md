![maven](https://github.com/fcobello/lgpd-logs/workflows/maven/badge.svg)
![license](https://img.shields.io/github/license/fcobello/lgpd-logs)

# lgpd-logs

Aplicação construida para exemplo de uso do mascaramento de dados sensiveis visando atender requisitos da LGPD.

Usando o LogBack, é possivel customizar o tratamento dos dados logados, e usando Regex, é possivel identificar campos considerados sensiveis, e mascarar os mesmos

No exemplo os campos estão configurados no arquivo logback.xml

## Pré requisitos
Java 14 (https://openjdk.java.net/projects/jdk/14/)

Maven (https://maven.apache.org/download.cgi)

Executar os comandos na raiz do projeto

## Como Compilar

`mvn clean install`

## Como executar (Maven)

`mvn spring-boot:run`


## Como testar 
### Cadastrar um Cliente

`curl -X POST 'http://localhost:8080/client' -d '{\"nome\": \"Felipe Cobello\", \"cpf\":\"999.999.999-99\", \"salario\":500, \"endereco\":\"Travessa do Tranco\"}'`