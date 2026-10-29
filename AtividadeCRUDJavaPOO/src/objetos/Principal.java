package objetos;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ArrayList<Jogo> jogos = new ArrayList<Jogo>();

		int opcao;

		do {
			System.out.println("\n========== SISTEMA DE JOGOS ==========");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Listar todos");
			System.out.println("3 - Buscar por ID");
			System.out.println("4 - Atualizar");
			System.out.println("5 - Excluir");
			System.out.println("0 - Sair");
			System.out.println("Escolha uma opcao:");

			opcao = scan.nextInt();
			scan.nextLine();

			if (opcao == 1) {

				cadastrar(jogos, scan);

			} else if (opcao == 2) {

				listar(jogos);

			} else if (opcao == 3) {

				buscar(jogos, scan);

			} else if (opcao == 4) {

				atualizar(jogos, scan);

			} else if (opcao == 5) {

				excluir(jogos, scan);

			} else if (opcao == 0) {

				System.out.println("Sistema encerrado!");

			} else {

				System.out.println("Opcao invalida!");
			}

		} while (opcao != 0);

		scan.close();
	}

	public static void cadastrar(ArrayList<Jogo> jogos, Scanner scan) {

		System.out.println("Digite o ID do jogo:");
		int id = scan.nextInt();
		scan.nextLine();

		if (buscarPorId(jogos, id) != null) {

			System.out.println("Esse ID ja existe!");

		} else {

			System.out.println("Digite o nome do jogo:");
			String nome = scan.nextLine();

			System.out.println("Digite o genero do jogo:");
			String genero = scan.nextLine();

			Jogo jogo = new Jogo(id, nome, genero);

			jogos.add(jogo);

			System.out.println("Jogo cadastrado com sucesso!");
		}
	}

	public static void listar(ArrayList<Jogo> jogos) {

		if (jogos.isEmpty()) {

			System.out.println("Nenhum jogo cadastrado!");

		} else {

			for (Jogo jogo : jogos) {

				jogo.exibirInformacoes();
				System.out.println("----------------------");
			}
		}
	}

	public static Jogo buscarPorId(ArrayList<Jogo> jogos, int id) {

		for (Jogo jogo : jogos) {

			if (jogo.getId() == id) {

				return jogo;
			}
		}

		return null;
	}

	public static void buscar(ArrayList<Jogo> jogos, Scanner scan) {

		System.out.println("Digite o ID do jogo:");
		int id = scan.nextInt();
		scan.nextLine();

		Jogo jogo = buscarPorId(jogos, id);

		if (jogo != null) {

			jogo.exibirInformacoes();

		} else {

			System.out.println("Jogo nao encontrado!");
		}
	}

	public static void atualizar(ArrayList<Jogo> jogos, Scanner scan) {

		System.out.println("Digite o ID do jogo que deseja atualizar:");
		int id = scan.nextInt();
		scan.nextLine();

		Jogo jogo = buscarPorId(jogos, id);

		if (jogo != null) {

			System.out.println("Digite o novo nome do jogo:");
			String nome = scan.nextLine();

			System.out.println("Digite o novo genero do jogo:");
			String genero = scan.nextLine();

			jogo.setNome(nome);
			jogo.setGenero(genero);

			System.out.println("Jogo atualizado com sucesso!");

		} else {

			System.out.println("Jogo nao encontrado!");
		}
	}

	public static void excluir(ArrayList<Jogo> jogos, Scanner scan) {

		System.out.println("Digite o ID do jogo que deseja excluir:");
		int id = scan.nextInt();
		scan.nextLine();

		Jogo jogo = buscarPorId(jogos, id);

		if (jogo != null) {

			jogos.remove(jogo);

			System.out.println("Jogo excluido com sucesso!");

		} else {

			System.out.println("Jogo nao encontrado!");
		}
	}
}