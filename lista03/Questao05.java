package lista03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Questao05 {
	
	public static int[] gerarVetor(int vet[]) {
		Random gerador = new Random();
		
		for (int i = 0; i < vet.length; i++) {
			vet[i] = gerador.nextInt(50);
		}
		
		return vet;
	}
	
	public static void juntar(int vetA[], int vetB[], int tamA, int tamB) {
		int vetC[] = new int[tamA+tamB];
		int posicao = 0;
		
		for(int i = 0; i < vetA.length; i++) {
			
			vetC[i] = vetA[i];
			posicao++;
		}
		
		for(int i = 0; i < vetB.length; i++) {
			vetC[posicao] = vetB[i];
			posicao++;
		}
		
		System.out.println(Arrays.toString(vetC));
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
		System.out.println(Arrays.toString(vetA));
		
		gerarVetor(vetB);
		System.out.println(Arrays.toString(vetB));
		
		juntar(vetA, vetB, tamA, tamB);
		
		entrada.close();
		
	}

}
