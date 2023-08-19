/*
 * 35. O cardápio de uma lanchonete é o seguinte:
    • Especificação Código Preço
    Cachorro Quente 100 R$ 1,20
    Bauru Simples 101 R$ 1,30
    Bauru com ovo 102 R$ 1,50
    Hambúrguer 103 R$ 1,20
    Cheeseburguer 104 R$ 1,30
    Refrigerante 105 R$ 1,00

    Faça um programa que leia o código dos itens pedidos e as quantidades desejadas. Calcule e
    mostre o valor a ser pago por item (preço * quantidade) e o total geral do pedido. Considere
    que o cliente deve informar quando o pedido deve ser encerrado.
 */
import java.util.Scanner;
public class atv35 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int cod = 1;
        int quant = 0;
        float precoF = 0;
        int[] qt = new int[6]; 
        float val = 0;
        for (int i : qt) {
            qt[i]=0;
        }
        do{
            System.out.print("Fale o código do pedido(digite 0 para encerrar ou 69 para verificar o pedido): ");
            cod = input.nextInt();
            if(cod==101 || cod ==100 || cod ==102 || cod ==103 || cod ==104 || cod==105){
                System.out.print("Quantidade(caso retirar digite \"-\"quantidade para retirada): ");
                quant = input.nextInt();
                int indice=0;
                switch(cod){
                    case 100:
                        val = 1.20f;
                        indice=0;
                    break;
                    case 101:
                        val = 1.30f;
                        indice=1;
                    break;
                    case 102:
                        val = 1.50f;
                        indice=2;
                    break;
                    case 103:
                        val = 1.20f;
                        indice=3;
                    break;
                    case 104:
                        val = 1.30f;
                        indice=4;
                    break;
                    case 105:
                        val = 1.00f;
                        indice=5;
                    break;
                }
                float preco =quant*val;
                if(preco+precoF>=0){
                    precoF+=preco;
                    qt[indice]+=quant;
                }else{
                    System.out.println("O preço será negativo, operação cancelada, tente novamente");
                }
            }else if(cod==69){
                System.out.println(qt[0] + " Cachorro Quente: " + (qt[0]*1.20f));
                System.out.println(qt[1] + " Bauru Simples: " + (qt[1]*1.30f));
                System.out.println(qt[2] + " Bauru com ovo: " + (qt[2]*1.50f));
                System.out.println(qt[3] + " Hambúrguer: " + (qt[3]*1.20f));
                System.out.println(qt[4] + " Cheeseburguer: " + (qt[4]*1.30f));
                System.out.println(qt[5] + " Refrigerante: " + (qt[5]*1.00f));
                System.out.println("Preço final: " + precoF);
            }else if(cod!=0){
                System.out.println("Cod invalido");
            }
        }while(cod!=0);
        System.out.println(qt[0] + " Cachorro Quente: " + (qt[0]*1.20f));
        System.out.println(qt[1] + " Bauru Simples: " + (qt[1]*1.30f));
        System.out.println(qt[2] + " Bauru com ovo: " + (qt[2]*1.50f));
        System.out.println(qt[3] + " Hambúrguer: " + (qt[3]*1.20f));
        System.out.println(qt[4] + " Cheeseburguer: " + (qt[4]*1.30f));
        System.out.println(qt[5] + " Refrigerante: " + (qt[5]*1.00f));
        System.out.println("Preço final: " + precoF);
        input.close();
    }
}
