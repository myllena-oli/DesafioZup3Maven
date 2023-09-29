package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PessoaTest {

    private Pessoa pessoa;

    @BeforeEach
    public void setUp() {
        pessoa = new Pessoa(1, "Fulano");
    }

    @Test
    public void deveMudarOIdDaPessoa() {
        pessoa.setId(2);
        assertEquals(2, pessoa.getId());
    }

    @Test
    public void deveMudarONomeDaPessoa() {
        pessoa.setNome("Beltrano");
        assertEquals("Beltrano", pessoa.getNome());
    }

    @Test
    public void deveRetornarPessoaVazia() {
        Pessoa pessoa = new Pessoa();

        assertEquals(0, pessoa.getId());
        assertNull(pessoa.getNome());
    }
}
