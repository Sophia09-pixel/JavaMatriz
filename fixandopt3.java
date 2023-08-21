package Aula1508;

import java.util.Scanner;

public class fixandopt3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in); 
		int codigoQtd[][] = new int[5][2];
		double preco[][] = new double[5][2];
		double totGeral=0;
		
		for(int i=0;i<5;i++) {
			System.out.print((1+i)+"°Produto");
			System.out.print("Digite o código: ");
			codigoQtd[i][0] = entrada.nextInt();
			System.out.print("Digite o preco: ");
			preco[i][0] = entrada.nextDouble();
			System.out.print("Digite a quantidade: ");
			codigoQtd[i][1] = entrada.nextInt();
			
			preco[i][1] = codigoQtd[i][1] * preco[i][0];
			totGeral+=preco[i][1];
		}
		
		for(int i =0;i < 5; i++) {
			System.out.print("Código: "+codigoQtd[i][0]+"\t");
			System.out.print("Preço: "+preco[i][0]+"\t");
			System.out.print("Quantidade: "+codigoQtd[i][1]+"\t");
			System.out.print("Total: "+preco[i][1]+"\t");
			System.out.println("");
		}
		
		System.out.println("Tota Geral: "+totGeral);
		
		
	}

}
