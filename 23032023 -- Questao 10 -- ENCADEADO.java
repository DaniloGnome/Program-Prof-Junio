//Questão 10. ENCADEADO

//Escrever um algoritmo que leia o nome e as três notas obtidas por um
//aluno durante o semestre. Calcular a sua média (aritmética), informar o nome e sua
//menção aprovado (media >= 7), Reprovado (media <= 5) e Recuperação (media entre 5.1 a 6.9).

package exercicioaula17032023; // pacote

import java.util.Scanner; // importamos a classe scanner

public class questaonoveencadeado {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o nome do aluno: ");
		String nome = sc.nextLine(); /// criamos um vareavel da classe string, pois iremos receber um nome

		System.out.print("Digite a primeira nota: ");
		double nota1 = sc.nextDouble(); /// variavel classe double, pois vamos receber um valor numerico

		System.out.print("Digite a segunda nota: ");
		double nota2 = sc.nextDouble(); /// variavel classe double, pois vamos receber um valor numerico

		System.out.print("Digite a terceira nota: ");
		double nota3 = sc.nextDouble(); /// variavel classe double, pois vamos receber um valor numerico

		double media = (nota1 + nota2 + nota3) / 3; /// variavel classe double, pois vamos receber um valor numerico

		System.out.println("Nome do aluno: " + nome);
		System.out.println("Média: " + media);

		// ## Codigo com encadeamento ## \\

		if (media >= 7) { /// se media é maior ou igual a 7 irá aparecer no console a seguinte mensagem
							/// "está aprovado"
			System.out.println("está aprovado");
		} else { /// se a nota for menor que 7 ... seguimos esse codigo, caso for maior ou igual
					/// a 7 , a linha vai pular esse else com o encadeamento
			if (media >= 6.1) { /// ... e maior ou igual a 5.1 irá aparecer a seguinte mensagem no console "está
								/// em recuperacao"
				System.out.println("chora para o professor que ele te ajuda");
			} else if (media >= 5.1) { /// se for menor que 5.1 ira aparecer no console a mensagem "esta reprovado"
				System.out.println("esta em recuperção");
			} else {
				System.out.println("reprovado, sola ... mentos");
			}
		}
		sc.close(); /// fechamos o scanner
	}
}
				////SEMPRE USAMOS O COMANDO CONTROL SHIFT F PARA ORGANIZAR AS LINHAS DE CODIGOS
