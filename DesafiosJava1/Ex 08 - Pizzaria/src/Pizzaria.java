import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Pizzaria {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List <Pedidos> lista = new ArrayList<>();
        System.out.println("Criar novo pedido? s/n");
        char n = sc.next().charAt(0);
        while(n == 's'){
            sc.nextLine();
            System.out.println("Sabor: Atum, Marguerita, Pepperoni ou Portuguesa?");
            String sabor = sc.nextLine();
            System.out.println("Tamanho: Pequeno, Medio ou Grande?");
            String tamanho = sc.nextLine();
            System.out.println("Valor: ");
            double valor = sc.nextDouble();
            sc.nextLine();
            System.out.println("Endereço: ");
            String endereco = sc.nextLine();
            System.out.println("Criar novo pedido? s/n");
            n = sc.next().charAt(0);
            lista.add(new Pedidos(sabor, tamanho, valor, endereco));
        }
        System.out.println("Lista de pedidos: ");
        for (Pedidos obj : lista) {
			System.out.println(obj);
		}
        System.out.println("Total de pedidos: " + lista.size());
        System.out.println("Valor médio: x");

        sc.close();
    }

}
