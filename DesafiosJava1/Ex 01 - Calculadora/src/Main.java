// import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Scanner;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Bem vindo a calculadora!");
    System.out.println("Qual operação deseja realizar?");

    System.out.println("1 - Soma");
    System.out.println("2 - Subtração");
    System.out.println("3 - Multiplicação");
    System.out.println("4 - Divisão");

    int opcao = sc.nextInt();

    while (opcao > 4 || opcao < 1){
      System.out.println("Opção inválida, tente novamente.");
      opcao = sc.nextInt();
    }

    System.out.println("Insira o valor de a:");
    int a = sc.nextInt();
    System.out.println("Insira o valor de b");
    int b = sc.nextInt();

    switch (opcao){
      case 1: 
        System.out.println("Resultado: " + Calculadora.soma(a, b));
        break;

      case 2:
        System.out.println("Resultado: " + Calculadora.subtracao(a, b));
        break;

      case 3:
        System.out.println("Resultado: " + Calculadora.multiplicacao(a, b));
        break;

      default: 
        System.out.println("Resultado: " + Calculadora.divisao(a, b));
        break;
    }
    
    sc.close();
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}