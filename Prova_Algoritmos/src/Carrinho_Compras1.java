import java.util.Scanner;

public class Carrinho_Compras1 {
	private static Produto lista[]= new Produto[5];
	private Produto prodAdic[] = new Produto[5];
	public static void getLista() {
		lista[0] = new Produto("Massa",3.50,"p1");
		lista[1] = new Produto("feijao",3.00,"p2");
		lista[2] = new Produto("arroz",4.50,"p3");
		lista[3] = new Produto("amendoin",2.50,"p4");
		lista[4] = new Produto("sardinha",2.25,"p5");
		for(Produto prod : lista) {
			System.out.println(prod.getNome());
		}
	}
	public static Double calculaTotal(Produto[] pro) {
		Double total=0.0;
		for(Produto p : pro) {
			total+=p.getPreco();
			}
		return total;
	}
	public void adicionaProduto() {
		int i=0;
		for(Produto p:lista) {
			System.out.println("Posição ["+i+"]"+p.getNome());
			i++;
		}
		
		int id = 0;
		while(true) {
			System.out.println("Adicionar? 1[sim]0[nao]");
			if(new Scanner(System.in).nextInt()==0) {break;}
			System.out.println("Digite a posição que deseje adicionar: ");
			prodAdic[id++] = lista[new Scanner(System.in).nextInt()];
		}
	}
	public void retirar() {
		 
	}
	
}
