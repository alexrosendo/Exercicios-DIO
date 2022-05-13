package FUNCOES;

import java.util.Scanner;

public class Exemplo08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tamanho;
        System.out.println("Quantas frutas você deseja informar?");
        tamanho = Integer.parseInt(scan.nextLine());
        String frutas[]=new String[tamanho];

        for(int i=0; i<frutas.length; i++){
            System.out.println("Digite o nome da "+(i+1)+" fruta: ");
            String fruta = scan.nextLine();
            frutas[i]= fruta;
        }

        int i= frutas.length;
        int counter = 0;

        while (i>counter){
            System.out.print(frutas[i-1] + " ");
            i--;
        }


    }
}
