package com.modelagem;

import com.modelagem.modelo.Bolo;
import com.modelagem.modelo.Caneta;
import com.modelagem.modelo.Catedral;
import com.modelagem.modelo.Pintura;
import com.modelagem.modelo.Lustre;
import com.modelagem.modelo.Inseto;


public class Main {

    public static void main(String[] args) {
        //cria objetos
        Bolo bolo = new Bolo("Chocolate", 20, 1.5);
        Caneta caneta = new Caneta("azul", "Bic", 0.7);
        Catedral catedral = new Catedral("Notre-Dame", "Paris", 5000);
        Pintura pintura = new Pintura("branca", "acrílica", 30.0);
        Lustre lustre = new Lustre("vidro", 60, "dourado");
        Inseto inseto = new Inseto("Borboleta", 2.5, 6);


        //teste dos métodos das classes
        testarBolo(bolo);
        testarCaneta(caneta);
        testarCatedral(catedral);
        testarPintura(pintura);
        testarLustre(lustre);
        testarInseto(inseto);


    }

    //metodo para testar a classe Bolo
    public static void testarBolo(Bolo bolo) {
        bolo.exibirDetalhes();
        bolo.decorar("Festivo");
        System.out.println("Está assado? " + bolo.assado());
    }

    //metodo para testar a classe Caneta
    public static void testarCaneta(Caneta caneta) {
        caneta.escrever("Olá, como você está?");
        caneta.trocarTinta("vermelha");
        caneta.verificarNivelTinta();
    }

    //metodo para testar a classe Catedral
    public static void testarCatedral(Catedral catedral) {
        catedral.exibirInformacoes();
        catedral.tocarSinos();
        System.out.println("A catedral está aberta? " + catedral.aberto());
    }

    //meodo para testar a classe Pintura
    public static void testarPintura(Pintura pintura) {
        pintura.aplicarTinta("parede externa");
        pintura.misturarCor("azul claro");
        pintura.calcularCusto();
    }
    //metodo para testar a classe Lustre
    public static void testarLustre(Lustre lustre) {
        lustre.acender();
        lustre.ajustarBrilho(5);
        lustre.apagar();
    }
    //metodo para testar a classe Inseto
    public static void testarInseto(Inseto inseto) {
        System.out.println("\nTestando a classe Inseto:");
        inseto.mover();
        inseto.emitirSom();
        inseto.alimentar("néctar de flores");
    }
}
