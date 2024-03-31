package facul.desafios.exercicio_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    List<Jogador> jogadores =new ArrayList<Jogador>();

    String nome;
    float pontuacao;
    int nivel;
    int op=-1;
    int aux=0;
    int i=0;

    while(op!=5){

        System.out.println("----------------OPÇÕES----------------\n\n      Casdastrar Jogador=  1\n      Atualizar pontuação de jogadores = 2\n      Atualizar nivel de jogadores = 3\n      Visualizar Jogadores = 4\n      Sair = 5\n");
        System.out.print("               Oque deseja: ");

        op= sc.nextInt();

        sc.nextLine();

        if(op==1){

            System.out.print("Informe o NOME do jogador que deseja adcionar: ");
            nome = sc.nextLine();

            System.out.print("Informe a POTUNAÇÃO do jogador que deseja adcionar: ");
            pontuacao = sc.nextFloat();

            System.out.print("Informe o NIVEL do jogador que deseja adcionar: ");
            nivel = sc.nextInt();

            Jogador novo_jogador = new Jogador(nome,pontuacao,nivel);

            jogadores.add(novo_jogador);

            aux++;

        }else if(op==2){

            System.out.print("Informe o nome do jogador que deseja atualizar PONTUAÇÃO: ");
            nome = sc.nextLine();

            for(i=0;i<aux;i++){

                if(jogadores.get(i).nome.equals(nome)){

                    System.out.println("informe a Nova pontuacao do "+nome+" : ");
                    pontuacao = sc.nextFloat();

                    jogadores.get(i).mudarPontuacao(pontuacao);

                    break;
                }
            }

        }else if(op == 3){

            System.out.print("Informe o nome do jogador que deseja atualizar o NIVEL: ");
            nome = sc.nextLine();

            for(i=0;i<aux;i++){

                if(jogadores.get(i).nome.equals(nome)){

                    System.out.println("informe o Novo Nivel do "+nome+" : ");
                    nivel = sc.nextInt();

                    jogadores.get(i).mudarNivel(nivel);

                    break;

                }
                else{

                    System.out.println("NÃO EXISTE JOGADOR COM ESTE NOME!");

                }
            }
        }else if(op==4){

            for(i=0;i<aux;i++){

                System.out.println("\n\nJOGADOR "+i+":");

                System.out.print("\n\nNome "+i+": "+jogadores.get(i).nome);
                System.out.print("\nPontuacao"+i+": "+jogadores.get(i).pontuacao);
                System.out.print("\nNivel"+i+": "+jogadores.get(i).nivel);
            }
        }

    }


        
    }


    
    
}
