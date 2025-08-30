import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String[] tabelaJogos = new String[18];

        // Podese utilizar isso varias vezes, ate dar 18
        // Mas como são muitos, podemos fazer um laco de repeticao

        /*System.out.println("Informe o resultado da 1ª rodada");
        tabelaJogos[0] = sc.next();

        System.out.println("Informe o resultado da 2ª rodada");
        tabelaJogos[1] = sc.next();*/


        // for (variavel; controle; condicao; incremento)
        // a parte de incremento nao é obrigatoria, podese fazer manualmente
        // i seria a variavel de for
        // int = i + 1; é igual a i++
        for (int i = 0; i < 18; i++){

            System.out.println("Informe o resultado da "+ (i+1) +"ª rodada");
            tabelaJogos[i] = sc.next();
            
        }
    }
}

