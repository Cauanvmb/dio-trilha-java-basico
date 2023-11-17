package Iphone;

import AparelhoTelefonico.AparelhoTelefonico;
import NavegadorInternet.NavegadorDeInternet;
import ReprodutorMusical.ReprodutorMusical;

public class Iphone implements NavegadorDeInternet, AparelhoTelefonico, ReprodutorMusical {
    @Override
    public void exibirPagina() {
        System.out.println("A página está sendo exibida no Iphone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Uma Aba foi exibida no Iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("A página foi atualizada no Iphone");
    }

    @Override
    public void tocar() {
        System.out.println("O Iphone está tocando a música");
    }

    @Override
    public void pausar() {
        System.out.println("O Iphone está pausando a música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("O Iphone está selecionando a música");
    }

    @Override
    public void ligar() {
        System.out.println("Fez uma ligação pelo Iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atendeu uma ligação pelo Iphone");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Atendeu um correio de voz pelo Iphone");
    }

}
