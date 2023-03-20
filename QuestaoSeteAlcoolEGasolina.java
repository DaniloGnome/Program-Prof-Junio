//Construa um algoritmo que determine quanto será gasto para encher o
//tanque de um carro (VG), sabendo-se que o preço da gasolina é de R$ 3,79 e o preço
//do álcool é de R$ 2.90. O usuário fornecerá os seguintes dados: Tipo de Combustível
//(TC) (G – gasolina ou A – álcool) e Capacidade do tanque (CT), em litros.


			// VARIAVEIS
		//String tipocombustivel;
		//double capacidadetanque;
		//double precolitro;
		//double valortotal;

package exercicioaula17032023;

import java.util.Scanner;

public class QuestaoSeteAlcoolEGasolina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
	
		// tipo de combustível 
	System.out.print("Informe o tipo de combustível (G - gasolina ou A - álcool): ");
	String tipocombustivel = sc.nextLine();		// sera String, pois o tipo informado será nao numerico

        
        // capacidade do tanque em litros
        System.out.print("Informe a capacidade do tanque em litros: ");
	double capacidadetanque = sc.nextDouble();

   
        // agora tenho que verifica o tipo de combustível e calcula o valor total gasto para encher o tanque
        // com isso tenho que criar uma vareavel para o preço do litro.
	double precolitro;
		if (tipocombustivel .equals("G")) // aqui declaramos o .equals para comparacao ( tipo do combustivel é igual a G)
		{
            precolitro = 3.79; // declaramos o preco da gasolina
        } else if (tipocombustivel.equals("A"))  //// aqui declaramos o .equals para comparacao ( tipo do combustivel é igual a A)
		{
            precolitro = 2.90; // declaramos o preço do alcool
        } else {
            System.out.println("Tipo de combustível nao existente"); // aqui o tipo de combustivel digitado nao foi A e nem G.
            return; // o método "return;" é simplesmente encerrado, sem retornar nenhum valor.
        }

        double valortotal = precolitro * capacidadetanque;
        System.out.println("O valor total gasto para encher o tanque será de R$ " + valortotal); // aqui temos uma calcatenção 

        sc.close(); // aqui fechamos o scanner
	}

}
