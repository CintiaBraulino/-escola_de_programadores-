
public class UniversitarioParticular extends Universitario 
{
	private double mensalidade;

	UniversitarioParticular(String n)
	{
		System.out.println(n);
	}
	public double getMensalidade() 
	{
		return mensalidade;
	}

	public void setMensalidade(double mensalidade) 
	{
		this.mensalidade = mensalidade;
	}
	
	

}
