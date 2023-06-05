package com.example;

public class AbrirPorta implements Operacao{

    private Porta porta;

    public AbrirPorta(Porta porta) {
        this.porta = porta;
    }

    public void executar() {
        this.porta.abrirPorta();
    }

    public void cancelar() {
        this.porta.fecharPorta();
    }

}