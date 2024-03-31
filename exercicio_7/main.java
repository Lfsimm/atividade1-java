package facul.desafios.exercicio_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {


        String nome_produto,op="/0";
        int codigo_produto, quant, i, aux=0;
        float preco;
        boolean achado=false;
        float total_relatorio=0;

        Scanner sc = new Scanner(System.in);

        List<Produto> mercado = new ArrayList<Produto>();


        while(!op.equals("SAIR")){

            System.out.println("\n\n\n----------------OPÇÕES----------------\n\n      NOVO PRODUTO\n      COMPRAR\n      VENDER\n      BUSCAR PRODUTO\n      REMOVER PRODUTO\n      VISUALIZAR RELATORIO\n      PRODUTOS DISPONIVEIS\n      ALTERAR PRECO\n      SAIR");
            System.out.print("\n\nOQUE DESEJA: ");
            op=sc.nextLine();


            if(op.equals("NOVO PRODUTO")){

                System.out.print("\ninforme o nome do produto que deseja cadastrar: ");
                nome_produto = sc.nextLine();

                System.out.print("Informe o codigo do produto: ");
                codigo_produto = sc.nextInt();

                for(i=0;i<aux;i++){

                    achado = mercado.get(i).validaCodigo(codigo_produto, aux);

                    if(achado == true){
                        
                        System.out.println("CODIGO JÁ UTILIZADO");

                        break;
                    }
                }

                if(achado ==false){

                    System.out.print("Informe o preço do produto: ");
                    preco = sc.nextFloat();

                    System.out.print("Informe o estoque inicial do item: ");
                    quant = sc.nextInt();

                    Produto novo_produto =new  Produto(nome_produto, codigo_produto, preco, quant);

                    mercado.add(novo_produto);

                    aux++;

                }if(achado == true){

                    achado = false;
                }

            sc.nextLine();

            }else if(op.equals("COMPRAR")){

                if(aux==0){

                    System.out.println("AINDA NÃO EXISTEM PRODUTOS CADASTRADOS");
                    
                }else{

                    System.out.print("Informe o codigo do poduto que foi comprado: ");
                    codigo_produto = sc.nextInt();

                    for(i=0;i<aux;i++){

                        if(mercado.get(i).getCodigo_produto()==codigo_produto){

                            achado = true;

                            break;
                        }
                    }

                    if(achado==true){

                        System.out.print("informe o a quantidade comprada do item: ");
                        quant = sc.nextInt();

                        mercado.get(i).compraProduto(quant);

                        System.out.println("-------SALDO ATUALIZADO-------");

                        System.out.print("\nPRECIONE ENTER PARA CONTINUAR: ");
                        sc.nextLine();
                        sc.nextLine();

                    }else{

                        System.out.println("PRODUTO NÃO ENCONTRADO");

                    }
                }
            }else if(op.equals("VENDER")){

                if(aux==0){

                    System.out.println("AINDA NÃO EXISTEM PRODUTOS CADASTRADOS");
                    
                }else{

                    System.out.print("Informe o codigo do poduto que foi vendido: ");
                    codigo_produto = sc.nextInt();

                    for(i=0;i<aux;i++){

                        if(mercado.get(i).getCodigo_produto()==codigo_produto){

                            achado = true;

                            break;
                        }
                    }
                    if(achado==true){

                        System.out.print("\ninforme o a quantidade vendida do item: ");
                        quant = sc.nextInt();

                        mercado.get(i).vendaProduto(quant);

                        System.out.println("-------SALDO ATUALIZADO-------");

                        System.out.print("\nPRECIONE ENTER PARA CONTINUAR: ");
                        sc.nextLine();
                        sc.nextLine();

                    }else{

                        System.out.println("PRODUTO NÃO ENCONTRADO");

                    }
                }
            }else if(op.equals("BUSCAR PRODUTO")){

                if(aux==0){

                    System.out.println("AINDA NÃO EXISTEM PRODUTOS CADASTRADOS");
                        
                }else{
                    System.out.print("\nInforme o codido do produto que deseja visualizar: ");
                    codigo_produto = sc.nextInt();

                    sc.nextLine();

                    for(i=0;i<aux;i++){

                        if(mercado.get(i).getCodigo_produto()==codigo_produto){
    
                            achado = true;
    
                            break;
                        }
                    }
                    if(achado==true){

                        mercado.get(i).exibirProdutos();

                        System.out.print("\nPRECIONE ENTER PARA CONTINUAR: ");
                        sc.nextLine();
    
                    }else{

                        System.out.println("\nPRODUTO NÃO ENCONTRADO\n");

                    }
                }

            }else if(op.equals("SAIR")){

                System.out.println("\n\nOBRIGADO VOLTE SEMPRE!!!!\n\n");

            }else if(op.equals("REMOVER PRODUTO")){

                if(aux==0){

                    System.out.println("AINDA NÃO EXISTEM PRODUTOS CADASTRADOS");
                        
                }else{
                    System.out.print("\nInforme o codido do produto que deseja remover: ");
                    codigo_produto = sc.nextInt();

                    sc.nextLine();

                    for(i=0;i<aux;i++){

                        if(mercado.get(i).getCodigo_produto()==codigo_produto){
    
                            achado = true;
    
                            break;
                        }
                    }
                    if(achado==true){

                        System.out.println("DESEJA REALMENTE REMOVER? (S/N):");
                        op = sc.nextLine();

                        if(op.equals("S")){

                            mercado.remove(i);

                            aux--;
                        }
                    }else{

                        System.out.println("\nPRODUTO NÃO ENCONTRADO\n");
                        
                    }
                }

            }else if(op.equals("VISUALIZAR RELATORIO")){

                if(aux==0){

                    System.out.println("AINDA NÃO EXISTEM PRODUTOS CADASTRADOS");
                        
                }else{

                    System.out.println("        ---------------------------------------\n");

                    for(i=0;i<aux;i++){

                        total_relatorio = total_relatorio + mercado.get(i).exibirRelatorio();

                    }
                    
                    System.out.println("\n\tTOTAL EM VALOR: "+total_relatorio);

                    System.out.println("\n        ---------------------------------------\n");
                }
            }else if(op.equals("PRODUTOS DISPONIVEIS")){

                if(aux==0){

                    System.out.println("AINDA NÃO EXISTEM PRODUTOS CADASTRADOS");
                        
                }else{

                    System.out.println("\nPRODUTOS DISPONIVEIS\n");

                    System.out.println("\n        ---------------------------------------\n");

                    for(i=0;i<aux;i++){

                        mercado.get(i).exibirDisponiveis();

                    }

                    System.out.println("\n        ---------------------------------------\n");

                }

            }else if(op.equals("ALTERAR PRECO")){

                if(aux==0){

                    System.out.println("AINDA NÃO EXISTEM PRODUTOS CADASTRADOS");
                        
                }else{
                    System.out.print("\nInforme o codido do produto que deseja alterar preço: ");
                    codigo_produto = sc.nextInt();

                    sc.nextLine();

                    for(i=0;i<aux;i++){

                        if(mercado.get(i).getCodigo_produto()==codigo_produto){
    
                            achado = true;
    
                            break;
                        }
                    }
                    if(achado==true){

                        System.out.print("Qual será o novo preço: ");
                        preco = sc.nextFloat();

                        mercado.get(i).alterarPreco(preco);

                        System.out.print("\nPRECIONE ENTER PARA CONTINUAR: ");
                        sc.nextLine();
    
                    }else{

                        System.out.println("\nPRODUTO NÃO ENCONTRADO\n");

                    }
                }


            }
            
            else{

                System.out.println("\n\nCODIGO INVALIDO!!!!");

            }

            achado=false;    

        }
    }
}