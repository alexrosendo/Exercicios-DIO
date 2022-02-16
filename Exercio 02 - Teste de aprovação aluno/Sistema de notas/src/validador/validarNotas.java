package validador;
import java.util.*;

public class validarNotas {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double mediaAluno;
        int mediador=4;
        String nomeAluno;
        String estadoAluno=null;
        String estadoAprovacao=null;
        int matricula;
        String turma = null;
        String opcaoProsseguir;

        System.out.println("===============================");
        System.out.println("Bem-vindo ao Validador de notas");
        System.out.println("===============================");

        System.out.println("Qual o seu nome? ");
        nomeAluno = scan.next();

        System.out.println("Qual a sua matricula? ");
        matricula = scan.nextInt();

        if((matricula>=1)&&(matricula<10)){
            turma = "Turma A";
        }else if((matricula>=10)&&(matricula<20)){
            turma = "Turma B";
        }else if((matricula>=20)&&(matricula<=30)){
            turma = "Turma C";
        }

        System.out.println("===============================");
        System.out.println("Já indentificamos a sua matricula!\n");
        System.out.println(nomeAluno+", você pertence a "+turma);
        System.out.println("===============================");
        System.out.println("Vamos descubrir o seu resultado anual?\n");
        System.out.println("S para SIM // N para não");
        opcaoProsseguir = scan.next();

        while(true){
            if(opcaoProsseguir.equals("S")){
                break;
            }else if(opcaoProsseguir.equals("N")){
                System.exit(0);
            }else{
                System.out.println("Não conseguimos entender, vamos tentar novamente");
                System.out.println("Vamos descubrir o seu resultado anual?");
                opcaoProsseguir = scan.next();
            }
        }

        System.out.println("===============================");
        System.out.println("Vamos lá, qual a sua primeira nota?");
        nota1 = scan.nextDouble();
        System.out.println("Qual a sua segunda nota?");
        nota2 = scan.nextDouble();
        System.out.println("Qual a sua terceira nota?");
        nota3 = scan.nextDouble();
        System.out.println("Qual a sua quarta nota?");
        nota4 = scan.nextDouble();
        mediaAluno=((nota1+nota2+nota3+nota4)/mediador);
        System.out.println("===============================");

        if((mediaAluno>0)&&(mediaAluno<=5)){
            estadoAluno = " você é um aluno abaixo da média";
            estadoAprovacao = ", Infelizmente você reprovou :(";
        }else if((mediaAluno>5)&&(mediaAluno<=8)){
            estadoAluno = " você é um aluno dentro da média";
            estadoAprovacao = ", Aluno aprovado :)";
        }else if((mediaAluno>8)&&(mediaAluno<=10)){
            estadoAluno = " você é um aluno acima da média";
            estadoAprovacao = ", Parabéns, por ser um destaque! ;)";
        }else{
            System.out.println("Não podemos compreender sua nota");
        }

        System.out.println(nomeAluno+estadoAluno+estadoAprovacao);
        System.out.println("===============================");

    }
}
