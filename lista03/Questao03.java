package lista03;

import java.util.Arrays;
import java.util.Scanner;

public class Questao03 {
	
	public static int[] popularVetor(int vet[]) {
		Scanner num = new Scanner(System.in);
		
		for (int i = 0; i < vet.length; i++) {
			vet[i] = num.nextInt();
		}
		
		num.close();
		
		return vet;
	}

	public static void ordenarValores(int vet[]) {
		int aux;
		
		for (int i = 0; i < vet.length; i++) {
			for(int j = i+1; j < vet.length; j++) {
				
				if(vet[i]>=vet[j]) {
					
					aux=vet[i];
					vet[i]=vet[j];
					vet[j]=aux;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o tamanho do vetor: ");
		int tamanho = entrada.nextInt();
		
		int vet[] = new int[tamanho];
		
		popularVetor(vet);
		
		ordenarValores(vet);
		
		System.out.println(Arrays.toString(vet));
		
		entrada.close();
	}

}
