package objetos;

public class Funcionario {

    String nome;
    String cargo;
    double salario;

    public void aumentarSalario(double percentual) {
        double aumento = salario * (percentual / 100);
        salario += aumento;
        System.out.println("Aumento de " + percentual + "% aplicado com sucesso!");
    }

    public void exibirDados() {
        System.out.println("\n--- DADOS DO FUNCIONÁRIO ---");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.printf("Salário: R$ %.2f\n", salario);
        System.out.println("----------------------------\n");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}