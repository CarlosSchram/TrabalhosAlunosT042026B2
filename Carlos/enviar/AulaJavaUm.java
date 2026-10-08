import java.util.Scanner;

public class AulaJavaUm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual sua idade?");
		int idade = sc.nextInt();
		if (idade >= 18) {
			System.out.println("Sua idade e " + idade + ", portanto, voce e maior de idade.");
		} else {
			System.out.println("Sua idade e " + idade + ", portanto, voce e menor de idade.");
		}
		
		sc.close();
	}
}