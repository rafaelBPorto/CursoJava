package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int [][] mat;
		
		System.out.print("Informe o número de linhas: ");
		int M = sc.nextInt();
		
		System.out.print("Informe o número de colunas: ");
		int N = sc.nextInt();
		
		mat = new int[M][N];
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				System.out.print("Elemento ["+i+"]["+j+"]: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Infome um número presente na matriz: ");
		int X = sc.nextInt();
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) { 
				if(X == mat[i][j]) {
					System.out.println("Position " +i + "," + j);
					if ((j)>0)
						System.out.println("Left: " + mat[i][j-1] );
					if (j<mat[i].length - 1)
						System.out.println("Rigtht: " + mat[i][j+1]);
					if (i>0)
						System.out.println("Up: " + mat[i-1][j]);
					if (i<mat.length -1)
						System.out.println("Down: " + mat[i+1][j]);						
				}

			}
		}
		sc.close();
	}

}
