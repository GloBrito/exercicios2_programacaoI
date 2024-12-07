package com.modelagem;

import com.modelagem.modelo.Bolo;
import com.modelagem.modelo.Caneta;
import com.modelagem.modelo.Catedral;
import com.modelagem.modelo.Pintura;
import com.modelagem.modelo.Lustre;


import java.util.Scanner;

public class TestaClasse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //cria objetos
        Bolo bolo = new Bolo("Morango", 25, 2.0);
        Caneta caneta = new Caneta("preta", "Faber-Castell", 0.5);
        Catedral catedral = new Catedral("Sagrada Família", "Barcelona", 12000);
        Pintura pintura = new Pintura("verde", "látex", 40.0);
        Lustre lustre = new Lustre("vidro", 60, "dourado");


        int opcao;
        do {
            //exibe menu
            System.out.println("\nMenu:");
            System.out.println("1. Testar Bolo");
            System.out.println("2. Testar Caneta");
            System.out.println("3. Testar Catedral");
            System.out.println("4. Testar Pintura");
            System.out.println("5. Testar Lustre");

            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            //processa opções
            switch (opcao) {
                case 1:
                    testarBolo(bolo);
                    break;
                case 2:
                    testarCaneta(caneta);
                    break;
                case 3:
                    testarCatedral(catedral);
                    break;
                case 4:
                    testarPintura(pintura);
                    break;
                case 5:
                    testarLustre(lustre);
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 5);
    }

    //metodo para testar a classe Bolo
    public static void testarBolo(Bolo bolo) {
        bolo.exibirDetalhes();
        bolo.decorar("Elegante");
        System.out.println("Está assado? " + bolo.assado());
    }

    //metodo para testar a classe Caneta
    public static void testarCaneta(Caneta caneta) {
        caneta.escrever("Testando a caneta...");
        caneta.trocarTinta("azul");
        caneta.verificarNivelTinta();
    }

    //metodo para testar a classe Catedral
    public static void testarCatedral(Catedral catedral) {
        catedral.exibirInformacoes();
        catedral.tocarSinos();
        System.out.println("A catedral está aberta? " + catedral.aberto());
    }
    //metodo para testar a classe Pintura
    public static void testarPintura(Pintura pintura) {
        pintura.aplicarTinta("teto");
        pintura.misturarCor("amarelo pastel");
        pintura.calcularCusto();
    }
    //metodo para testar a classe Lustre
    public static void testarLustre(Lustre lustre) {
        lustre.acender();
        lustre.ajustarBrilho(5);
        lustre.apagar();
    }
}