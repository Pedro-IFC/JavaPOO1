//Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
import java.util.Scanner;

public class atv2{
    public static void main(String[] args){
        System.out.print("Escreva um número: ");
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();
        input.close();
        System.out.print("\nO número informado foi ["+ numero + "]");
    }
}