package exercicioaula17032023;

import java.util.Scanner;

public class exibirseeparouimpar {
    public static void main(String[] args) {
        
   // Escreva um algoritmo que receba um número e imprima uma das mensagens: 
    	//“é múltiplo de 3” ou “não é múltiplo de 3”.


    	
    	
    	Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número: ");
        numero = sc.nextInt();

        if (numero % 3 == 0) { // % operado de modulo, -- operador de igualdade
            System.out.println(numero + " é multiplo de 3");
        } else {
            System.out.println(numero + " não é multiplo de 3");
        }

        sc.close();
    }
}