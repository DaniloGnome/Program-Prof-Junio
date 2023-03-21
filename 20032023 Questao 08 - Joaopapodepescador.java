
//		QUESTOA 08
//João Papo-de-Pescador, homem de bem, comprou um microcomputador
//para controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de
//peixes maior que o estabelecido pelo regulamento de pesca do estado da Paraíba (50
//quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você
//faça um algoritmo que a partir do peso do peixe, verifique se houve excesso e caso
//seja verdadeiro o programa deverá imprimir a multa a ser pago.

package exercicioaula17032023; // pacote

import java.text.DecimalFormat; // importamos o decimal format para mostrar o valor em reais R$ ##.00
import java.util.Scanner; // importamos a classe scanner

public class Joaopapodepescador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.00"); //aqui temos o decimalformat para introduzir na msg de excesso de peso
		
		System.out.print("Digite o Peso do peixe :"); // print para pedir o peso do peixe
		double pesopeixe = sc.nextDouble(); // variavel do tipo double para armazenar o valor do peixe na memoria
		
		if (pesopeixe > 50) { // se peixe é maior que o valor 50
			double passoupeso = pesopeixe - 50; // variavel do tipo double, diminuimos por 50 e a sobra será o valor armazenado no double 'passoupeso' 
			double pesopermitido = passoupeso * 4;// variavel do tipo double, e o que sera armazenado sera o resultado da variavel 'passoupeso' vezes 4 que é o valor da multa por kg
		System.out.print("O peixe passou "+ passoupeso + "kg. O total da multa será : R$ " + df.format(pesopermitido)); // aqui temos, duas variaveis texto que sera impressa na tela e, usamos a formatacao df.format para a variavel 'pesopermitido'
		}
		else {
			System.out.print("O peixe está no peso permitido, nao houve excesso");
sc.close(); // fechamos o scanner
	}
}
		
}


