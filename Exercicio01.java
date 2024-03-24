package Trabalho;
import java.util.Scanner;

public class Exercicio01 
	{
	 	public static void main (String[] args) 
	 
	 	{
	 			Scanner scanner = new Scanner(System.in);
	 			System.out.println("Digite um número: " );
	 			int numero = scanner.nextInt();
		
	 			{ if (numero >=0)
	 			  System.out.println("Este é um Número Positivo");
	 			  else
	 			  System.out.println("Este é um Número Negativo");
	 			scanner.close();
	 			}
			
	 	}
	
	}