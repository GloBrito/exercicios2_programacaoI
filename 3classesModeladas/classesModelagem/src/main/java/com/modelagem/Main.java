package com.modelagem;

import com.modelagem.modelo.Bolo;
import com.modelagem.modelo.Caneta;
import com.modelagem.modelo.Catedral;

public class Main {
    public static void main(String[] args) {
        //chama metodo para testar a classe Bolo
        testarBolo();

        //chama metodo para testar a classe Caneta
        testarCaneta();

        //chama metodo para testar a classe Catedral
        testarCatedral();
    }

    //metodo para testar a classe Bolo
    public static void testarBolo() {
        Bolo bolo = new Bolo("Chocolate", 20, 1.5);

        bolo.exibirDetalhes();
        bolo.decorar("Festivo");
        System.out.println("Está assado? " + bolo.assado());
    }

    //metodo para testar a classe Caneta
    public static void testarCaneta() {
        // Cria uma instância de Caneta
        Caneta minhaCaneta = new Caneta("azul", "Bic", 0.7);

        // Usa os métodos da classe Caneta
        minhaCaneta.escrever("Olá, como você está?");
        minhaCaneta.trocarTinta("vermelha");
        minhaCaneta.verificarNivelTinta();
    }

    //metodo para testar a classe Catedral
    public static void testarCatedral() {
        // Cria uma instância de Catedral
        Catedral catedral = new Catedral("Notre-Dame", "Paris", 5000);

        //usa os metodos da classe Catedral
        catedral.exibirInformacoes();
        catedral.tocarSinos();
        System.out.println("A catedral está aberta? " + catedral.aberto());
    }
}
