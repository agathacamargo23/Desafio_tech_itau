package Desafio1;



/*Escreva uma solução eficiente, no qual, receba uma listagem de strings e encontre o
maior prefixo comum dentro dessa listagem. Caso não encontre algum prefixo comum,
deve-se retornar uma string vazia*/

public class Desafio1 {

	public static void main(String[] args) {
		
		
		 
		String[] nomes = {"Pedro", "Laranja", "Pedra", "Pediatra"};
		String resultado = "";
		int contador = 0;
		String myStr = nomes[0].substring(0,4);
		

		for(int i = 0; i < nomes.length; i++){
	    
	     if(nomes[i].contains(myStr)){
	    	
	    	contador+=1;
	     }
	    
		 if(contador > 1) {
	    	 resultado = myStr;
	    	 
	    	 
	     }else{
	    	 resultado = "";
	     }
		
    	};
    	System.out.println(resultado);
	}

}
