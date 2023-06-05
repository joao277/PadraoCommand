package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;;

class PortaRealizarTest {

    Realizar realizar;
    Porta porta;

    @BeforeEach
    void setUp() {
        realizar = new Realizar();
        porta = new Porta ();
    }

    @Test
    void deveAbrirPorta() {
        Operacao abrirPorta = new AbrirPorta(porta);
        realizar.executarOperacao(abrirPorta);

        assertEquals("Porta Aberta", porta.getCondicao());
    }

    @Test
    void deveFecharPorta() {
        Operacao fecharPorta = new FecharPorta(porta);
        realizar.executarOperacao(fecharPorta);

        assertEquals("Porta Fechada", porta.getCondicao());
    }

    @Test
    void deveCancelarFechamentoSemestre() {
        Operacao abrirPorta = new AbrirPorta(porta);
        Operacao fecharPorta = new FecharPorta(porta);

        realizar.executarOperacao(abrirPorta);
        realizar.executarOperacao(fecharPorta);

        realizar.cancelarUltimoOperacao();

        assertEquals("Porta Aberta", porta.getCondicao());
    }
}