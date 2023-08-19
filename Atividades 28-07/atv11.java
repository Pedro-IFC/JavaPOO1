// 11.Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que
// calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) – 58.
import java.util.Scanner;

public class atv11{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Escreva sua altura: ");
        Float altura = input.nextFloat();   
        Float pesoideal = altura * new Float(72.7)-58;

        input.close();
        System.out.print("\nSeu peso ideal é: " + pesoideal);
    }
}