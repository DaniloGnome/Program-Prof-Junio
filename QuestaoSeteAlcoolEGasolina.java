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
        String tipocombustivel = sc.nextLine();

        
   // capacidade do tanque em litros
        System.out.print("Informe a capacidade do tanque em litros: ");
        double capacidadetanque = sc.nextDouble();

   
   // verifica o tipo de combustível e calcula o valor total gasto para encher o tanque
        double precolitro;
        if (tipocombustivel .equals("G")) {
            precolitro = 3.79; // preco da gasolina
        } else if (tipocombustivel.equals("A")) {
            precolitro = 2.90; // preço do alcool
        } else {
            System.out.println("Tipo de combustível nao existente");
            return;
        }

        double valortotal = precolitro * capacidadetanque;
        System.out.printf("O valor total gasto para encher o tanque será de R$ %.2f\n", valortotal);

        sc.close();
	}

}
