package lista03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Questao02 {
	
	public static int pesquisarIndice(int indice, int vet[]){
		for(int i=0; i<vet.length; i++) {
			if(i==indice)
				return vet[i];
		}
		
		return -100;
	}
	
	public static int[] gerarVetor(int vet[]) {
		
		Random gerador = new Random();
		for (int i = 0; i < vet.length; i++) {
			vet[i] = gerador.nextInt(50);
		}
		
		return vet;
	}

	public static void main(String[] args) {
          int vet[] = new int[30];
          
          Scanner entrada = new Scanner(System.in);
          
          gerarVetor(vet);
          
          System.out.println(Arrays.toString(vet));
          
          System.out.print("Informe o índice: ");
    	  int indice = entrada.nextInt();
    	  
    	  pesquisarIndice(indice,vet);
    	  
    	  if(pesquisarIndice(indice,vet) == -100) {
    		  System.out.println("Índice inválido!");
    	  }
    	  else {
    		  System.out.println(pesquisarIndice(indice,vet));
    	  }
    	  
    	  
    	  entrada.close();
    	  
	}

}
