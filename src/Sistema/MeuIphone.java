package Sistema;
import Apps.IphoneOS;

public class MeuIphone {
    public static void main(String[] args) {
        IphoneOS meuIphone = new IphoneOS();

System.out.println("Testando Telefone: ");
        meuIphone.atender();
        meuIphone.ligar("4402-8922");
        meuIphone.iniciarCorreioVoz();
        System.out.println("__________________________________");

System.out.println("Testando reprodutor de música: ");
        meuIphone.selecionarMusica("Enemy - Imagine Dragons");
        meuIphone.tocar();
        meuIphone.pausar();
        System.out.println("__________________________________");
System.out.println("Testando navegador web: ");
        meuIphone.exibirPagina("www.alexandre.com.br");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
        System.out.println("__________________________________");

    }
}
