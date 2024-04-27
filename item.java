package aula12;

public class Item {
	
	String joy;
	int quantidade;
	double preco;
	

	public Item(String joy, int quantidade, double preco) {
		this.joy = joy;
		this.quantidade =  quantidade;
		this.preco = preco;
	}
	

	public String toString() {
		return "Item: " + joy + " Quantidade: " + quantidade + " Preço (R$): " + String.format("%.2f", preco);
	}
}
