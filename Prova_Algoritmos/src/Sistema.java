
public class Sistema {

	public static void main(String[] args) {
		Produto prod[] = new Produto[10];
		prod[0] = new Produto("Calca",17.50,"p1");
		prod[1] = new Produto("Jaqueta",200.0,"p2");
		prod[2] = new Produto("camisa",300.0,"p1");
		
		Carrinho_Compras carrinho = new Carrinho_Compras();
		carrinho.setProdutos(prod[0]);
		carrinho.setProdutos(prod[1]);
		carrinho.setProdutos(prod[2]);
		while(true) {
			switch(dInt("Inserir ou remover: [0]n [1]s"))
		}
		

	}

}
