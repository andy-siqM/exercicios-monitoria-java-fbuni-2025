package pratica;

public class TesteProduto {

	public static void main(String[] args) {
		Produto produto = new Produto("X-Box", 2000.00, 30);
		System.out.println("Nome antigo: " + produto.getNome());
		// Saída: Nome antigo: X-Box
		produto.setNome("PS4"); // Modificação do valor da variável nome
		System.out.println("Nome novo: " + produto.getNome()); 
		// Saída: Nome novo: PS4
		
		System.out.println("Preço antigo: " + produto.getPreco());
		// Saída: Preço antigo: 2000.00
		produto.setPreco(-4000.00); // Modificação do valor da variável preco
		System.out.println("Preço novo: " + produto.getPreco());
		// Saída: Preço novo: 0.0
		// Preço é 0.0 porque valor da variável é negativo
		
		System.out.println("Quantidade antiga: " + produto.getQuantidade());
		// Saída: Quantidade antiga: 30
		produto.setQuantidade(-5); // Modificação do valor da variável preco
		System.out.println("Quantidade nova: " + produto.getQuantidade());
		// Saída: Quantidade nova: 0
		// Quantidade é 0 porque valor da variável é negativo
		
	}
}
