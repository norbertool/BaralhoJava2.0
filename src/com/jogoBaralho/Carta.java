package com.jogoBaralho;


public class Carta {
    private Naipe naipe;
    private Valor valor;

    public Naipe getNaipe() {
        return naipe;
    }

    public void setNaipe(Naipe naipes) {
        this.naipe = naipes;
    }

    public Valor getValor() {
        return valor;
    }

    public void setValor(Valor valores) {
        this.valor = valores;
    }
}
