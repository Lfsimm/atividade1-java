package facul.desafios.exercicio_3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
     
    public static void main(String[] args) throws IOException {

        Runtime.getRuntime().exec("clear");

        Scanner sc = new Scanner(System.in);

        List<ContaBancaria> contas = new ArrayList<ContaBancaria>();

        int numeroConta=0;
        int numeroBusca;
        String nomeTitular;
        float valor;
        int op = 0;
        int senha;

        while(op!=6){

            System.out.println("----------OPÇÕES---------\n\n      Casdastrar Conta=  1\n      Depositar Valor = 2\n      Sacar Valor = 3\n      Exibir Saldo = 4\n      Visualizar Dados= 5\n      Sair = 6");
            System.out.print(    "      Oque deseja: ");
        
            op = sc.nextInt();
            sc.nextLine();

            if(op==1){
        
                System.out.print("\ninforme o nome do titular: ");
                nomeTitular = sc.nextLine();

                System.out.print("\nInforme o Saldo inicial da conta: ");
                valor= sc.nextFloat();

                sc.nextLine();

                System.out.print("\ninforme a senha que deseja utilizar para acessar sua conta: ");
                senha = sc.nextInt();
            
                ContaBancaria nova_conta = new ContaBancaria(numeroConta,nomeTitular,valor,senha);

                contas.add(nova_conta);

                System.out.println("\nCONTA CADASTRADA COM NUMERO : "+numeroConta);
                contas.get(numeroConta).getSaldo();

            
                numeroConta++;
            }else if(op==2){

                System.out.print("\nEm qual conta deseja depositar: ");
                numeroBusca = sc.nextInt();

                if(numeroConta<0 || numeroBusca>numeroConta){

                    System.out.println("\nNUMERO DE CONTA INVALIDO");

                }else{

                    System.out.print("\nInforme a senha da conta de numero "+numeroBusca+": ");
                    senha = sc.nextInt();

                    if(contas.get(numeroBusca).validaSenha(senha)==true){

                    System.out.print("\ninforme o valor que deseja Adcionar: ");
                    valor = sc.nextFloat();

                    contas.get(numeroBusca).depositar(valor);
                    System.out.println("\nSaldo atualizado: "+contas.get(numeroBusca).getSaldo());

                    }
                }

            }else if(op==3){

                System.out.print("\nEm qual conta deseja retirar: ");
                numeroBusca = sc.nextInt();

                if(numeroConta<0 || numeroBusca>numeroConta){

                    System.out.println("\nNUMERO DE CONTA INVALIDO");
                    break;

                }else{

                    System.out.print("\nInforme a senha da conta de numero "+numeroBusca+": ");
                    senha = sc.nextInt();

                    if(contas.get(numeroBusca).validaSenha(senha)==true){

                    System.out.print("\ninforme o valor que deseja retirar: ");
                    valor = sc.nextFloat();

                    contas.get(numeroBusca).sacar(valor);
                    System.out.println("\nSaldo atualizado: "+contas.get(numeroBusca).getSaldo());

                    }

                }

            }else if(op==4){

                System.out.print("\nInforme o numero da conta que deseja visualizar: ");
                numeroBusca = sc.nextInt();

                sc.nextLine();

                System.out.print("\ninforme a senha para acessar a conta de numero "+": ");
                senha = sc.nextInt();

                if(contas.get(numeroBusca).validaSenha(senha)==true){

                    System.out.println("\nSaldo: "+contas.get(numeroBusca).getSaldo());

                }else {
                    System.out.println("\nO USUARIO NÃO TEM ACESSO A CONTA\n");
                }
            }else if(op==5){

                System.out.print("\nInforme o numero da conta que deseja visualizar: ");
                numeroBusca = sc.nextInt();

                sc.nextLine();

                System.out.print("\ninforme a senha para acessar a conta de numero "+": ");
                senha = sc.nextInt();

                if(contas.get(numeroBusca).getSenha()==senha){
                    
                    System.out.println("\nNumero da Conta: "+contas.get(numeroBusca).getNumeroConta());
                    System.out.println("\nNome do titular: "+contas.get(numeroBusca).getNomeTitular());
                    System.out.println("\nSaldo: "+contas.get(numeroBusca).getSaldo());

                }else {
                    System.out.println("O USUARIO NÃO TEM ACESSO A CONTA");
                }

            }
        }
    }
}