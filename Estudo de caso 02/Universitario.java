
public class Universitario  extends Aluno
{
	private String curso;
	private String identificacao;
	
	Universitario()
	{
		System.out.println("Bem vindo a vida academica");
	}
	public String getCurso() 
	{
		return curso;
	}
	public void setCurso(String curso) 
	{
		this.curso = curso;
	}
	public String getIdentificacao() 
	{
		return identificacao;
	}
	public void setIdentificacao(String identificacao) 
	{
		this.identificacao = identificacao;
	}
	
	

}
