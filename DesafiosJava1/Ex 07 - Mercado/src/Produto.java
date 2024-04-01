public class Produto {
    private String nome;
    private int codigo;
    private int quantidade;
    private double preco;

    public Produto(String nome, int codigo, int quantidade, double preco){
        this.nome = nome;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void acrescentar(int quantidade) {
        this.quantidade += quantidade;
    }

    public void subtrair(int quantidade) {
        this.quantidade -= quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String toString(){
        return "Nome: " + nome + ", codigo: " + codigo + ", quatidade: " + quantidade + ", preco: R$" + preco + ". Valor total: R$" + preco*quantidade;
    }
}
