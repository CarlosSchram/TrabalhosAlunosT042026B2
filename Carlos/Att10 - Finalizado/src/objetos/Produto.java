package objetos;

public class Produto {
	String nome;
	double preco;
	int quantidade;
	public String setNome;
	public double setPreco;
	public int setQuantidade;


	public void calcularTotal() {
		System.out.println("O total da sua compra é:");
		System.out.println("---- "+preco*quantidade+" ----");
	}

	public void setNome(String nome) {
	    this.nome = nome;
	}

	public void setPreco(double preco) {
	    this.preco = preco;
	}

	public void setQuantidade(int quantidade) {
	    this.quantidade = quantidade;
	}
}
