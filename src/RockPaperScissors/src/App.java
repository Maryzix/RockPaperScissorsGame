import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int vitorias = 0;
        int derrotas = 0;
        int empates = 0;

        while (true) {

            System.out.println("\n=== PEDRA, PAPEL E TESOURA ===");
            System.out.println("1 - Pedra");
            System.out.println("2 - Papel");
            System.out.println("3 - Tesoura");
            System.out.print("Escolha uma opção: ");

            int jogador = scanner.nextInt();

            int computador = random.nextInt(3) + 1;

            // Mostrar escolha do jogador
            System.out.print("Você escolheu: ");
            switch (jogador) {
                case 1:
                    System.out.println("Pedra");
                    break;
                case 2:
                    System.out.println("Papel");
                    break;
                case 3:
                    System.out.println("Tesoura");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    continue;
            }

            // Mostrar escolha do computador
            System.out.print("Computador escolheu: ");
            switch (computador) {
                case 1:
                    System.out.println("Pedra");
                    break;
                case 2:
                    System.out.println("Papel");
                    break;
                case 3:
                    System.out.println("Tesoura");
                    break;
            }

            // Verificar resultado
            if (jogador == computador) {
                System.out.println("Empate!");
                empates++;

            } else if (
                    (jogador == 1 && computador == 3) ||
                            (jogador == 2 && computador == 1) ||
                            (jogador == 3 && computador == 2)
            ) {
                System.out.println("Você venceu!");
                vitorias++;

            } else {
                System.out.println("Computador venceu!");
                derrotas++;
            }

            // Mostrar placar
            System.out.println("\n=== PLACAR ===");
            System.out.println("Vitórias: " + vitorias);
            System.out.println("Derrotas: " + derrotas);
            System.out.println("Empates: " + empates);

            // Perguntar se quer continuar
            System.out.println("\nJogar novamente?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");

            int continuar = scanner.nextInt();

            if (continuar == 2) {
                break;
            }
        }

        System.out.println("\n Obrigado por jogar!");
        scanner.close();
    }
}

