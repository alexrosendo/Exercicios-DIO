package tabuada;
import java.util.Scanner;

public class tabuadaSimples {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int base = 10;
        int count = -1;
        int numeroEscolhido;

        System.out.println("Qual a tabuada que você quer saber: ");
        numeroEscolhido = scan.nextInt();

        while(count!=base){
            count++;
            int resultado = numeroEscolhido * count;
            System.out.println(numeroEscolhido + "*" + count + "=" + resultado);
        }
    }

}
