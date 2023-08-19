//Faça um programa que leia e valide as seguintes informações:
//a. Nome: maior que 3 caracteres;
//b. Idade: entre 0 e 150;
//c. Salário: maior que zero;
//d. Sexo: 'f' ou 'm';
//e. Estado Civil: 's', 'c', 'v', 'd';
import java.util.Scanner;
public class atv3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Insira seu nome: ");
        String nome = input.nextLine();
        while(nome.length()<3){
            System.out.println("Nome inválido tente novamente");
            System.out.print("Insira seu nome: ");
            nome = input.nextLine();
        }
        System.out.print("Insira sua idade: ");
        int idade = input.nextInt();
        while(idade>150 || idade<0){
            System.out.println("Idade inválida tente novamente");
            System.out.print("Insira sua idade: ");
            idade = input.nextInt();
        }
        System.out.print("Insira seu salário: ");
        float salario = input.nextFloat();
        while(salario<=0){
            System.out.println("Salário inválido tente novamente");
            System.out.print("Insira seu salário: ");
            salario = input.nextFloat();
        }
        input.nextLine();
        System.out.print("Insira seu sexo: ");
        char sexo = input.nextLine().charAt(0);
        while(sexo!='f' && sexo!='m'){
            System.out.println("Sexo inválido tente novamente");
            System.out.print("Insira seu sexo: ");
            sexo = input.nextLine().charAt(0);
        }
        System.out.print("Insira seu estado civil: ");
        char estado = input.nextLine().charAt(0);
        while(estado!='s' && estado!='c' && estado!='v' && estado!='d'){
            System.out.println("Estado inválido tente novamente");
            System.out.print("Insira seu estado civil: ");
            estado = input.nextLine().charAt(0);
        }
        input.close();
    }
}
