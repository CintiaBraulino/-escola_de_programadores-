
public class Principal {

	public static void main(String[] args)
	{
		Produto p1=new Produto();//p1 é um objeto
		p1.cadastrarNome("celular");
		p1.cadastrarQuantidade(300);
		p1.cadastrarPrecoUnitario(800.50);
		p1.cadastrarquantidade("10/11/19");
		
		System.out.println("Nome do produto: "+p1.retornarNome());
		System.out.println("Quantidade do produto: "+p1.retornarQuantidade());
		System.out.println("Preco unitario do produto: "+p1.retornarPrecoUnitario());
		System.out.println("Data de fabricaco do produto: "+p1.retornarquantidade());
		
	}

}
