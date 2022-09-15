package lista03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Questao16 {
	
	public static void gerarVetor(int[] array) {
		Random gerador = new Random();
		
		for (int i = 0; i < array.length; i++) {
			array[i] = gerador.nextInt(50);
		}
		System.out.println(Arrays.toString(array));
	}
	
	public static void polarizar(int[] array) {
		int aux = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if(array[i] % 2 != 0) {
					aux=array[i];
					array[i]=array[j];
					array[j]=aux;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o tamanho do vetor A: ");
		int tamanho = entrada.nextInt();

		int[] array = new int[tamanho];
		
		gerarVetor(array);
		
		polarizar(array);
		
		entrada.close();
	}

}
