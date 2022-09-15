package lista03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Questao08 {
	
	public static float[] gerarVetor(float vet[]) {
		Random gerador = new Random();
		
		for (int i = 0; i < vet.length; i++) {
			vet[i] = gerador.nextInt(50);
		}
		
		return vet;
	}
	
	public static void priorizar(float vet[], int tamanho) {
		float vet2[] = new float[tamanho];
		float media = 0;
		float aux = 0;
		float mediaAntes = 0;
		
		
		for (int i = 0; i < vet2.length; i++) {
			aux = aux + vet[i];
			media = aux/(i+1);
			if(i>0) {
				mediaAntes = (aux - vet[i])/i;
			}
			if(media > mediaAntes){
				vet2[i] = vet[i];
			}
			System.out.print(vet2[i] + " - ");
		}
		System.out.println(Arrays.toString(vet2));
	}

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o tamanho do vetor:" );
        int tamanho = entrada.nextInt();
        
        float vet[] = new float[tamanho];
        
        gerarVetor(vet);
        System.out.println(Arrays.toString(vet));
        
        priorizar(vet, tamanho);
        
        entrada.close();
	}

}
