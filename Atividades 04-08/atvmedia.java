import java.util.Scanner;
public class atvmedia{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a primeira nota: ");
        float n1 = input.nextFloat();
        System.out.print("\nInforme a segunda nota: ");
        float n2 = input.nextFloat();
        System.out.print("\nInforme a terceira nota: ");
        float n3 = input.nextFloat();
        System.out.print("\nInforme a quarta nota: ");
        float n4 = input.nextFloat();
        System.out.print("\nInforme a sua frequência(%): ");
        float freq = input.nextFloat();
        float media = (n1+n2+n3+n4)/4;
        System.out.print("\nNota 1: " + n1);
        System.out.print("\nNota 2: " + n2);
        System.out.print("\nNota 3: " + n3);
        System.out.print("\nNota 4: " + n4);
        System.out.print("\nA média é: " + media);
        if(freq<75){
            System.out.print("\nVocê reprovou por frequência");
        }else if(media>=6){
            System.out.print("\nVocê foi aprovado");
        }else{
            System.out.print("\nVocê reprovou");
        }
        input.close();
    }
}