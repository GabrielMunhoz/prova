
public class Produto {
	private double preco;
	private String nome;
	private String sku;
	
	public Produto(String nome,double preco, String sku) {
		this.preco = preco;
		this.nome = nome;
		setSku(sku);
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String str) {
		if(str.length()<=10) {
			sku=str;
		}else {
		System.out.println("SKU deve conter apenas 10 caracteres.");
		}
	 	
	}		
}