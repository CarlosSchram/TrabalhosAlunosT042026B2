package objetos;

public class PessoaDois {

    String nome;
    int idade;
    String cidade;

    public void apresentar() {
        System.out.println("Olá! Meu nome é " + nome + ", tenho " + idade + " anos e moro em " + cidade + ".");
    }

    public void fazerAniversario() {
        idade++;
        System.out.println("Parabéns, " + nome + "! Você agora tem " + idade + " anos!");
    }

    public void exibirDados() {
        System.out.println("\n--- DADOS DA PESSOA ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Cidade: " + cidade);
        System.out.println("-----------------------\n");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}