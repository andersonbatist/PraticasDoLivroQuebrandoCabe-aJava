public class StreamingSong {

    String titulo;
    String  artista;
    int duracao;

    void play () {
        System.out.println("Começando a música...");
    }

    void mostrarDetalhes () {
        System.out.println("Você está ouvindo " + titulo + " feita por " + artista);
    }


}