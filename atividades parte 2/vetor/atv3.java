package vetor;

import java.util.Scanner;

//Faça um Programa que leia 4 notas, mostre as notas e a média na tela.
public class atv3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] notas= new float[4];
        System.out.println("Insira sua nota");
        notas[0] = input.nextFloat();
        System.out.println("Insira sua nota");
        notas[1] = input.nextFloat();
        System.out.println("Insira sua nota");
        notas[2] = input.nextFloat();
        System.out.println("Insira sua nota");
        notas[3] = input.nextFloat();
        float media = (notas[0]+notas[1]+notas[2]+notas[3])/4f;
        System.out.println("A média é: " + media);
        input.close();        
    }
}
