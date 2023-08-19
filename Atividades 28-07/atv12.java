// 12.Tendo como dado de entrada a altura, construa um algoritmo que calcule seu peso ideal,
//utilizando as seguintes fórmulas:
//Para homens: (72.7*h) - 58
//Para mulheres: (62.1*h) - 44.7 (h = altura)
import java.util.Scanner;

public class atv12{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Escreva sua altura: ");
        Float altura = input.nextFloat();   

        System.out.print("Você é homem(Escreva H) ou mulher(Escreva M): ");
        input.nextLine();   
        char sexo = input.nextLine().charAt(0); 
        Float pesoideal;  
        
        if (sexo == 'H' || sexo == 'h') {
            pesoideal = altura * new Float(72.7)-58;
        }else{
            pesoideal = altura * new Float(61.2) - new Float(44.7);
        }

        input.close();
        System.out.print("\nSeu peso ideal é: " + pesoideal);
    }
}