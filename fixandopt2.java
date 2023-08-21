package Aula1508;

import java.util.Scanner;

public class fixandopt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[][] = new int[4][4];
		Scanner entrada = new Scanner(System.in);
		int somaLinha =0;
		int somaColuna=0;
		
		for(int i =0;i<4;i++) {
			for(int j =0;j<4;j++) {
				System.out.println("Digite o valor "+"[Linha "+i+" - Coluna"+j+"]");
				num[i][j] = entrada.nextInt();
			}
		}
		for(int i =0;i<4;i++) {
			somaLinha =0;
			somaColuna=0;
			for(int j =0;j<4;j++) {
				somaLinha+=num[i][j];
				somaColuna+=num[j][i];
			}
			System.out.println("Soma Linha "+i+": "+somaLinha);
			System.out.println("Soma Coluna "+i+": "+somaColuna);
		}
		
	}

}
