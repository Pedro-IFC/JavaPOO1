/*
34. Faça um programa que leia uma quantidade indeterminada de números positivos e conte
quantos deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada
de dados deverá terminar quando for lido um número negativo.
*/
import java.util.Scanner;
public class atv34 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = 0;
        int fora100 = 0;
        int ate25 = 0;
        int ate50 = 0;
        int ate75 = 0;
        int ate100 = 0;
        do {
            System.out.print("Escreva um número: ");
            num = input.nextInt();
            if(num>=0){
                if(num<=25){
                    ate25++;
                }else if(num<=50){
                    ate50++;
                }else if(num<=75){
                    ate75++;
                }else if(num<=100){
                    ate100++;
                }else{
                    fora100++;
                }
            }
        } while (num>=0);
        System.out.println("Até de 0 à 25: " + ate25);
        System.out.println("Até de 26 à 50: " + ate50);
        System.out.println("Até de 51 à 75: " + ate75);
        System.out.println("Até de 76 à 100: " + ate100);
        System.out.println("Além de 100: " + fora100);
        input.close();
    }
}
