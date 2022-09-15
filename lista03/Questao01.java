package lista03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Questao01 {

	public static int pesquisar(int num, int vet[]){
		for(int i=0; i<vet.length; i++) {
			if(vet[i]==num)
				return i;
		}
		
		return -100;
	}
	
	public static int[] gerarVetor(int vet[]) {
		Random gerador = new Random();
		for (int i = 0; i < vet.length; i++) {
			vet[i] = gerador.nextInt(30);
		}
		
		return vet;
	}
	
	public static void main(String[] args) {
		
		int vet[] = new int[20];
		
		Scanner entrada = new Scanner(System.in);
		
		gerarVetor(vet);
		
	    System.out.print(Arrays.toString(vet));
	    
	    System.out.println();
	    
	    System.out.print("Informe qual número pesquisar: ");
	    int num = entrada.nextInt();
	    
	    System.out.println( pesquisar(num, vet));
	    
	    entrada.close();
	    
	}

}
