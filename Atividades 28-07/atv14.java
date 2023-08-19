//14.Faça um Programa que pergunte quanto você ganha por hora e o número de horas
//trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se
//que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o
//sindicato, faça um programa que nos dê:
//a. salário bruto.
//b. quanto pagou ao INSS.
//c. quanto pagou ao sindicato.
//d. o salário líquido.
//e. calcule os descontos e o salário líquido, conforme a tabela abaixo:
//f. + Salário Bruto : R$
//g. - IR (11%) : R$
//h. - INSS (8%) : R$
//i. - Sindicato ( 5%) : R$
//j. = Salário Liquido : R$
import java.util.Scanner;

public class atv14{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora?: ");
        Float porhora = input.nextFloat();   
        
        System.out.print("Quantas horas mensais você trabalha?: ");
        Float horasmensais = input.nextFloat();   

        Float salarioBruto = porhora*horasmensais;
        Float insss = salarioBruto* new Float(0.08);
        Float sindicato = salarioBruto* new Float(0.05);
        Float salarioliquido = salarioBruto* new Float(0.76);

        input.close();

        System.out.println("\nBruto: " + salarioBruto + "R$");
        System.out.println("\nInss: " + insss + "R$");
        System.out.println("\nSindicato: " + sindicato + "R$");
        System.out.println("\nLíquido: " + salarioliquido + "R$");
        
    }
}