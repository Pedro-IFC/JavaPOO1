//Faça um Programa que peça dois números e imprima a soma.
import java.util.Scanner;

public class atv3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Escreva um número: ");
        int numero = input.nextInt();

        System.out.print("Escreva outro número: ");
        int numero2 = input.nextInt();
        input.close();
        System.out.print("\nA soma é ["+ (numero + numero2) + "]");
    }
}