package vetor;

import java.util.Scanner;

//14. Foram anotadas as idades e alturas de 30 alunos. Faça um Programa que determine quantos
//alunos com mais de 13 anos possuem altura inferior à média de altura desses alunos.
public class atv14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] idade = new int[3];
        int[] altura = new int[3];
        float mediaAltura = 0;
        int contador=0;
        for(int x = 0; x<3; x++){
            System.out.print("Altura: ");
            altura[x]=input.nextInt();
            System.out.print("Idade: ");
            idade[x]=input.nextInt();
            mediaAltura +=altura[x];
        }
        mediaAltura=mediaAltura/3;
        for(int i = 0; i<3; i++){
            if(idade[i]>=13 && (float)altura[i]<mediaAltura){
                System.out.println("teste");
                contador++;
            }
        }
        System.out.print("Alunos com mais de 13 menores que a média: " + contador);
        input.close();
    }
}
