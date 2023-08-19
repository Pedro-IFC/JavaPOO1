package vetor;

import java.util.Scanner;

//Faça um Programa que leia um vetor de 10 números reais e mostre-os na ordem inversa a
//ordem lida.
public class atv2 {
    public static void main(String[] args) {
        float[] vetor = new float[10];
        Scanner input = new Scanner(System.in);
        for(int x =0; x < vetor.length;x++){
            System.out.print("Insira um número: ");
            vetor[x] = input.nextFloat();
        }
        for(int x = 9; x >=0;x--){
            System.out.println("==========================================");
            System.out.println(vetor[x]);
        }
        input.close();
    }  
}
