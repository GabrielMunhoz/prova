
public abstract class DescontoAcima5Intens implements CalculoDeDesconto {

	@Override
	public Double aplicaDesconto(Produto proSelec) {
		Double descontado = 0.0;
		descontado = proSelec.getPreco()-(proSelec.getPreco()*0.20);
		
		return descontado;
	}

}
