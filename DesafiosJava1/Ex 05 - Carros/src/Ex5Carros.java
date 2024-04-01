public class Ex5Carros {

    private String marca;
    private String modelo;
    private int ano;
    private double velocidade;

    public Ex5Carros(String marca, String modelo, int ano, double velocidade){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
    }

    public void acelerar(double velocidade) {
        this.velocidade += velocidade;
    }

    public void frear(double velocidade) {
        this.velocidade -= velocidade;
    }

    public String toString(){
        return "Carro: " + marca + " " + modelo + ", " + ano + ". Velocidade atual: " + velocidade + " km/h.";
    }
}
