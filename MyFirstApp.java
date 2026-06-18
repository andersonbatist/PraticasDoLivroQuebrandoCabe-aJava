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

        /*

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
        */

        //Juntando pedaços de código (CODIGO CORRIGIDO DO EXERCÍCIO)

        /*  int x =  3;

            while (x > 0) {
                if (x > 2) {
                    System.out.print("a");
                }
                x = x - 1;
                System.out.print("-");

                if (x == 2) {
                    System.out.print("b c");
                }
                if (x == 1) {
                    System.out.print("d");
                    x = x - 1;
                }
            }

        */

       //Juntando pedaços de código (MEU CÓDIGO, QUE FICOU ERRADO)

        /*
            int x = 3;
            if (x>2) {
                    System.out.print("a");
                }

            while (x>0) {
                    x = x - 1;
                    System.out.print("-");

                    if (x == 2) {
                        System.out.print("b c");
                    }
                }

                if (x == 1) {
                    System.out.print("d");
                    x = x - 1;
                }   
        */

       //Juntando pedaços de código (MEU CÓDIGO, SÓ QUE AGORA EU CORRIGI E COLOQUE O if (x == 1) DENTRO DO WHILE)

       /*
            int x = 3;

            if (x>2) {
                System.out.print("a");
            }

            while (x>0) {
                x = x - 1;
                System.out.print("-");

                if (x == 2) {
                    System.out.print("b c");
                }

                if (x == 1) {
                    System.out.print("d");
                    x = x - 1;
                }   
            }
        */

        //Testando um while e uma correção pra ele não ficar infinito

        /*            int x = 1;
            
            while (x < 10) {
                if ( x> 3) {
                    System.out.println("big x");
                }
            }
          
        */

        //Exercícios com blocos de comandos

        /*  
            int x = 0;
            int y = 0;

            while (x < 5) {
                if (y < 5) {
                    x = x + 1;
                    if (y < 3) {
                        x = x -1;

                    }
                }
                y = y + 2;
                System.out.print(x + "" + y + "");
                x = x +1;
            }
        */

        int x = 0;
            
        while (x < 4) {
            System.out.print("a");

            if (x < 1) {
                System.out.print("n");
            }

            System.out.print("noise");

            if (x > 0) {
                 System.out.print("annoys");
              }

             x = x -1;

            if (x == 1) {
             System.out.print("an");
            }

            if (x > 0) {
                System.out.print("oyster");
            }

            System.out.println();

            x = x + 2;


        }
        


    }
}