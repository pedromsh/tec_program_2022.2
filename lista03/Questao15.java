package lista03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Questao15 {
	
	public static void gerarVetor(int[] array) {
		Random gerador = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = gerador.nextInt();
		}
	}
	
	public static void complementar(int[] arrayA, int[] arrayB, int tamanho) {
		int[] arrayC = new int[tamanho];
		
		for (int i = 0; i < arrayA.length; i++) {
			arrayC[i] = 10 - (arrayA[i] + arrayB[i]);
		}
		
		System.out.println("Vetor C: ");
		System.out.println(Arrays.toString(arrayC));
	}

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o tamanho dos vetores: ");
		int tamanho = entrada.nextInt();
		
		int[] arrayA = new int[tamanho];
		
		int[] arrayB = new int[tamanho];
		
		gerarVetor(arrayA);
		System.out.println("Vetor A: ");
		System.out.println(Arrays.toString(arrayA));
		
		gerarVetor(arrayB);
		System.out.println("Vetor B: ");
		System.out.println(Arrays.toString(arrayB));
		
		complementar(arrayA, arrayB, tamanho);
		
		entrada.close();
	}

}
