package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TurmaTest {

    private Turma turma;

    @BeforeEach
    public void setUp() {
        turma = new Turma();
    }

    @Test
    public void deveAdicionarPessoa() throws Exception {
        Pessoa pessoa1 = new Pessoa(1, "Fulano");
        Pessoa pessoa2 = new Pessoa(2, "Beltrano");

        turma.adicionarPessoa(pessoa1);
        turma.adicionarPessoa(pessoa2);

        assertEquals(2, turma.getPessoas().size());
    }

    @Test
    public void deveRetornarExcecaoPessoaExistente() throws Exception {
        Pessoa pessoa1 = new Pessoa(1, "Fulano");
        turma.adicionarPessoa(pessoa1);

        Exception exception = assertThrows(Exception.class, () -> turma.adicionarPessoa(pessoa1));
        assertEquals("Objeto pessoa já está atribuido a turma", exception.getMessage());
    }

    @Test
    public void deveRetornarExcecaoPessoaInvalida() {
        Pessoa pessoaInvalida = new Pessoa(0, "");

        Exception exception = assertThrows(Exception.class, () -> turma.adicionarPessoa(pessoaInvalida));
        assertEquals("Objeto pessoa inválido", exception.getMessage());
    }

    @Test
    public void deveRetornarSucessoRemoverTodasPessoa() throws Exception {
        Pessoa pessoa1 = new Pessoa(1, "Fulano");
        Pessoa pessoa2 = new Pessoa(2, "Beltrano");

        turma.adicionarPessoa(pessoa1);
        turma.adicionarPessoa(pessoa2);

        turma.removerTodasPessoas();

        assertEquals(0, turma.getPessoas().size());
    }
}