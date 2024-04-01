import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Quantos carros deseja registrar: ");
        int n = sc.nextInt();
        Ex5Carros[] v = new Ex5Carros[n];

        for (int i = 0; i < n; i++){
            sc.nextLine();
            System.out.println("Digite a marca: ");
            String marca = sc.nextLine();
            System.out.println("Digite o modelo: ");
            String modelo = sc.nextLine();
            System.out.println("Digite o ano: ");
            int ano = sc.nextInt();
            System.out.println("Digite a velociade atual: ");
            double velocidade = sc.nextDouble();
            v[i] = new Ex5Carros(marca, modelo, ano, velocidade);
        }

        char resposta = 's';
        sc.nextLine();

        do{
            System.out.println("Mudar a velocidade de algum carro? s/n");
            resposta = sc.next().charAt(0);
            if (resposta == 'n'){
                break;
            }
            System.out.println("Qual carro quer mudar a velocidade?");
            int r2 = sc.nextInt();
            System.out.println("1 - Acelerar\n2 - Frear");
            int r3 = sc.nextInt();
            switch (r3) {
                case 1:
                    System.out.println("Valor a ser acrescentado: ");
                    double r4 = sc.nextDouble();
                    v[r2].acelerar(r4);
                    break;
            
                default:
                    System.out.println("Valor a ser removido: ");
                    double r5 = sc.nextDouble();
                    v[r2].frear(r5);
                    break;
            }
        }while (resposta != 'n');

        for (Ex5Carros obj : v){
            System.out.println(obj);
        }

        sc.close();
    }
}
