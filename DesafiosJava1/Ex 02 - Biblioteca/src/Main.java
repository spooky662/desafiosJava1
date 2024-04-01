// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    List<Biblioteca> livros = new ArrayList<Biblioteca>();

    System.out.println("Quantos livros deseja cadastrar?");
    int qtd = sc.nextInt();

    sc.nextLine();

    for (int i = 0; i < qtd; i++) {
      System.out.println("Digite o titulo do livro: ");
      String titulo = sc.nextLine();
      System.out.println("Digite o autor do livro: ");
      String autor = sc.nextLine();
      System.out.println("Digite o ano do livro: ");
      int ano = sc.nextInt();

      sc.nextLine();

      Biblioteca livro = new Biblioteca(titulo, autor, ano);
      livros.add(livro);
    }

    System.out.println("Lista de livros: ");

    for(Biblioteca obj : livros){
    System.out.println(obj);
    }
    
    sc.close();
  }
}

// @Test
// void addition() {
// assertEquals(2, 1 + 1);
// }
