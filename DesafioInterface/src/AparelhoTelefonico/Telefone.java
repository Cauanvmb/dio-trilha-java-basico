package AparelhoTelefonico;

public class Telefone implements AparelhoTelefonico {

    @Override
    public void ligar() {
        System.out.println("Fez uma ligação pelo telefone");
    }

    @Override
    public void atender() {
        System.out.println("Atendeu uma ligação pelo telefone");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Atendeu um correio de voz pelo telefone");
    }
    
}
