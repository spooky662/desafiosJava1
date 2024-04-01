public class ContaBancaria {

  private int numeroConta;
  private String nomeTitular;
  private double saldo;

  public ContaBancaria(String nomeTitular, double saldo, int numeroConta) {
  this.nomeTitular = nomeTitular;
  this.saldo = saldo;
  this.numeroConta = numeroConta;
  }

  public String getNome() {
    return nomeTitular;
  }

  public void setNome(String nomeTitular){
    this.nomeTitular = nomeTitular;
  }

  public int getNumero() {
    return numeroConta;
  }

  public void setNumero(int numeroConta){
    this.numeroConta = numeroConta;
  }

  public double getSaldo() {
    return saldo;
  }

  public void depositar (double valor){
    saldo += valor;
  }

  public void sacar (double valor){
    saldo -= valor;
  }

  public String toString(){
    return "Numero da Conta: " + numeroConta + ", Nome: " + nomeTitular + ", Saldo: " + saldo;
  } 

}