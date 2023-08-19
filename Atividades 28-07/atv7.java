//7. Faça um Programa que calcule e mostre a área de um quadrado.
import java.util.Scanner;

public class atv7{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Escreva comprimento do quadrado: ");
        Float lateral = input.nextFloat();
        Float area = lateral * lateral;

        input.close();
        System.out.print("\nSerão ["+ (area) + "] unidade de medida de área");
    }
}