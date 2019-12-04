
public class Produto 
{
	String nome;
	int quantidade;
	double precoUnitario;
	String dataFabricacao;
	
	public void cadastrarNome(String nome)
	{
		this.nome=nome;
	}
	
	public void cadastrarQuantidade(int quantidade)
	{
		this.quantidade=quantidade;
	}
	
	public void cadastrarPrecoUnitario(double precoUnitario)
	{
		this.precoUnitario=precoUnitario;
	}
	
	public void cadastrarquantidade(String dataFabricacao)
	{
		this.dataFabricacao=dataFabricacao;
	}
	
	public String retornarNome()
	{
		return nome;
	}
	
	public int retornarQuantidade()
	{
		return quantidade;
	}
	
	public double retornarPrecoUnitario()
	{
		return precoUnitario;
	}
	
	public String retornarquantidade()
	{
		return dataFabricacao;
	}
}
