import java.util.Scanner;

public class lerdoisnumeroseinformeomaioremenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner (System.in);
	
	System.out.println("digite o primeiro numero");
	int numero1 = sc.nextInt();
	
	System.out.println("digite o segundo numero");
	int numero2 = sc.nextInt();
	
	
	double maior,menor;
	if (numero1 > numero2) {
		maior = numero1;
		menor = numero2;
	}else {
		maior = numero2;
		menor = numero1;
	}
	 System.out.println("O maior n�mero �: " + maior);
	 System.out.println("O menor n�mero �: " + menor);
	
	sc.close();
	}
}
