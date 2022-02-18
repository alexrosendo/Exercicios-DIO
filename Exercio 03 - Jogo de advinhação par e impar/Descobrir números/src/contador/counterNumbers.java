package contador;
import java.util.Scanner;

public class counterNumbers {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numeroX;
        int counterOne = 0;
        int impar = 0;
        int par = 0;

        System.out.println("==============================");
        System.out.println("==    Jogo da advinhação    ==");
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("=  Informe até qual numero   =");
        System.out.println("=  você quer que eu te diga  =");
        System.out.println("=  quantidade de par / impar =");
        System.out.println("==============================");
        numeroX = scan.nextInt();
        System.out.println("==============================");



        while(counterOne!=numeroX){

            counterOne++;
            if(counterOne % 2 == 0)par++;
            else impar++;

        }
        System.out.println("== De 1 até "+numeroX+" nós temos:  ==");
        System.out.println("==============================");
        System.out.println("==     "+par+" números pares     ==");
        System.out.println("==     "+impar+" números impares   ==");
        System.out.println("==============================");


    }
}
