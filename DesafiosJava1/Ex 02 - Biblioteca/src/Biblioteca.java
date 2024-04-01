public class Biblioteca {
  public String titulo;
  public String autor;
  public int ano;

  public Biblioteca(String titulo, String autor, int ano) {
    this.titulo = titulo;
    this.autor = autor;
    this.ano = ano;
  }

  public String toString() {
    return titulo + ", " + autor + ", " + ano;
  }

}