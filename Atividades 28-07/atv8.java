//8. Faça um Programa que pergunte quanto você ganha por hora e o número de horas
// trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
import java.util.Scanner;

public class atv8{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora: ");
        Float porhora = input.nextFloat();    

        System.out.print("Quantas horas você trabalha em media por dia no mês: ");
        Float horas = input.nextFloat();

        Float salario = horas*porhora*31;
        input.close();
        System.out.print("\nSerão R$["+ (salario) + "] mensais, considerando um mês 31 dias ");
    }
}