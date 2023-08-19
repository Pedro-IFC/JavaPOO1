//Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre a
//temperatura em graus Celsius.
//C = (5 * (F-32) / 9) / C = (F – 32) / 1,8
import java.util.Scanner;

public class atv9{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Temperatura em Farenheit: ");
        Float farenheit = input.nextFloat();    

        Float celcius = (farenheit-32)/ new Float(1.8);
        input.close();
        System.out.print("\n["+ farenheit +"]ºF serão ["+ (celcius) + "] ºC");
    }
}