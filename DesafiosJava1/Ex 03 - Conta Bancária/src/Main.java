// import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Quantas contas deseja criar: ");
    int n = sc.nextInt();

    ContaBancaria[] contas = new ContaBancaria[n];

    for (int i = 0; i < n; i++){
      System.out.println("Digite o nome do titular da conta: ");
      String nome = sc.next();
      System.out.println("Digite o saldo da conta: ");
      double saldo = sc.nextDouble();
      System.out.println("Digite o número da conta: ");
      int numero = sc.nextInt();
      contas[i] = new ContaBancaria(nome, saldo, numero);
    }

    for (int i = 0; i < n; i++){
      System.out.println("Valor a ser depositado na conta " + contas[i].getNumero() + ": ");
      double valor = sc.nextDouble();
      contas[i].depositar(valor);
      System.out.println("Valor a ser sacado da conta + " + contas[i].getNumero() + ": ");
      valor = sc.nextDouble();
      contas[i].sacar(valor);
    }

    for(ContaBancaria obj : contas){
    System.out.println(obj);
    }
    
    sc.close();
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}