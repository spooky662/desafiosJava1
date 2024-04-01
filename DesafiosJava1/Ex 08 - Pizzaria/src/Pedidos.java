public class Pedidos {
    private String sabor;
    private String tamanho;
    private double valor;
    private String endereço;

    public Pedidos(String sabor, String tamanho, double valor, String endereço){
        this.tamanho = tamanho;
        this.sabor = sabor;
        this.valor = valor;
        this.endereço = endereço;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String toString(){
        return "Pedido: pizza " + tamanho + " sabor " + sabor + ", a ser entrege no endereço: " + endereço + ", valor a ser pago: R$" + valor; 
    }
}
