package NavegadorInternet;

public class AppNavegadorDeInternet implements NavegadorDeInternet{

    @Override
    public void exibirPagina() {
        System.out.println("A página está sendo exibida no App navegador");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Uma Aba foi exibida no App navegador");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("A página foi atualizada no App navegador");
    }
}
