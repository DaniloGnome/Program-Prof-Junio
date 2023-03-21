import java.util.Scanner;

public class questao9encadeado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("digite um numero 1");
		double numero1 = sc.nextDouble();

		System.out.print("digite um numero 2");
		double numero2 = sc.nextDouble();

		if (numero1 > numero2) {
				System.out.println(numero1 + "é maior que "+ numero2);
		} else {
			if (numero2 > numero1) {
			System.out.println(numero2 + "é maior que "+ numero1);
			}else {
				System.out.println("sao iguais");
			}
		}
		sc.close();
		}
}
