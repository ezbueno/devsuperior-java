package exercicios.propostos;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva 
 * um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 
 * 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até 
 * que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a 
 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme 
 * exemplo.
 */
public class ExercicioTres {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int codigo = sc.nextInt();

			int quantidadeAlcool = 0;
			int quantidadeGasolina = 0;
			int quantidadeDiesel = 0;

			while (codigo != 4) {
				if (codigo == 1) {
					quantidadeAlcool++;
				} else if (codigo == 2) {
					quantidadeGasolina++;
				} else if (codigo == 3) {
					quantidadeDiesel++;
				}
				codigo = sc.nextInt();
			}

			System.out.println("MUITO OBRIGADO");
			System.out.println("Álcool: " + quantidadeAlcool);
			System.out.println("Gasolina: " + quantidadeGasolina);
			System.out.println("Diesel: " + quantidadeDiesel);
		}
	}
}
