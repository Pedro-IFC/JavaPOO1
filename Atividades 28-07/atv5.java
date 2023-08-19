//5. Faça um Programa que converta metros para centímetros.
import java.util.Scanner;

public class atv5{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Escreva o valor em metros: ");
        Float metros = input.nextFloat();
        Float centimetros = metros * 100;

        input.close();
        System.out.print("\nSerão ["+ (centimetros) + "] centímetros");
    }
}