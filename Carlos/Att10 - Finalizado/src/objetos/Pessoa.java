package objetos;

import java.util.Scanner;

public class Pessoa {
	String nome;
	int idade;
	

	public void apresentar() {
		System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos");
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();
		System.out.println("Digite seu nome:");
		pessoa.nome = scan.nextLine();
		
		System.out.println("Insira sua idade:");
		pessoa.idade = scan.nextInt();
		
		pessoa.apresentar();
		scan.close();
	}

	public void setNome(String nextLine) {
		// TODO Auto-generated method stub
		
	}

	public void setIdade(int nextInt) {
		// TODO Auto-generated method stub
		
	}
	

}
	