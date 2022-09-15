package lista03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Questao04 {
	
	public static int[] gerarVetor(int vet[]) {
		Random gerador = new Random();
		for (int i = 0; i < vet.length; i++) {
			vet[i] = gerador.nextInt(30);
		}
		
		return vet;
	}
	
	public static int somatorio(int vet[]) {
		int soma=0;
		
		for (int i = 0; i < vet.length; i++) {
			soma = soma+vet[i];
		}
		
		return soma;
	}

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o tamanho do vetor: ");
		int tamanho = entrada.nextInt();
		
		int vet[] = new int[tamanho];
		
	    gerarVetor(vet);
	    
	    System.out.println(Arrays.toString(vet));
	    
	    System.out.println("O somatório dos elementos do vetor é:");
	    System.out.println(somatorio(vet));
	    
	    entrada.close();

	}

}
