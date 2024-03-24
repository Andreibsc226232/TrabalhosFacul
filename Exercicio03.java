package Trabalho;
import java.util.Scanner;
public class Exercicio03 
{
	public static void main(String[]args)
	
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número de 1 á 7: ");
		int numero = scanner.nextInt();
		String resultado;
		switch (numero)
			 
		{
	        case 1:
	        resultado = "Final de Semana";
	        break;
	        case 2:
	        resultado = "Dia Útil";
	        break;
	        case 3:
	        resultado = "Dia Útil";
	        break;
	        case 4:
	        resultado = "Dia Útil";
	        break;
	        case 5:
	        resultado = "Dia Útil";
	        break;
	        case 6:
	        resultado = "Dia Útil";
	        break;
	        case 7:
	        resultado = "Final de Semana";
	        break;
	        default:
	        resultado = "Número Incorreto";
	        break;
		}
			resultado = (numero >= 1 && numero <= 7) ? resultado : resultado;System.out.println("Este dia será um: " + resultado);
			scanner.close();
	
	
	
}}
