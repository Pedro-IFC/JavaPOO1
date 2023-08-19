//15.Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em
//metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro
//para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam
//R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o
//preço total.
import java.util.Scanner;

public class atv15{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("\nÁrea(m²) a ser pintada: ");
        Float area = input.nextFloat();   
        Float litros = area / 3;
        double latas = Math.ceil(litros / 18);
        input.close();

        System.out.println("\nLatas necessárias: " + latas);
        System.out.println("\nCusto: " + new Float(latas*80) + "R$");
    }
}