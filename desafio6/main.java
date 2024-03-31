package facul.desafios.desafio6;

import Agenda.addLista;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        String op;
        int contato;
        String nome;

       System.out.println("\n\n\n----------------OPÇÕES----------------\n\n      NOVO CONTATO\n      ACELERAR\n      REDUZIR\n      BUSCAR CARRO\n      SAIR\n");
       System.out.print("OQUE DESEJA: ");
       op=sc.nextLine();


       while(!op.equals("SAIR")){

        if(op.equals("NOVO CONTATO")){

            System.out.print("Informe o Contato que deseja adcionar: ");
            contato = sc.nextInt();

            sc.nextLine();

            System.out.print("Informe o Nome do Novo Contato: ");
            nome=sc.nextLine();

            Contato novo_contato = new Contato(contato, nome);

            addLista(novo_contato);

        }if(op.equals("REMOVER CONTATO")){

        }if(op.equals("BUSCAR CONTATO")){

            System.out.print("Informe o nome do contato: ");
            nome = sc.nextLine();


        }
       }
    }
}
