//16.Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em
//metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro
//para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam
//R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
//o Informe ao usuário as quantidades de tinta a serem compradas e os respectivos
//preços em 2 situações:
//o comprar apenas latas de 18 litros;
//o comprar apenas galões de 3,6 litros;
import java.util.Scanner;

public class atv16{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("\nÁrea(m²) a ser pintada: ");
        Float area = input.nextFloat();   
        Float litros = area / 6;
        double latas18L = Math.ceil(litros / 18);
        double latas136L = Math.ceil(litros / 3.6);

        input.close();

        System.out.println("\nLatas necessárias de 18L: " + latas18L);
        System.out.println("\nCusto com latas de 18L: " + new Float(latas18L*80) + "R$");
        System.out.println("\nLatas necessárias de 3.6L: " + latas136L);
        System.out.println("\nCusto com latas de 3.6L: " + new Float(latas136L*25) + "R$");
    }
}