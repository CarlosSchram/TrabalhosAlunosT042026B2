package objetos;

public class ContaBancaria {
	String titular;
	double saldo;
	
	public void depositar(double valor) {
		if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("O valor de depósito deve ser maior que zero.");
        }
    }
	
	public void sacar(double valor) {
		if (valor<=0) {
			System.out.println("(O valor de saque deve ser maior que zero)");
        } else if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente! Seu saldo atual é: R$ " + this.saldo);
        }
		
		
	}
	
	public void exibirSaldo() {
		System.out.println("Titular: " + this.titular);
		System.out.println(saldo);
	}
	
	public String getTitular() {
        return titular;
    }
	public void setTitular(String titular) {
		// TODO Auto-generated method stub
		this.titular=titular;
		
	}

	public void setSaldo(double saldo) {
		// TODO Auto-generated method stub
		
	}
	
	public double getSaldo() {
        return saldo;
    }
	


	}


	



	

