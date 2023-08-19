//Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao
//nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.
import java.util.Scanner;
public class atv2 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Insira seu nome: ");
        String nome = input.nextLine();
        System.out.print("Insira sua senha: ");
        String senha = input.nextLine();
        while(senha.equals(nome)){
            System.out.println("A senha não deve ser igual ao nome");
            System.out.print("Insira seu nome: ");
            nome = input.nextLine();
            System.out.print("Insira sua senha: ");
            senha = input.nextLine();
        }
        input.close();
    }
}
