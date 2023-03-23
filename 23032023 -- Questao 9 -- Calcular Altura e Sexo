//			Questão 09. 
//	Construa um algoritmo que, tendo como dados de entrada a altura (H) e
//	o sexo (S) de uma pessoa calculem e apresentem seu peso ideal utilizando as
//	seguintes fórmulas:
//	Para homens: Peso ideal (P) = (72,7 * H) – 58
//	Para mulheres: Peso ideal (P) = (62,1 * H) – 44,7

package exercicioaula17032023;

import java.util.Scanner;

public class questaonove {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite sua altura (exemplo : 1,70: ");
		double altura = sc.nextDouble();

		System.out.println("Sexo : H para homem e M para mulher");
		String sexo = sc.next();

		double peso_ideal; // criamos um double para armazenar um dado
		if (sexo.equalsIgnoreCase("H")) { // declaramos o .equalsIgnoreCase para comparação e ignorar se é maiusculo ou
											// minusculo
			peso_ideal = 72.7 * altura - 58; // calculo
		} else if (sexo.equalsIgnoreCase("M")) { // // declaramos o .equalsIgnoreCase para comparação e ignorar se é
													// maiusculo ou menuscolo
			peso_ideal = 62.1 * altura - 44.7; // calculo
		} else {
			System.out.println("Sexo inválido."); // aqui mostramos a seguinte mensagem, caso seja digitado outra letra
													// alem do H ou M.
			return; // temos um retorno sem valor
		}

		System.out.println("O peso ideal é :" + peso_ideal + " kg"); // usamos uma concatenacao
		sc.close();
	}
}

						////SEMPRE USAMOS O COMANDO CONTROL SHIFT F PARA ORGANIZAR AS LINHAS DE CODIGOS
