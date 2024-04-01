import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Numero de jogadores a serem registrados: ");
        int n = sc.nextInt();

        Perfil[] v = new Perfil[n];

        for (int i = 0; i < n; i++){
            System.out.println("Digite o nome: ");
            String nome = sc.next();
            System.out.println("Digite a pontuação: ");
            int pontuacao = sc.nextInt();
            System.out.println("Digite o nível: ");
            int lvl = sc.nextInt();
            v[i] = new Perfil(nome, pontuacao, lvl);
        }

        for (int i = 0; i < n; i++){
            System.out.println("Valor atualizado da pontuação: ");
            v[i].setPontuacao(sc.nextInt());
            System.out.println("Nivel do jogador atualizado: ");
            v[i].setLvl(sc.nextInt());
        }

        for (Perfil obj : v){
            System.out.println(obj);
        }

        sc.close();
    }
}
