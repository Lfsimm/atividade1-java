package facul.desafios.exercicio_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Carro> carros =new ArrayList<Carro>();

        int ano;
        int i;
        int total=0;
        int velocidade=0;
        int aux;
       String marca;
       String modelo;
       String placa;
       String op = "\0";

       System.out.println("\n\n\n----------------OPÇÕES----------------\n\n      NOVO CARRO\n      ACELERAR\n      REDUZIR\n      BUSCAR CARRO\n      SAIR\n");
       System.out.print("OQUE DESEJA: ");
       op=sc.nextLine();



    while(!op.equals("SAIR")){

        if(op.equals("NOVO CARRO")){

            System.out.print("\ninforme a Marca do Carro: ");
            marca = sc.nextLine();


            System.out.print("\ninforme o Modelo do Carro: ");
            modelo = sc.nextLine();

            System.out.print("\ninforme o Ano do Carro: ");
            ano = sc.nextInt();

            sc.nextLine();

            System.out.print("\ninforme a Placa do Carro: ");
            placa = sc.nextLine();

            System.out.print("\ninforme a Velocidade inicial do Carro: ");
            velocidade = sc.nextInt();

            Carro novo_carro = new Carro(marca,modelo,ano,placa,velocidade);

            carros.add(novo_carro);

            total++;

            sc.nextLine();
            
        }else if(op.equals("ACELERAR")){

            System.out.print("\ninforme a Placa do carro: ");
            placa = sc.nextLine();

            for(i=0;i<total;i++){

                if(carros.get(i).getPlaca().equals(placa)){
                    
                    break;
                }

            }

            System.out.print("\nQuanta velocidade o carro ganhou: ");
            velocidade = sc.nextInt();

            carros.get(i).acelerar(velocidade);

            sc.nextLine();
            

        }else if(op.equals("REDUZIR")){

            System.out.print("\ninforme a Placa do carro: ");
            placa = sc.nextLine();

            for(i=0;i<total;i++){

                if(carros.get(i).getPlaca().equals(placa)){   
                    break;
                }
            }

            System.out.print("\nQuanta velocidade o carro perdeu: ");
            velocidade = sc.nextInt();

            carros.get(i).frear(velocidade);

            sc.nextLine();

            }else if(op.equals("BUSCAR CARRO")){

                System.out.print("\ninforme a Placa do carro: ");
                placa = sc.nextLine();

                for(i=0;i<total;i++){

                    if(carros.get(i).getPlaca().equals(placa)){

                        break;

                    }
                } 
                carros.get(i).exibirCarros();    
            }

            System.out.print("OQUE DESEJA  : ");
            op=sc.nextLine();
        }
    }
}
