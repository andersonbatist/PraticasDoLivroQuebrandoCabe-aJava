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

        //Esse é aquele aplicativo pra cantar aquela música em inglês
        //Não entendi o que era pra corrigir, mas eu coloquei algo pra pular as linhas e deixar os parágrafos.

        /*
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

        */

        //Programa do Orador

        String [] wordListOne = {"Voz ativa", "Voz passiva", "Voz reflexiva", "Voz recíproca", "Voz impessoal", "Voz reflexiva recíproca"};

        String [] wordListTwo = {"Eu tenho", "Tu tens", "Ele tem", "Nós temos", "Vós tendes", "Eles têm"};

        String [] wordListThree = {"Muito boa", "Boa", "Razoável", "Ruim", "Muito ruim"};


        int wordInListOne = wordListOne.length;
        int wordInListTwo = wordListTwo.length;
        int wordInListThree = wordListThree.length;

        java.util.Random randomGenerator = new java.util.Random();
        int NumAleatorio = randomGenerator.nextInt(wordInListOne);
        int NumAleatorio2 = randomGenerator.nextInt(wordInListTwo);
        int NumAleatorio3 = randomGenerator.nextInt(wordInListThree);

        String frase = wordListOne[NumAleatorio] + " " + wordListTwo[NumAleatorio2] + " " + wordListThree[NumAleatorio3];
        System.out.println(frase);

    }
}