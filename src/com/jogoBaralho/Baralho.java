package com.jogoBaralho;

//Importando a biblioteca Random
import java.util.Random;

public class Baralho {
    //Declarando variáveis
    Carta carta[] = new Carta[52];

    Carta aux = new Carta();
    int i = 0;

    public void montar(){
        //Montando o baralho
        for (Naipe naipe : Naipe.values()) {
            for (Valor valor : Valor.values()){
                carta[i] = new Carta();
                carta[i].setNaipe(naipe);
                carta[i].setValor(valor);
                i++;
            }
        }
        exibir();
    }

    public void embaralhar(){
        //Declarando a variavel auxiliar
        int random;

        //Começando a embaralhar
        for (int i = 0; i < carta.length; i++) {
            Random rand = new Random();
            random = rand.nextInt(52);
            aux = carta[i];
            carta[i] = carta[random];
            carta[random] = aux;
        }
        //Chamando o Método exibir
        exibir();
    }
    public void exibir(){
        //Exibindo o baralho
        for (int i = 0; i < carta.length; i++) {
            System.out.println(i+1 + " " + carta[i].getValor() + " de " + carta[i].getNaipe());
        }

        //Quebra linha
        System.out.println("");
    }
}

