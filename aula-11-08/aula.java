import java.util.Scanner;
public class aula{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        final int TAM = 5;
        int[] vet = new int[TAM];
        int soma =0;
        float media = 0;
        for(int x=0; x<TAM; x++){
            System.out.print("Insira um número: ");
            vet[x] = input.nextInt();
            soma += vet[x];
        }
        media = (float)soma/(float)TAM;
        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);
        input.close();
    }
}