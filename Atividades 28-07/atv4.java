//Faça um Programa que peça as 4 notas bimestrais e mostre a média.
import java.util.Scanner;

public class atv4{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Escreva a nota do 1º semestre: ");
        Float primeiro = input.nextFloat();

        System.out.print("Escreva a nota do 2º semestre: ");
        Float segundo = input.nextFloat();

        System.out.print("Escreva a nota do 3º semestre: ");
        Float terceiro = input.nextFloat();
        
        System.out.print("Escreva a nota do 4º semestre: ");
        Float quarto = input.nextFloat();

        Float media = (primeiro + segundo + terceiro + quarto)/4;
        
        input.close();
        System.out.print("\nSua média anual foi ["+ (media) + "]");
    }
}