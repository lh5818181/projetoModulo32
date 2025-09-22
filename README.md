# Projeto JPA com Spring Boot
Este projeto é uma solução simples para a Tarefa 32 do curso de Back-end Java da EBAC, que aborda a configuração e o uso do JPA (Java Persistence API) com o Hibernate para mapeamento objeto-relacional.

# Tecnologias Utilizadas
As seguintes tecnologias foram utilizadas no desenvolvimento deste projeto:
# Java 17: Linguagem de programação.
# Spring Boot 3.2.1: Framework para facilitar a criação de aplicações Java.
# Maven: Ferramenta de automação de build e gerenciamento de dependências.
# JPA / Hibernate: API e provedor de persistência para o mapeamento de entidades.
# PostgreSQL: Banco de dados relacional.

# Configuração do Banco de Dados
Para que o projeto funcione corretamente, é necessário ter um banco de dados PostgreSQL instalado e configurado. Siga os passos abaixo:
# Abra o seu cliente de banco de dados (ex: pgAdmin) e crie um banco de dados com o nome db_projeto_jpa.
# No arquivo src/main/resources/application.properties, ajuste as credenciais de acesso ao seu banco de dados, se necessário. Um exemplo de configuração é fornecido abaixo:
# properties
# Configuração do PostgreSQL
# spring.datasource.url=jdbc:postgresql://localhost:5432/db_projeto_jpa
# spring.datasource.username=postgres
# spring.datasource.password=sua_senha_do_postgres
# spring.datasource.driver-class-name=org.postgresql.Driver

# Configuração do JPA/Hibernate
# spring.jpa.hibernate.ddl-auto=update
# spring.jpa.show-sql=true
# spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
A propriedade spring.jpa.hibernate.ddl-auto=update fará com que o Hibernate crie a tabela automaticamente no banco de dados, com base na classe Produto.java.

# Executando a Aplicação
Para iniciar o projeto, abra o terminal na pasta raiz do projeto e execute o seguinte comando Maven:
# Bash
# mvn spring-boot:run
Após a execução bem-sucedida, você verá logs no console indicando que a aplicação iniciou e que a tabela TB_PRODUTO foi criada no seu banco de dados.

# Estrutura do Projeto
# Classe de Entidade (produto.java)
A classe Produto representa a entidade que será persistida no banco de dados. Ela contém as propriedades id, nome, descricao e preco, mapeadas para a tabela TB_PRODUTO.
# Java
# package com.luisJpa.domain;

# import jakarta.persistence.Column;
# import jakarta.persistence.Entity;
# import jakarta.persistence.GeneratedValue;
# import jakarta.persistence.GenerationType;
# import jakarta.persistence.Id;
# import jakarta.persistence.Table;

# @Entity
# @Table(name = "TB_PRODUTO")
# public class Produto {

#     @Id
#     @GeneratedValue(strategy = GenerationType.IDENTITY)
#     private Long id;

#     @Column(name = "NOME", length = 50, nullable = false)
#     private String nome;

#     @Column(name = "DESCRICAO", length = 200)
#     private String descricao;

#     @Column(name = "PRECO", nullable = false)
#     private Double preco;
    
#     public Produto() {
#     }

#     public Produto(Long id, String nome, String descricao, Double preco) {
#         this.id = id;
#         this.nome = nome;
#         this.descricao = descricao;
#         this.preco = preco;
#     }

#     public Long getId() {
#         return id;
#     }

#     public void setId(Long id) {
#         this.id = id;
#     }

#     public String getNome() {
#         return nome;
#     }

#     public void setNome(String nome) {
#         this.nome = nome;
#     }

#     public String getDescricao() {
#         return descricao;
#     }

#     public void setDescricao(String descricao) {
#         this.descricao = descricao;
#     }

#     public Double getPreco() {
#         return preco;
#     }

#     public void setPreco(Double preco) {
#         this.preco = preco;
#     }
# }
# Testes Unitários (NovoProjetoApplicationTests.java)
Os testes unitários validam a funcionalidade da classe Produto, garantindo que a criação e a atualização de objetos estão funcionando como esperado.
# Java
# package com.luisJpa;

# import static org.junit.jupiter.api.Assertions.assertEquals;
# import org.junit.jupiter.api.Test;

# import com.luisJpa.domain.Produto;

# public class NovoProjetoApplicationTests {

#     @Test
#     void testeCriacaoProduto() {
#         // Criação de um objeto Produto
#         Produto produto = new Produto(1L, "Notebook", "Ultrabook com 16GB RAM", 4500.00);

#         // Verificações
#         assertEquals(1L, produto.getId());
#         assertEquals("Notebook", produto.getNome());
#         assertEquals("Ultrabook com 16GB RAM", produto.getDescricao());
#         assertEquals(4500.00, produto.getPreco());
#     }

#     @Test
#     void testeAtualizacaoProduto() {
#         Produto produto = new Produto();
#         produto.setId(2L);
#         produto.setNome("Mouse");
#         produto.setDescricao("Mouse sem fio");
#         produto.setPreco(120.00);

#         // Verificações
#         assertEquals(2L, produto.getId());
#         assertEquals("Mouse", produto.getNome());
#         assertEquals("Mouse sem fio", produto.getDescricao());
#         assertEquals(120.00, produto.getPreco());
#     }
# }
# Contato
Para dúvidas ou sugestões, entre em contato:
# GMail: [lh5818181@gmail.com](mailto:lh5818181@gmail.com)
# GitHub (Profissional): [devhenriquejs](https://github.com/devhenriquejs)
# GitHub (Estudos): [lh5818181](https://github.com/lh5818181)
# LinkedIn: [Luis Henrique Vieira de Oliveira](https://www.linkedin.com/in/luis-henrique-vieira-de-oliveira-7a3b331b8/)
