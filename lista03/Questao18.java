package lista03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Questao18 {
	
	public static void gerarVetor(int[] array) {
		Random gerador = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = gerador.nextInt(50);
		}
		
		System.out.println(Arrays.toString(array));
	}
	
	public static void organizar(int[] array) {
		int aux = 0;
		
		for (int i = 0; i < array.length; i++) {
			for(int j = i+1; j < array.length; j++) {
				
				if(array[i]>=array[j]) {
					
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
		
		System.out.print("Informe o tamanho do vetor: ");
		int tamanho = entrada.nextInt();
		
		int[] array = new int[tamanho];
		
		gerarVetor(array);
		
		organizar(array);
		
		entrada.close();

	}

}
