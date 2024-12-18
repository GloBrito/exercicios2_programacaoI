package com.modelagem;

import com.modelagem.modelo.Bolo;
import com.modelagem.modelo.Caneta;
import com.modelagem.modelo.Catedral;
import com.modelagem.modelo.Pintura;
import com.modelagem.modelo.Lustre;
import com.modelagem.modelo.Inseto;
import com.modelagem.modelo.Planta;
import com.modelagem.modelo.Filme;
import com.modelagem.modelo.Gato;
import com.modelagem.modelo.Disciplina;

public class Main {

    public static void main(String[] args) {
        //cria objetos
        Bolo bolo = new Bolo("Chocolate", 20, 1.5);
        Caneta caneta = new Caneta("azul", "Bic", 0.7);
        Catedral catedral = new Catedral("Notre-Dame", "Paris", 5000);
        Pintura pintura = new Pintura("branca", "acrílica", 30.0);
        Lustre lustre = new Lustre("vidro", 60, "dourado");
        Inseto inseto = new Inseto("Borboleta", 2.5, 6);
        Planta planta = new Planta("Ficus lyrata", 2.0, "Florífera");
        Filme filme = new Filme("O Senhor dos Anéis", "Fantasia", 180);
        Gato gato = new Gato("Mingau", 3, "Branco");
        Disciplina disciplina = new Disciplina("Matemática", 80, "Exatas");


        //teste dos métodos das classes
        testarBolo(bolo);
        testarCaneta(caneta);
        testarCatedral(catedral);
        testarPintura(pintura);
        testarLustre(lustre);
        testarInseto(inseto);
        testarPlanta(planta);
        testarFilme(filme);
        testarGato(gato);
        testarDisciplina(disciplina);
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
    //metodo para testar a classe Planta
    public static void testarPlanta(Planta planta) {
        System.out.println("\nTestando a classe Planta:");
        planta.crescer(0.5);
        planta.fazerFotossintese();
        planta.produzirFlor();
    }
    //metodo para testar a classe Filme
    public static void testarFilme(Filme filme) {
        System.out.println("\nTestando a classe Filme:");
        filme.exibirInformacoes();
        filme.reproduzir();
        filme.avaliar(8.5);
    }
    //metodo para testar a classe Gato
    public static void testarGato(Gato gato) {
        System.out.println("\nTestando a classe Gato:");
        gato.miar();
        gato.brincar();
        gato.comer("ração");
    }
    //metodo para testar a classe Disciplina
    public static void testarDisciplina(Disciplina disciplina) {
        System.out.println("\nTestando a classe Disciplina:");
        disciplina.exibirInformacoes();
        disciplina.associarProfessor("Professor João");
        double notaFinal = disciplina.calcularNotaFinal();
        System.out.println("Nota final calculada: " + notaFinal);
    }
}
