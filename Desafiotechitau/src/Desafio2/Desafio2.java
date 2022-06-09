package Desafio2;

import java.util.*;


/*
 * Escreva uma solução eficiente, no qual, receba duas strings S e T, onde T é gerado
randomicamente através de S; só que nesse processo, uma letra foi adicionada em T. Seu
desafio é encontrar a letra adicionada.

 */

public class Desafio2 {

	
		
	public static void main(String[] args){

	    Scanner letra = new Scanner(System.in);
	    
	    System.out.println("Digite aqui suas letras: ");
	    String linha1 = letra.nextLine();
	    System.out.println("Digite aqui a letra adicionada: ");
	    String linha2 = letra.nextLine(); 
	    
	    
	    
	    if (checkRotation(linha1, linha2)){
	    	System.out.println("A segunda linha e a letra adicionada"); //verifica a ocorrencia

	    } else{
	    	System.out.println("Houve uma letra adicionada"); //explica a ocorrencia

	    }

	  }

	private static boolean checkRotation(String linha1, String linha2) { 
		
		return false;
	}  

	}