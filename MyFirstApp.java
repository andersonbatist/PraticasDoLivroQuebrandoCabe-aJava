public class MyFirstApp {
    public static void main (String [] args){
        /*
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

        */

        /*
            int contador = 101;
                System.out.println("INICIANDO O CONTADOR");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                
                if (contador <= 99) {
                    System.out.println("Seu número é " + contador + ", ou seja, ele é menor que 100\nEntão, vamos contar:");
                    while (contador <= 99) {
                        System.out.println(contador);
                        contador += 1;
                    }
                } else {
                    System.err.println("Seu número é maior que 100");
                }
        */

        int bottlesNum = 10;
        String word = "bottles";

        while (bottlesNum > 0) {

            if (bottlesNum == 1) {
                word = "bottle";
            }

                System.out.println(bottlesNum + " green " + word + " hanging on the wall,");
                System.out.println(bottlesNum + " green " + word + " hanging on the wall,");
                System.out.println("And if one green bottle should accidentally fall,");
                bottlesNum = bottlesNum - 1;

            if (bottlesNum > 0) {

                System.out.println("There'll be " + bottlesNum + " green " + word + " hanging on the wall.\n ");
            } else {
                System.out.println("There'll be no green bottles hanging on the wall.");
            }
        }
    }
}