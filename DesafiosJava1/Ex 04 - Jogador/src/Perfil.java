public class Perfil {

    private String nome;
    private int pontuacao;
    private int lvl;

    public Perfil(String nome, int pontuacao, int lvl){
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.lvl = lvl;
    }

    public String getNome() {
        return nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
    
    public String toString(){
        return "Nome do jogador: " + nome + ", pontuação: " + pontuacao + ", nível: " + lvl;
    }
}
