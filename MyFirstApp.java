public class MyFirstApp {
    public static void main (String [] args){

        //Escrevendo uma mensagem na tela

        System.out.println("I rule!");
        System.out.println("The world");

        //Adicionando um número aleatório a uma variável (Pense em "math" como se fosse "Casar")

        double numero = Math.random();
        System.out.println(numero);

        // Loop

        int x = 0;
        while (x < 100) {
            x = x + 1;
            System.out.println(x);
        }

        //Branching

        int preco = 1001;

        if (preco <= 1000) {
            System.out.println("Vou comprar");
        } else {
            System.err.println("Não vou comprar");
        }

    }
}