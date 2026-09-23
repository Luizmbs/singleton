package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SystemConfigTest {

    @Test
    public void deveRetornarNomeSistema() {
        SystemConfig.getInstance().setNomeSistema("Sistema 1");
        assertEquals("Sistema 1", SystemConfig.getInstance().getNomeSistema());
    }

    @Test
    public void deveRetornarUsuarioLogado() {
        SystemConfig.getInstance().setUsuarioLogado("Usuario 1");
        assertEquals("Usuario 1", SystemConfig.getInstance().getUsuarioLogado());
    }

}
