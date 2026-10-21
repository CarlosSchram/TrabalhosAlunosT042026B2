package objetos;
public class Aluno {
	
	String nome;
	int idade;
	double nota;

	public void verificarSituacao() {
		if (nota>=6) {
			System.out.println("Parabéns "+nome+" você foi aprovado!");
			System.out.println("Sua nota: "+nota);
		} else {
			System.out.println("Que pena betinha "+nome+"... Você reprovou");
			System.out.println("Sua nota: "+nota);
		}
	}

	public void setIdade(int nextInt) {
		// TODO Auto-generated method stub
		
	}

	public void setNota(double nextDouble) {
		// TODO Auto-generated method stub
		
	}

	public void setNome(String nextLine) {
		// TODO Auto-generated method stub
		
	}

}
