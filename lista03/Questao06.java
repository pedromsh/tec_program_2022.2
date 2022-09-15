package lista03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Questao06 {
	
	public static void inverterOrdem(int vet[], int tamanho) {
		int vetB[] = new int[tamanho];
		
		for (int i = vet.length, indice = 0; i > 0; i--, indice++) {
			vetB[indice] = vet[i-1];
		}
		
		System.out.println(Arrays.toString(vetB));
	}
	
	public static int[] gerarVetor(int vet[]) {
		Random gerador = new Random();
		
		for (int i = 0; i < vet.length; i++) {
			vet[i] = gerador.nextInt(50);
		}
		
		return vet;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do vetor: ");
		int tamanho = entrada.nextInt();
		
		int vet[] = new int[tamanho];
		
		gerarVetor(vet);
		
		System.out.println(Arrays.toString(vet));
		
		inverterOrdem(vet, tamanho);
		
		entrada.close();
		}

}
