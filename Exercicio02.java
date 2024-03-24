package Trabalho;
import java.util.Scanner;

public class Exercicio02 

{
				public static void main (String[] args)
	
	{
				Scanner scanner = new Scanner(System.in);
				System.out.println("Digite um Número: ");
				int numero = scanner.nextInt();
			{
				if (numero % 2==0)
				System.out.println("Este número é Par");
				else
				System.out.println("Este número é Impar");
				scanner.close();
			}			
	}
}
