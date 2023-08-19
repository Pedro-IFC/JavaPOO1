//10.Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
//  a. o produto do dobro do primeiro com metade do segundo .
//  b. a soma do triplo do primeiro com o terceiro.
//  c. o terceiro elevado ao cubo.
import java.util.Scanner;

public class atv10{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Escreva um número Inteiro: ");
        int int1 = input.nextInt();    

        System.out.println("Escreva outro número Inteiro: ");
        int int2 = input.nextInt();    

        System.out.println("Escreva um número Real: ");
        Float float1 = input.nextFloat();   

        Float a = new Float((2*int1)) * new Float((int2/2));
        Float b = 3*int1 + float1;
        Float c = float1*float1*float1;
        
        input.close();
        System.out.print("\nO produto do dobro do primeiro com metade do segundo: " + a);
        System.out.print("\nA soma do triplo do primeiro com o terceiro.: " + b);
        System.out.print("\nO terceiro elevado ao cubo.: " + c);
    }
}