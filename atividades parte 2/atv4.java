/*4. Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa
anual de crescimento de 3% e que a população de B seja 200000 habitantes com uma taxa de
crescimento de 1.5%. Faça um programa que calcule e escreva o número de anos necessários
para que a população do país A ultrapasse ou iguale a população do país B, mantidas as
taxas de crescimento. Altere o programa anterior permitindo ao usuário informar as
populações e as taxas de crescimento iniciais. Valide a entrada e permita repetir a
operação.*/
import java.util.Scanner;
public class atv4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Insira o numero de habitantes da cidade A: ");
        double hab_a = input.nextFloat();
        System.out.print("Insira a taxa de crescimento da cidade A: ");
        double taxa_a = input.nextFloat();
        System.out.print("Insira o numero de habitantes da cidade B: ");
        double hab_b = input.nextFloat();
        System.out.print("Insira a taxa de crescimento da cidade B: ");
        double taxa_b = input.nextFloat();
        int x = 0;
        for (; hab_a<hab_b; x++) {
            hab_a+=hab_a*taxa_a/100;
            hab_b+=hab_b*taxa_b/100;
        }
        input.close();
        System.out.println("Se passaram: " + x + " anos");
        System.out.println("A cidade A possui: " + hab_a + " habitantes");
        System.out.println("A cidade B possui: " + hab_b + " habitantes");
    }
}