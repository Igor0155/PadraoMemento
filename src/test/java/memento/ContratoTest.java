package memento;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContratoTest {

    @Test
    void deveArmazenarEstados() {
        Contrato contrato = new Contrato();
        contrato.setEstado(ContratoEstadoRascunho.getInstance());
        contrato.setEstado(ContratoEstadoAssinado.getInstance());
        assertEquals(2, contrato.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Contrato contrato = new Contrato();
        contrato.setEstado(ContratoEstadoRascunho.getInstance());
        contrato.setEstado(ContratoEstadoEmRevisao.getInstance());

        contrato.restauraEstado(0);
        assertEquals(ContratoEstadoRascunho.getInstance(), contrato.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Contrato contrato = new Contrato();
        contrato.setEstado(ContratoEstadoRascunho.getInstance()); // Índice 0
        contrato.setEstado(ContratoEstadoEmRevisao.getInstance()); // Índice 1
        contrato.setEstado(ContratoEstadoAprovado.getInstance()); // Índice 2
        contrato.setEstado(ContratoEstadoAssinado.getInstance()); // Índice 3

        contrato.restauraEstado(2);
        assertEquals(ContratoEstadoAprovado.getInstance(), contrato.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Contrato contrato = new Contrato();

            contrato.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }
}