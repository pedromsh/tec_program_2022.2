package lista03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Questao07 {
	
	public static int[] gerarVetor(int vet[]) {
		Random gerador = new Random();
		
		for (int i = 0; i < vet.length; i++) {
			vet[i] = gerador.nextInt(50);
		}
		
		return vet;
	}
	
	public static void inverterValor(int vetA[], int vetB[], int tamA, int tamB) {
	    int aux = 0;
	    
	    for (int i = 0; i < vetB.length; i++) {
			aux = vetA[i];
			vetA[i] = vetB[i];
			vetB[i] = aux;
		}
	    
	    System.out.println("Vetor A após inverter:");
	    System.out.println(Arrays.toString(vetA));
	    
	    System.out.println("Vetor B após inverter:");
	    System.out.println(Arrays.toString(vetB));
	    
	}

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do vetor A: ");
		int tamA = entrada.nextInt();
		
		int vetA[] = new int[tamA];
		
		System.out.print("Digite o tamanho do vetor B: ");
		int tamB = entrada.nextInt();
		
		int vetB[] = new int[tamB];
		
		gerarVetor(vetA);
		System.out.println("Vetor A antes de inverter:");
		System.out.println(Arrays.toString(vetA));
		
		System.out.println("Vetor B antes de inverter:");
		gerarVetor(vetB);
		System.out.println(Arrays.toString(vetB));
		
		inverterValor(vetA, vetB, tamA, tamB);
		
		entrada.close();
	}

}
