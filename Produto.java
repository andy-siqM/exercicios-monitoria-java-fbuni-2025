package pratica;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade;

	// método construtor para inicializar atributos para criar objetos da classe
	public Produto (String nome, double preco, int quantidade) {
		// valores iniciais de cada objeto
		this.nome = nome;
		// método set no construtor evita criar objetos com valores inválidos
		setPreco(preco); 
		setQuantidade(quantidade);
	}
	
	// método público get para acessar valor do atributo privado nome
	public String getNome() {
		return nome;
	}
	
	// método público set para atualizar/modificar valor do atributo privado nome
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// método público get para acessar valor do atributo privado preço
	public double getPreco() {
		return preco;
	}
	
	// método público set para atualizar/modificar valor do atributo privado preço
	public void setPreco(double preco) {
		// se preço for negativo
		if (preco < 0) {
			this.preco = 0; // valor do preço será 0
		// caso não seja negativo
		} else {
			this.preco = preco;
		}
	}
		
	// método público get para acessar valor do atributo privado quantidade
	public int getQuantidade() {
		return quantidade;
	}
		
	// método público set para atualizar/modificar valor do atributo privado quantidade
	public void setQuantidade(int quantidade) {
		// se a quantidade for negativa
		if (quantidade < 0) {
			this.quantidade = 0; // a quantidade será 0
		} else {
			this.quantidade = quantidade;
		}
	}
}
