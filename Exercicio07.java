package Trabalho;
import java.util.Scanner;
public class Exercicio07 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        //Essa linha abaixo peguei no google
        int num = (int) (Math.random() * 100) + 1; 
        int tentativa;
        
        System.out.println("Adivinhe um numero de 01 á 100" );

        do 
        {
            System.out.print("Digite sua tentativa: ");
            tentativa = scanner.nextInt();
            
            if (tentativa < num) 
            {
                System.out.println("O número é maior!");
            } 
            else if (tentativa > num)
            {
                System.out.println("O número é menor!");
            }
        } 
        while (tentativa != num);
        
        System.out.println("Parabéns! Você acertou o número " + num + "!");
        
        scanner.close();
    }
}