package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno a1 = new Aluno();
		
		System.out.print("Digite suas notas: ");
		a1.nota1 = sc.nextDouble();
		a1.nota2 = sc.nextDouble();
		a1.nota3 = sc.nextDouble();
		
		a1.resutado();
	}

}
