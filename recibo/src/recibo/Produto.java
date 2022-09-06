package recibo;

public class Produto {
String nome;
double preco;

//construtor
public Produto(String nome, double preco) {
    this.nome = nome;
    this.preco = preco;
}

//GETTERS E SETTERS
public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}
public double getPreco() {
    return preco;
}
public void setPreco(double preco) {
    this.preco = preco;
}

//TO STRING 
@Override
public String toString() {
    return "Nome:" + this.getNome() + " | Preço: " + this.getPreco();
}

}