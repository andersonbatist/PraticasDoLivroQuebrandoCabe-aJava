public class GuessGame {
    //O GuessGame tem três variáveis de instância para os três objetos 'Player'
    Player p1;
    Player p2;
    Player p3;

    //Cria três objetos 'Player' e os atribui às três variáveis de instância 'Player'
    public void StartGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        //Declara três variáveis para armazenar os três palpites feitos pelos jogadores
        int guessP1 = 0;
        int guessP2 = 0;
        int guessP3 = 0;

        //Declara três variáveis para armazenar um valor Verdadeiro ou Falso com base na resposta do jogador
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        //Cria um número 'alvo' que nesse caso será um número aleatório que os jogadores têm que adivinhar
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Estou pensando em um número de 0 a 9...");





        while (true) {
            System.out.println("O número correto é: " + targetNumber);

            //Chama o método guess() de cada jogador
            p1.guess();
            p2.guess();
            p3.guess();

            //Recebe o palpite de cada jogador (o resultado da execução do método guess() que virmos anteriormente) acessando a variável do palpite de cada jogador
            guessP1 = p1.number;
            System.out.println("Palpite do PRIMEIRO jogador é: " + guessP1);
            
            guessP2 = p2.number;
            System.out.println("Palpite do SEGUNDO jogador é: " + guessP2);
            
            guessP3 = p3.number;
            System.out.println("Palpite do TERCEIRO jogador é: " + guessP3);
            
        
         
            //Verifica o palpite de cada jogador para ver se corresponde ao 'Alvo' que foi gerado de forma aleatória. Se um jogador acertar. define a variável desse 
            //jogador como Verdadeira (Lembre-se, definimos como Falsas por padrão)
            if (guessP1 == targetNumber) {
                p1isRight = true;
            }
            if (guessP2 == targetNumber) {
                p2isRight = true;
            }if (guessP3 == targetNumber) {
                p3isRight = true;
            }

            //Se quyalquer um dos jogadores acertar (o operador || significa OU) o jogo acaba. Caso contrário, o jogo continua execultando o loop até que alguém acerte
            if (p1isRight || p2isRight || p3isRight ) {
                System.out.println("Temos um vencedor!");
                System.out.println("O JOGADOR 1 está certo?" + p1isRight);
                System.out.println("O JOGADOR 2 está certo?" + p2isRight);
                System.out.println("O JOGADOR 3 está certo?" + p3isRight);
                System.out.println("FIM DE JOGO!");
                //Aqui deveria ter o break; mas vou deixar sem pra ver o que acontece 
                break;
                // OBS: Acabei adicionando, porque sem ele, mesmo que um jogador acerte, vai ficar num loop infinito
            } else {
                //Caso ninguem acerte, o jogo irá se repetir
                System.out.println("ninguém acertou. Jogadores, tentem de novo!");
            }
        }
    }
}
