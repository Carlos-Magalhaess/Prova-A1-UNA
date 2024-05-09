import java.util.Scanner;

  public class provaa1 {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

       int numerosPares = 0;
       int numerosImpares = 0;
       int numerosMultiplosDe5 = 0;

    System.out.println("Insira um número inteiro positivo (ou um número negativo para sair): ");
       int numero = scanner.nextInt();

       while (numero >= 0) {
       if (numero % 2 == 0) {
       numerosPares++;
       } else {
       numerosImpares++;
       }
       if (numero % 5 == 0) {
       numerosMultiplosDe5++;
    }

    System.out.println("Insira um número inteiro positivo (ou um número negativo para sair): ");
    numero = scanner.nextInt();
  }

    System.out.println("\nResultados:");
    System.out.println("Números pares: " + numerosPares);
    System.out.println("Números ímpares: " + numerosImpares);
    System.out.println("Múltiplos de 5: " + numerosMultiplosDe5);

        scanner.close();
   }
}