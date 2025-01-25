
import java.util.Scanner;
import java.util.Random;

public class adivinhaNumero {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1;
        int tentativas = 0;
        int palpite = 0;

        System.out.println("Tente adivinhar o número que o computador escolheu (entre 1 e 100)!");

        while (palpite != numeroAleatorio) {
            System.out.print("Digite um número: ");
            palpite = entrada.nextInt();
            tentativas++;

            if (palpite < numeroAleatorio) {
                System.out.println("O número é maior!");
            } else if (palpite > numeroAleatorio) {
                System.out.println("O número é menor!");
            } else {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
            }
        }

        entrada.close();
    }
}
