# Intensivão Java Spring da DevSuperior
Constituido de um sistema Back-End de ranqueamento de jogos com Java e Spring Boot.
O sistema foi concebido utilizando o padrão de camadas, onde temos uma camada de acesso a dados constituidas por nossas classes "entities", mapeadas com ORM (Mapeamento Objeto Relacional), acima uma camada de "services" onde estão estruturadas nossas regras de negócios, que por meio de classes DTO, transferem para uma classe "controllers" os dados solicitados por um possível sistema Front-End por meio da API Rest, utilizando requisições HTTP na linguagem JSON.
Foi um projeto desafiante, repleto de tecnologias e boas práticas para um melhor produto final.

# Modelo conceitual UML

# No primeiro módulo foi abordado:
• Conceitos
	- Sistemas web e recursos
	- Cliente/servidor, HTTP, JSON
	- Padrão Rest para API web
• Estruturação de projeto Spring Rest
• Entidades e ORM
• Database seeding
• Padrão camadas
• Controller, service, repository
• Padrão DTO

# No segundo módulo foi abordado:
• Relacionamentos N-N
• Classe de associação, embedded id
• Consultas SQL no Spring Data JPA
• Projections

Utilizamos relacionamentos N-N para implementar o modelo de domínios.

# No terceiro módulo foi abordado:
• Dicas de currículo e portfólio
• Perfis de projeto
• Ambiente local com Docker Compose
• Processo de homologação local
• Processo de deploy com CI/CD
• Configuração de CORS

Durante este módulo implementamos perfis de projetos: teste (test), desenvolvimento (dev) e produção (prod).
Neste ponto tive de adaptar meu projeto utilizando o Heroku ao invés do Railway para hospedar o projeto e realizar o "deploy" remotamente.

# Tecnologias utilizadas
Linguagens - Java, Maven, UML e SQL
IDE - SpringToolSuite
Framework - SpringBoot
Bibliotecas - JPA, WEB, H2
Banco de dados - H2 e Postgresql
Outras tecnologias abordadas - Docker, Git, Heroku e Postman

# Como executar o projeto
- Pré-requisitos: Java 17

```bash
# clonar repositório
git clone https://github.com/TiarleiNoeremberg/dslist

# entrar na pasta do projeto back end

# executar o projeto
./mvnw spring-boot:run
```
# Autor

Tiarlei Noeremberg

https://www.linkedin.com/in/tiarlei-noeremberg-97772022/
