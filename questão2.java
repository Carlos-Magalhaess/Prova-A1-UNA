import java.util.Scanner;

public class questão2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite dois números:");
        double numero1 = scanner.nextDouble();
        double numero2 = scanner.nextDouble();
        
        int opcao;
        
        do {
        System.out.println("\nEscolha uma opção:");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Sair");
        System.out.print("Opção: ");
            
        opcao = scanner.nextInt();
            
        switch (opcao) {
         case 1:
        System.out.println("Resultado da soma: " + (numero1 + numero2));
         break;
         case 2:
        System.out.println("Resultado da subtração: " + (numero1 - numero2));
         break;
         case 3:
        System.out.println("Resultado da multiplicação: " + (numero1 * numero2));
         break;
         case 4:
        if (numero2 != 0) {
        System.out.println("Resultado da divisão: " + (numero1 / numero2));
    }   else {
        System.out.println("Não é possível dividir por zero.");
        }
         break;
        case 5:
        System.out.println("Saindo");
         break;
           default:
        System.out.println("Opção inválida! Escolha outra opção...");
            }
        } while (opcao != 5);
        
        scanner.close();
    }
}