package com.example;

import java.util.ArrayList;
import java.util.List;

public class Realizar {

    private List<Operacao> operacoes = new ArrayList<Operacao>();

    public void executarOperacao(Operacao operacao) {
        this.operacoes.add(operacao);
        operacao.executar();
    }

    public void cancelarUltimoOperacao() {
        if (operacoes.size() != 0) {
            Operacao operacao = this.operacoes.get(this.operacoes.size() - 1);
            operacao.cancelar();
            this.operacoes.remove(this.operacoes.size() - 1);
        }
    }

}