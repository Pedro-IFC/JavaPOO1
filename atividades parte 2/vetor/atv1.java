package vetor;
//1. Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.

import java.util.Scanner;

public class atv1 {
    public static void main(String[] args){
        int[] vetor = new int[5];
        Scanner input = new Scanner(System.in);
        for(int x =0; x < vetor.length;x++){
            System.out.print("Insira um número: ");
            vetor[x] = input.nextInt();
        }
        for(int x =0; x < vetor.length;x++){
            System.out.println("==========================================");
            System.out.println(vetor[x]);
        }
        input.close();
    }   
}
