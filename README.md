<h1>POC - Spring Boot</h1>

Projeto de estudo do Spring Boot referente aos cursos

* Spring Boot API REST: Construa uma API - Alura
* Spring Boot API Rest: Segurança da API, Cache e Monitoramento - Alura
* Spring Boot e Teste: Profiles, Testes e Deploy


<h2>Como usar no Docker</h2>

<h3>Criar imagem</h3>

docker build -t mtzimba/poc-restapi-springboot .

<h3>Executado imagem</h3>
docker run -p 8080:8080 -e SPRING_PROFILES_ACTIVE='prod' -e FORUM_DATABASE_URL=jdbc:h2:mem:poc-restapi-forum -e FORUM_DATABASE_USERNAME=sa -e FORUM_DATABASE_PASSWORD= -e FORUM_JWT_SECRET=eyJhbGciOiJIUzI1NiJ9.eyJSb2xlIjoiQWRtaW4iLCJJc3N1ZXIiOiJJc3N1ZXIiLCJVc2VybmFtZSI6IkphdmFJblVzZSIsImV4cCI6MTYxNjk1NDY2MCwiaWF0IjoxNjE2OTU0NjYwfQ.ABoHmihpvdL1m-iaNXeDylyPigk4AKJs9TAe8aFci0I mtzimba/poc-restapi-springboot

<h2>Conceitos e tecnologias aprendidas</h2>

* Spring Boot
* API Rest
* Segurança (JWT)
* Cache
* Actuator (Monitoramento)
* Testes
* Profiles
* Docker