package com.example;

public class FecharPorta implements Operacao{

        private Porta porta;
    
        public FecharPorta(Porta porta) {
            this.porta = porta;
        }
    
        public void executar() {
            this.porta.fecharPorta();
        }
    
        public void cancelar() {
            this.porta.abrirPorta();
        }
    }