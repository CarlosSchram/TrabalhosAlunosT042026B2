import java.util.Scanner;

import objetos.Aluno;
import objetos.Carro;
import objetos.Pessoa;
import objetos.Produto;
import objetos.ContaBancaria;
import objetos.Livro;
import objetos.Funcionario;
import objetos.Retangulo;
import objetos.Celular;
import objetos.PessoaDois;

public class Principal {

	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
			attDez();
	}
	
	public static void attUm() {
		Pessoa pessoa = new Pessoa();
		System.out.println("Digite seu nome:");
		pessoa.setNome (scan.nextLine());
		System.out.println("Insira sua idade:");
		pessoa.setIdade (scan.nextInt());
		
		pessoa.apresentar();
	}
	
	public static void attDois() {
		
		Carro carro = new Carro();
		
		System.out.println("Informe a Marca do carro:");
		carro.setMarca (scan.nextLine());
		System.out.println("Informe o Modelo do carro:");
		carro.setModelo (scan.nextLine());
		System.out.println("Informe o Ano do carro:");
		carro.setAno (scan.nextInt());

		carro.exibirDados();
		}
	
	public static void attTres() {
		Aluno aluno = new Aluno();
		
		System.out.println("Insira seu nome: ");
		aluno.setNome (scan.nextLine());
		System.out.println("Insira sua idade: ");
		aluno.setIdade (scan.nextInt());
		System.out.println("Insira sua Nota: ");
		aluno.setNota (scan.nextDouble());
		
	aluno.verificarSituacao();	
	}
	
	
	public static void attQuatro() {
		Produto produto = new Produto();
		System.out.println("Insira o nome do produto: ");
		produto.setNome(scan.nextLine());
		System.out.println("Informe o preço produto: ");
		produto.setPreco(scan.nextDouble());
		System.out.println("Insira a quantidade: ");
		produto.setQuantidade(scan.nextInt());
		
	produto.calcularTotal();		
	}

	public static void attCinco(){
		ContaBancaria user = new ContaBancaria();
		System.out.println("Insira o nome do titular: ");
		user.setTitular(scan.nextLine());
		int opcao;
		do {
		System.out.println("");
		System.out.println("Selecione a opção que deseja acessar");
		System.out.println("------------------------------------");
		System.out.println("1- Depositar");
		System.out.println("2- Sacar");
		System.out.println("3- Exibir saldo");
		System.out.println("4- Sair");
		System.out.println("------------------------------------");
		System.out.println("");
		opcao = scan.nextInt();
		scan.nextLine();
		if (opcao==1) {
			System.out.println("Insira o valor (com virgula) que deseja depositar: ");
			double valor = scan.nextDouble();
			scan.nextLine();
			user.depositar(valor);
		} else if (opcao==2){
			System.out.println("Insira o valor (com virgula) que deseja Sacar: ");
			double valor = scan.nextDouble();
			user.sacar(valor);
		} else if (opcao==3){
			user.exibirSaldo();
		} else if (opcao==4){
			System.out.println("Encerrando sistema! Ate logo ");
		} else {
			System.out.println("Opção invalida! Tente novamente");
		}
		
		} while (opcao!=4);
	}
	public static void attSeis() {
		Livro livro = new Livro();

		System.out.println("Insira o título do livro: ");
		livro.setTitulo(scan.nextLine());
		System.out.println("Insira o autor do livro: ");
		livro.setAutor(scan.nextLine());
		System.out.println("Insira o número de páginas: ");
		livro.setNumeroPaginas(scan.nextInt());
		scan.nextLine();

		int opcao;
		do {
			System.out.println("");
			System.out.println("Selecione a opção que deseja acessar");
			System.out.println("------------------------------------");
			System.out.println("1- Emprestar livro");
			System.out.println("2- Devolver livro");
			System.out.println("3- Exibir informações do livro");
			System.out.println("4- Sair");
			System.out.println("------------------------------------");
			System.out.println("");
			opcao = scan.nextInt();
			scan.nextLine();

			if (opcao == 1) {
				livro.emprestar();
			} else if (opcao == 2) {
				livro.devolver();
			} else if (opcao == 3) {
				livro.exibirInformacoes();
			} else if (opcao == 4) {
				System.out.println("Encerrando o sistema da biblioteca! Até logo.");
			} else {
				System.out.println("Opção inválida! Tente novamente.");
			}

		} while (opcao != 4);
	}
	public static void attSete() {
		Funcionario funcionario = new Funcionario();

		System.out.println("Insira o nome do funcionário: ");
		funcionario.setNome(scan.nextLine());
		System.out.println("Insira o cargo do funcionário: ");
		funcionario.setCargo(scan.nextLine());
		System.out.println("Insira o salário (com vírgula): ");
		funcionario.setSalario(scan.nextDouble());
		scan.nextLine();

		int opcao;
		do {
			System.out.println("");
			System.out.println("Selecione a opção que deseja acessar");
			System.out.println("------------------------------------");
			System.out.println("1- Aplicar aumento salarial");
			System.out.println("2- Exibir dados do funcionário");
			System.out.println("3- Sair");
			System.out.println("------------------------------------");
			System.out.println("");
			opcao = scan.nextInt();
			scan.nextLine();

			if (opcao == 1) {
				System.out.println("Insira a porcentagem de aumento (ex: 10): ");
				double percentual = scan.nextDouble();
				scan.nextLine();
				funcionario.aumentarSalario(percentual);
			} else if (opcao == 2) {
				funcionario.exibirDados();
			} else if (opcao == 3) {
				System.out.println("Encerrando o sistema do funcionário! Até logo.");
			} else {
				System.out.println("Opção inválida! Tente novamente.");
			}

		} while (opcao != 3);
	}
	public static void attOito() {
		Retangulo retangulo = new Retangulo();

		System.out.println("Insira a largura do retângulo (com vírgula): ");
		retangulo.setLargura(scan.nextDouble());
		System.out.println("Insira a altura do retângulo (com vírgula): ");
		retangulo.setAltura(scan.nextDouble());
		scan.nextLine();

		int opcao;
		do {
			System.out.println("");
			System.out.println("Selecione a opção que deseja acessar");
			System.out.println("------------------------------------");
			System.out.println("1- Calcular e exibir área");
			System.out.println("2- Calcular e exibir perímetro");
			System.out.println("3- Exibir todas as informações");
			System.out.println("4- Sair");
			System.out.println("------------------------------------");
			System.out.println("");
			opcao = scan.nextInt();
			scan.nextLine();

			if (opcao == 1) {
				System.out.printf("Área do retângulo: %.2f\n", retangulo.calcularArea());
			} else if (opcao == 2) {
				System.out.printf("Perímetro do retângulo: %.2f\n", retangulo.calcularPerimetro());
			} else if (opcao == 3) {
				retangulo.exibirDados();
			} else if (opcao == 4) {
				System.out.println("Encerrando o sistema de cálculo do retângulo! Até logo.");
			} else {
				System.out.println("Opção inválida! Tente novamente.");
			}

		} while (opcao != 4);
	}
	public static void attNove() {
		Celular celular = new Celular();

		System.out.println("Insira a marca do celular: ");
		celular.setMarca(scan.nextLine());
		System.out.println("Insira o modelo do celular: ");
		celular.setModelo(scan.nextLine());

		int opcao;
		do {
			System.out.println("");
			System.out.println("Selecione a opção que deseja acessar");
			System.out.println("------------------------------------");
			System.out.println("1- Usar celular (-10% bateria)");
			System.out.println("2- Carregar celular (100%)");
			System.out.println("3- Exibir nível de bateria");
			System.out.println("4- Sair");
			System.out.println("------------------------------------");
			System.out.println("");
			opcao = scan.nextInt();
			scan.nextLine();

			if (opcao == 1) {
				celular.usarCelular();
			} else if (opcao == 2) {
				celular.carregar();
			} else if (opcao == 3) {
				celular.exibirBateria();
			} else if (opcao == 4) {
				System.out.println("Encerrando o sistema do celular! Até logo.");
			} else {
				System.out.println("Opção inválida! Tente novamente.");
			}

		} while (opcao != 4);
	}
	public static void attDez() {
		PessoaDois p1 = new PessoaDois();
		PessoaDois p2 = new PessoaDois();

		System.out.println("=== CADASTRO DA PRIMEIRA PESSOA ===");
		System.out.println("Insira o nome: ");
		p1.setNome(scan.nextLine());
		System.out.println("Insira a idade: ");
		p1.setIdade(scan.nextInt());
		scan.nextLine();
		System.out.println("Insira a cidade: ");
		p1.setCidade(scan.nextLine());

		System.out.println("\n=== CADASTRO DA SEGUNDA PESSOA ===");
		System.out.println("Insira o nome: ");
		p2.setNome(scan.nextLine());
		System.out.println("Insira a idade: ");
		p2.setIdade(scan.nextInt());
		scan.nextLine();
		System.out.println("Insira a cidade: ");
		p2.setCidade(scan.nextLine());

		int opcao;
		do {
			System.out.println("");
			System.out.println("Selecione a opção que deseja acessar");
			System.out.println("------------------------------------");
			System.out.println("1- Apresentar Pessoa 1");
			System.out.println("2- Fazer Aniversário da Pessoa 1");
			System.out.println("3- Exibir dados da Pessoa 1");
			System.out.println("------------------------------------");
			System.out.println("4- Apresentar Pessoa 2");
			System.out.println("5- Fazer Aniversário da Pessoa 2");
			System.out.println("6- Exibir dados da Pessoa 2");
			System.out.println("------------------------------------");
			System.out.println("7- Exibir dados de AMBAS as pessoas");
			System.out.println("8- Sair");
			System.out.println("------------------------------------");
			System.out.println("");
			opcao = scan.nextInt();
			scan.nextLine();

			if (opcao == 1) {
				p1.apresentar();
			} else if (opcao == 2) {
				p1.fazerAniversario();
			} else if (opcao == 3) {
				p1.exibirDados();
			} else if (opcao == 4) {
				p2.apresentar();
			} else if (opcao == 5) {
				p2.fazerAniversario();
			} else if (opcao == 6) {
				p2.exibirDados();
			} else if (opcao == 7) {
				p1.exibirDados();
				p2.exibirDados();
			} else if (opcao == 8) {
				System.out.println("Encerrando o sistema de cadastro! Até logo.");
			} else {
				System.out.println("Opção inválida! Tente novamente.");
			}

		} while (opcao != 8);
	}
}
	