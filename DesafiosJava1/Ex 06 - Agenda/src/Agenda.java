import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Agenda {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List <Contato> lista = new ArrayList<>();
        System.out.println("Deseja adicionar um usuario a lista? s/n");
        char n = sc.next().charAt(0);
        while(n == 's'){
            sc.nextLine();
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Telefone: ");
            int telefone = sc.nextInt();
            System.out.println("Deseja adicionar mais um usuario a lista? s/n");
            n = sc.next().charAt(0);
            lista.add(new Contato(nome, telefone));
        }

        System.out.println("Deseja encontrar um usuario na lista? s/n");
        n = sc.next().charAt(0);

        while(n == 's'){
            sc.nextLine();
            System.out.println("Nome da pessoa: ");
            System.out.println("Contato: " + lista.indexOf(sc.nextLine()));
            System.out.println("Deseja encontrar outro usuario na lista? s/n");
            n = sc.next().charAt(0);
        }

        System.out.println("Lista de contatos: ");
        for (Contato obj : lista) {
			System.out.println(obj);
		}

        sc.close();
    }
}
