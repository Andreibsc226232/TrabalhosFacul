package Trabalho;
import java.util.Scanner;
public class Exercicio06 
{
	public static void main (String[] args) 
	
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número de 1 á 12: " );
		int numero = scanner.nextInt();
		String Resultado = "";
		
		switch (numero)
		{
		case 12:
		case 1:
		case 2:
		Resultado = "Neste mês estamos no Verão.";
		break;
		case 3:	
		case 4:
		case 5:
		Resultado = "Neste mês estamos no Outono.";
		break;
		case 6: 
		case 7:
		case 8:
		Resultado = "Neste mês estamos no Inverno.";
		break;
		case 9:
		case 10:
		case 11:
		Resultado = "Neste mês estamos na Primavera.";
		break;
		default:
		Resultado = "Numero Incorreto";
		break;
		}
		System.out.println(Resultado);
		scanner.close();
	}
}
