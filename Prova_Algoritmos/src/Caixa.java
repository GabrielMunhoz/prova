
public class Caixa {
	private Produto produtos[] = new Produto[10];
	private Carrinho_Compras carrinho = new Carrinho_Compras();
	private DescontoAluno descAluno;
	private DescontoAcima5Intens desc5Itens;
	private int quantidade;
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Produto[] getProdutos() {
		return produtos;
		
	}

	public void setProdutos() {
		produtos = carrinho.getProdutos();
	} 
	public void descontoaAluno(Produto[] p) {
		for(Produto pr : p) {
			descAluno.aplicaDesconto(pr);
		}
	}
	public void descontoaAcima5Itens(Produto[] p) {
		if(p.length>5) {
		for(Produto pr : p) {
			desc5Itens.aplicaDesconto(pr);
		}
		}
		else {
			System.out.println("Não é possivel aplicar desconto com essa quantidade de itens");
		}
	}
	
}
