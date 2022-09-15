package lista03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Questao19 {
	
	public static void gerarVetor(int[] array) {
		Random gerador = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = gerador.nextInt(10);
		}
		
		System.out.println(Arrays.toString(array));
	}
	
	public static void agrupar(int[] array, int quantidade){
		int[][] mat = new int[quantidade][array.length/quantidade]; 
		int indice = 0;
		
		for (int i = 0; i < quantidade; i++) {
			for (int j = 0; j < array.length/quantidade; j++) {
				mat[i][j] = array[indice];
				indice++;
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do seu vetor: ");
		int tamanho = entrada.nextInt();
		
		int[] array = new int[tamanho];
		
		gerarVetor(array);
		
		System.out.print("Quantos agrupamentos você deseja?: ");
		int quantidade = entrada.nextInt();
		
		agrupar(array, quantidade);
		
		entrada.close();
	}

}
