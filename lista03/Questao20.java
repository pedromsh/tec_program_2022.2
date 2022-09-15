package lista03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Questao20 {
	
	public static void gerarVetor(int[] array) {
		Random gerador = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = gerador.nextInt(50);
		}
	}
	
	public static void diferenciar(int[] arrayA, int[] arrayB) {
		int aux = 0;
		
		for (int i = 0; i < arrayA.length; i++) {
			aux = 0;
			
			for (int j = 0; j < arrayB.length; j++) {
				if (arrayA[i] != arrayB[j]) {
					aux++;
				}
			}
			if (aux == arrayB.length) {
				System.out.print(arrayA[i] + " ");
			}
		}
   }

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o tamanho do vetor A: ");
		int tamanhoA = entrada.nextInt();
		
		int[] arrayA = new int[tamanhoA];
		
		System.out.print("Informe o tamanho do vetor B: ");
		int tamanhoB = entrada.nextInt();
		
		int[] arrayB = new int[tamanhoB];
		
		gerarVetor(arrayA);
		System.out.println("Vetor A: ");
		System.out.println(Arrays.toString(arrayA));
		
		gerarVetor(arrayB);
		System.out.println("Vetor B: ");
		System.out.println(Arrays.toString(arrayB));
		
		diferenciar(arrayA, arrayB);

		entrada.close();

	}

}
