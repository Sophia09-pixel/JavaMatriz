package Aula1508;

import java.util.Scanner;

public class fixando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Fixando Matriz Exemplo 1
		Scanner entrada = new Scanner(System.in);
		 int numeros[][] = new int [3][3];
		 
		 for(int i =0;i<3;i++) {
			 for(int j=0;j<3;j++) {
				 System.out.println("Digite o elemento da matriz :["+i+"]"+"["+j+"]");
				 numeros[i][j] = entrada.nextInt();
			 }
			 
		 }
		 for(int i =0;i<3;i++) {
			 for(int j=0;j<3;j++) {
				System.out.print(numeros[i][j]+"\t");
			 }
			 System.out.println("");
		 }
		 
	}

}
