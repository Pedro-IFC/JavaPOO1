//Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor
//seja inválido e continue pedindo até que o usuário informe um valor válido.
import java.util.Scanner;
public class atv1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Insira uma nota de 0 a 10: ");
        float nota = input.nextFloat();
        while(nota>10 || nota<0){
            System.out.println("Valor inválido tente novamente");
            System.out.print("Insira uma nota de 0 a 10: ");
            nota = input.nextFloat();
        }
        System.out.println("A nota é: " + nota);
        input.close();
    }
}