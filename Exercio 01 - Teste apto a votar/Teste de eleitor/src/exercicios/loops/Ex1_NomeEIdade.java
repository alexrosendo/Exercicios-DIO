package exercicios.loops;//Aqui está escrito o nome do pacote
import java.util.*;//Aqui está a biblioteca que eu importei

public class Ex1_NomeEIdade {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Calendar calendar = new GregorianCalendar();

        String nome;
        int anoNasc;
        int anoAtual;
        int idade;
        String saudacao = null;
        int hora;

        System.out.println("Que horas são? ");
        hora = scan.nextInt();

        System.out.println("Qual o seu nome? ");
        nome = scan.next();

        /*O bloco condicional abaixo, testa qual mensagem de saudação será exibida para o
        * usúario após ele digitar a hora*/
        if((hora>=06)&&(hora<18)){
            saudacao = "Bom dia";
        }else if((hora>=18)&&(hora<24)){
            saudacao = "Boa noite,";
        }else{}

        System.out.println(saudacao + " seja bem-vindo "+nome+" !");
        System.out.println("=================================");
        System.out.println(nome+", em qual ano que você nasceu? ");
        anoNasc = scan.nextInt();
        System.out.println("Qual é o ano atual? ");
        anoAtual = scan.nextInt();

        idade=anoAtual-anoNasc;

        if(idade>16){
            System.out.println();
        }else{
            System.out.println(nome+", você não está apto a votar! ");
        }


    }
}
