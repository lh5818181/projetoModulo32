package com.luisJpa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.luisJpa.domain.Produto;

public class NovoProjetoApplicationTests {

    @Test
    void testeCriacaoProduto() {
        // Criação de um objeto Produto
        Produto produto = new Produto(1L, "Notebook", "Ultrabook com 16GB RAM", 4500.00);

        // Verificações
        assertEquals(1L, produto.getId());
        assertEquals("Notebook", produto.getNome());
        assertEquals("Ultrabook com 16GB RAM", produto.getDescricao());
        assertEquals(4500.00, produto.getPreco());
    }

    @Test
    void testeAtualizacaoProduto() {
        Produto produto = new Produto();
        produto.setId(2L);
        produto.setNome("Mouse");
        produto.setDescricao("Mouse sem fio");
        produto.setPreco(120.00);

        // Verificações
        assertEquals(2L, produto.getId());
        assertEquals("Mouse", produto.getNome());
        assertEquals("Mouse sem fio", produto.getDescricao());
        assertEquals(120.00, produto.getPreco());
    }
}
