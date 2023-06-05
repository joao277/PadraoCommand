package com.example;

public class Porta {

    private String condicao;

    public Porta() {}

    public String getCondicao() {
        return condicao;
    }

    public void abrirPorta() {
        this.condicao = "Porta Aberta";
    }

    public void fecharPorta() {
        this.condicao = "Porta Fechada";
    }

}