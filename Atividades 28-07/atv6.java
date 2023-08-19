//6. Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
import java.util.Scanner;

public class atv6{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Escreva o raio do círculo: ");
        Float raio = input.nextFloat();
        Float area = new Float(3.14) * raio * raio;

        input.close();
        System.out.print("\nSerão ["+ (area) + "] unidade de medida de área");
    }
}