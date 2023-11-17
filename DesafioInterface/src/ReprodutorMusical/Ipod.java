package ReprodutorMusical;

public class Ipod implements ReprodutorMusical{

    @Override
    public void tocar() {
        System.out.println("O ipod está tocando a música");
    }

    @Override
    public void pausar() {
        System.out.println("O ipod está pausando a música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("O ipod está selecionando a música");
    }


}
