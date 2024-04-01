import java.util.Scanner;

public class Mercado {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Quantos produtos deseja registrar: ");
        int n = sc.nextInt();
        Produto[] v = new Produto[n];

        for (int i = 0; i < n; i++){
            sc.nextLine();
            System.out.println("Digite o nome: ");
            String nome = sc.nextLine();
            System.out.println("Digite o codigo: ");
            int codigo = sc.nextInt();
            System.out.println("Digite a quantidade: ");
            int quantidade = sc.nextInt();
            System.out.println("Digite o preco: ");
            double preco = sc.nextDouble();
            v[i] = new Produto(nome, codigo, quantidade, preco);
        }

        char resposta = 's';

        do{
            System.out.println("Alterar a quantidade de algum produto? s/n");
            resposta = sc.next().charAt(0);
            if (resposta == 'n'){
                break;
            }
            System.out.println("Qual produto quer alterar a quantidade?");
            int r2 = sc.nextInt();
            System.out.println("1 - Acrescentar\n2 - Subtrair");
            int r3 = sc.nextInt();
            switch (r3) {
                case 1:
                    System.out.println("Valor a ser acrescentado: ");
                    int r4 = sc.nextInt();
                    v[r2].acrescentar(r4);
                    break;
            
                default:
                    System.out.println("Valor a ser removido: ");
                    int r5 = sc.nextInt();
                    v[r2].subtrair(r5);
                    break;
            }
        }while (resposta != 'n');

        System.out.println("Lista de produtos: ");
        for (Produto obj : v){
            System.out.println(obj);
        }

        sc.close();
    }
}
