package leitorarquivo;

public class Produtos implements Comparable<Produtos>  {

	private String nome;
	private Double preco;
	
	public Produtos() {
	
	}
	
	public Produtos(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public int compareTo(Produtos o) {
	
		return preco.compareTo(o.getPreco());
	}

	@Override
	public String toString() {
		return "Produtos [nome=" + nome + ", preco=" + preco + "]";
	}
	
}
