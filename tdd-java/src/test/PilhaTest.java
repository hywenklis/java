package test;

import main.Pilha;
import main.PilhaCheiaException;
import main.PilhaVaziaException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PilhaTest {

    private Pilha pilha;

    @BeforeEach
    public void inicializaPilha() {
        pilha = new Pilha();
    }

    @Test
    public void pilhaVazia() {
        assertTrue(pilha.estaVazia());
        assertEquals(0, pilha.tamanho());
    }

    @Test
    public void empilhaUmElemento() {
        pilha.empilha("primeiro");
        assertFalse(pilha.estaVazia());
        assertEquals(1, pilha.tamanho());
        assertEquals("primeiro", pilha.topo());
    }

    @Test
    public void empilhaEDesempilha() {
        pilha.empilha("primeiro");
        pilha.empilha("segundo");
        assertFalse(pilha.estaVazia());
        assertEquals(2, pilha.tamanho());
        assertEquals("segundo", pilha.topo());

        Object desempilhado = pilha.desempilha();
        assertEquals(1, pilha.tamanho());
        assertEquals("primeiro", pilha.topo());
        assertEquals("segundo", desempilhado);
    }

    @Test()
    public void removeDaPilhaVazia() {
        PilhaVaziaException exception = assertThrows(
                PilhaVaziaException.class,
                () -> pilha.desempilha());
        assertEquals("Não é possível desempilhar", exception.getMessage());
        assertTrue(exception.getMessage().contains("Não é possível desempilhar"));
    }

    @Test
    public void adicionaNaPilhaCheia() {
        PilhaCheiaException exception = assertThrows(
                PilhaCheiaException.class,
                () -> {
                    IntStream.range(0, 11).forEach(i -> pilha.empilha("elemento" + i));
                    pilha.empilha("boom");
                }
        );
        assertEquals("Não é possível empilhar", exception.getMessage());
        assertTrue(exception.getMessage().contains("Não é possível empilhar"));
    }
}
