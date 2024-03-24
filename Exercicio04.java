package Trabalho;
import java.util.Scanner;

public class Exercicio04 
{
	public static void main (String [] args)
	{
	
		Scanner scanner = new Scanner (System.in);
		System.out.println("Digite um número a partir de 0: ");
		int numero = scanner.nextInt();
		int cont = 1;
		int fator = 1;
			{
			if (numero < 0)
				System.out.println("Número Incorreto");
			}
			while (cont <= numero)
			{
			fator *= cont;
			cont++;
			}
		System.out.println("O fatorial de "+ numero + " é: " +fator);
		scanner.close();
	}
}

