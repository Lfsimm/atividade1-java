package facul.desafios.exercicio_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        

        List<Livro> bibli = new ArrayList<Livro>();

        int op=0;
        int aux=0;
        int i;

        String titulo;
        String autor;
        String ano;

        while(op!=4){

            System.out.println("----------OPÇÕES---------\n\n      Adcionar  Livro=  1\n      Buscar Livro = 2\n      Visualizar Livros = 3\n      Sair = 4");
            op = sc.nextInt();
            sc.nextLine();

            if(op==1){

                System.out.println("Informe o Titulo do novo Livro: ");
                titulo = sc.nextLine();

                System.out.println("Informe o Autor do novo Livro: ");
                autor = sc.nextLine();   

                System.out.println("Infore o Ano do novo Livro (dd/mm/aa): ");
                ano = sc.nextLine();

                Livro novo_livro = new Livro(titulo,autor,ano);
                
                bibli.add(novo_livro);

                aux++;

            }else if(op==2){

                System.out.println("Informe o titulo do livro que deseja buscar: ");
                titulo=sc.nextLine();

                bibli.get(0).exibirInfo(true);

            }else if(op==3){

                for(i=0;i<aux;i++){

                    System.out.println("Livro "+i+": ");

                    bibli.get(i).exibirInfo(true);

                }
            }
        }
    }
}
