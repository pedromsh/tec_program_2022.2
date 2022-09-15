package lista03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Questao10 {
	
	public static void gerarVetor(int[] array) {
		Random gerador = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = gerador.nextInt(2);
		}
		
		System.out.println(Arrays.toString(array));
	}
	
	public static void compactar(int array[]) {
		int tam = 0;
		for(int i = 0; i < array.length - 1; i++) {
			if(array[i] != array[i+1]) {
				tam++;
			}
		}
		
		int arrayAux[] = new int[tam];
		int cont = 0;
		
		for(int i = 0, indice = 0; i < (array.length - 1); i++) {
			if(array[i] == array[i + 1]) {
				cont++;
			}
			else {
				arrayAux[indice] = cont;
				cont = 1;
				indice++;
			}
		}
		
		System.out.println("vetor compactado: ");
		
		for(int i = 0 ; i < tam; i++) {
				System.out.println(arrayAux[i]);
		}
	}

	public static void main(String[] args) {
		    Scanner entrada = new Scanner(System.in);
			
			System.out.print("Informe o tamanho do vetor: ");
			int tamanho = entrada.nextInt();
			
			int[] array = new int[tamanho];
			
			gerarVetor(array);
			
			compactar(array);
			
			entrada.close();

	}

}
