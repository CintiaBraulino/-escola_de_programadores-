
public class Principal {

	public static void main(String[] args)
	{
		Aluno a1=new Aluno();
		a1.setNome("Joana");
		System.out.println("Nome da aluna: "+a1.getNome());
		a1.setCelular(9999999);
		System.out.println("Contato: "+a1.getCelular());
		
		System.out.println("\n");
		
		Universitario u1=new Universitario();
		u1.setNome("Maria");
		System.out.println("Nome da aluna: "+u1.getNome());
		u1.setCelular(89898989);
		System.out.println("Contato: "+u1.getCelular());
		u1.setCurso("Turismo");
		System.out.println("Curso: "+u1.getCurso());
		u1.setIdentificacao("0009T");
		System.out.println("Id: "+u1.getIdentificacao());
		
		System.out.println("\n");
		
		UniversitarioPublico u2=new UniversitarioPublico("Bem vindo a universidade publica");
		u2.setNome("Janaina");
		System.out.println("Nome da aluna: "+u2.getNome());
		u2.setCelular(97957880);
		System.out.println("Contato: "+u2.getCelular());
		u2.setCurso("Redes de computadores");
		System.out.println("Curso: "+u2.getCurso());
		u2.setIdentificacao("0001R");
		System.out.println("Id: "+u2.getIdentificacao());
		u2.setNotaIra(9.5);
		System.out.println("Seu Ira e: "+u2.getNotaIra());
		
		System.out.println("\n");
		
		UniversitarioParticular u3=new UniversitarioParticular("Bem vindo a universidade particular");
		u3.setNome("Paula");
		System.out.println("Nome da aluna: "+u3.getNome());
		u3.setCelular(97547744);
		System.out.println("Contato: "+u3.getCelular());
		u3.setCurso("Contabilidade");
		System.out.println("Curso: "+u3.getCurso());
		u3.setIdentificacao("0007C");
		System.out.println("Id: "+u3.getIdentificacao());
		u3.setMensalidade(490);
		System.out.println("Sua mensalidade e: "+u3.getMensalidade());
		
		
		
	}

}
