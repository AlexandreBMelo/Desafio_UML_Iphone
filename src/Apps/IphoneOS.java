package Apps;

public class IphoneOS implements Navegador, ReprodutorMusica, Telefone{

    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }
    public void atender() {
        System.out.println("Atendendo chamada");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
    public void tocar() { 
        System.out.println("O Iphone está reproduzindo uma música");
    }
    public void pausar() {
        System.out.println("O Iphone pausou uma música");
    }
    public void selecionarMusica(String musica) {
        System.out.println("Você selecionou " + musica);
    }
    public void exibirPagina(String url) {
        System.out.println("Você está acessando " + url);
    }
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
    
}
