package Desafio4;

import java.util.Scanner;

/*
 * Escreva uma solução eficiente, no qual, receba um inteiro n e descubra se ele é um
número feliz. Retorne true se o número for feliz, ou false caso contrário.
O que determina se o número é feliz:

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
			System.out.println("true " +num+ " ao quadrado é um numero feliz") ;
		}
		else {
			System.out.println("false");
		}
	
    }
}


	
