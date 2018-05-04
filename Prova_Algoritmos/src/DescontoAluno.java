
public abstract class DescontoAluno implements CalculoDeDesconto {
	
	@Override
	public Double aplicaDesconto(Produto proSelec) {
		Double descontado = 0.0;
		descontado = proSelec.getPreco()-(proSelec.getPreco()*0.15);
		
		return descontado;
	}

}
