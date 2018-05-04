
public class Carrinho_Compras {
	private Produto produtos[] = new Produto[10];
	
	public Produto[] getProdutos() {
		return produtos;
	}
	public Carrinho_Compras() {
		
	}
	public void setProdutos(Produto produto) {
		int id = 0;
		while(true) {
			if(produtos[id]==null) {
				break;
			}
			id++;
		}
		this.produtos[id] = produto;
		
	}
	public void retirar(Produto prod) {
		for(Produto p : produtos) {
			if(p==prod) {p=null;}
		}
		
	}
	public Double calculaTotal() {
		Double total =0.0;
		for(Produto p : produtos) {
			total+=p.getPreco();
		}
		return total;
		
	}
}
