/*4.5. Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro. Depois
modifique o programa para que ele mostre os números um ao lado do outro.*/
public class atv5 {
    public static void main(String[] args){
        for(int x=1; x<=20; x++){
            System.out.println(x);
        }
        for(int x=1; x<=20; x++){
            System.out.print(x+ ( x!=20 ? ", " : ""));
        }
    }
}