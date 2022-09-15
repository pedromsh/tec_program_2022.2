package lista03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Questao17 {
	
	public static void gerarVetor(int[] array) {
		Random gerador = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = gerador.nextInt(10);
		}
		
		System.out.println(Arrays.toString(array));
	}
	
	public static int contarTamNewArray(int[] array) {
		int somatorio = 0;
		
		for (int i = 0; i < array.length; i++) {
			somatorio += array[i];
		}
		
		return somatorio;
	}
	
	public static int[] explodir(int[] array) {
		int[] arrayAux = new int[contarTamNewArray(array)];
		
		int indice = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i]; j++) {
				arrayAux[indice] = array[i];
				indice++;
			}
		}
		
		return arrayAux;
	}

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o tamanho do vetor: ");
		int tamanho = entrada.nextInt();
		
		int[] array = new int[tamanho];
		
		gerarVetor(array);
		
		System.out.println(Arrays.toString(explodir(array)));
		
		entrada.close();

	}

}
