package entities;

public class Aluno {

	public String aluno;
	public double nota1;
	public double nota2;
	public double nota3;
	public double notaFinal;
	
	public void resutado() {
		notaFinal = nota1 + nota2 + nota3;
		if (notaFinal >= 60) {
			System.out.printf("Nota Final, %.2f%nAprovado", notaFinal);
		}
		else {
			System.out.printf("Notal Final, %.2f%nReprovado", notaFinal);
		}
	}
}
