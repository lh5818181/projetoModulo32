# Projeto JPA com Spring Boot

Este projeto é uma solução simples para a Tarefa 32 do curso de Back-end Java da EBAC, focando na configuração e uso do JPA (Java Persistence API) com Hibernate para mapeamento objeto-relacional.

## Tecnologias Utilizadas

*   **Java 17**
*   **Spring Boot 3.2.1**
*   **Maven**
*   **JPA / Hibernate**
*   **PostgreSQL**

## Configuração do Banco de Dados

1.  Crie um banco de dados PostgreSQL chamado `db_projeto_jpa`.
2.  Ajuste as credenciais de acesso no arquivo `src/main/resources/application.properties`.

**Exemplo de Configuração (`application.properties`):**
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/db_projeto_jpa
spring.datasource.username=postgres
spring.datasource.password=sua_senha_do_postgres
spring.jpa.hibernate.ddl-auto=update
```

A propriedade `spring.jpa.hibernate.ddl-auto=update` garante a criação automática da tabela `TB_PRODUTO` com base na classe `Produto.java`.

## Executando a Aplicação

Para iniciar o projeto, execute o comando Maven na pasta raiz:

```bash
mvn spring-boot:run
```

## Estrutura do Projeto

*   **Classe de Entidade (`Produto.java`)**: Representa a entidade `Produto` com propriedades `id`, `nome`, `descricao` e `preco`, mapeada para a tabela `TB_PRODUTO`.
*   **Testes Unitários (`NovoProjetoApplicationTests.java`)**: Valida a funcionalidade da classe `Produto`, assegurando a correta criação e atualização de objetos.

## Contato

Para dúvidas ou sugestões, entre em contato:

*   **Gmail**: lh5818181@gmail.com
*   **GitHub (Profissional)**: [devhenriquejs](https://github.com/devhenriquejs)
*   **GitHub (Estudos)**: [lh5818181](https://github.com/lh5818181)
*   **LinkedIn**: [Luis Henrique Vieira de Oliveira](https://www.linkedin.com/in/luis-henrique-76245231a/)

