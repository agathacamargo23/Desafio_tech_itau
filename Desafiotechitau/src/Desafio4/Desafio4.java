package Desafio4;

import java.util.Scanner;

/*
 * Escreva uma solu��o eficiente, no qual, receba um inteiro n e descubra se ele � um
n�mero feliz. Retorne true se o n�mero for feliz, ou false caso contr�rio.
O que determina se o n�mero � feliz:

 */

public class Desafio4 {

	public static void main(String[] args) {
		
		int numero;
	    float r;
		double a, num;
		int valor;
		int expoente = 2;

		System.out.println("Digite um valor de entrada: ");
		Scanner ler = new Scanner(System.in);
		r = ler.nextFloat();
		
		num = r *Math.pow(r,2);
		
		if (num == 1) {
			System.out.println("true " +num+ " ao quadrado � um numero feliz") ;
		}
		else {
			System.out.println("false");
		}
	
    }
}


	
