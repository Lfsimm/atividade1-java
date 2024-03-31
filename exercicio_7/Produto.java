package facul.desafios.exercicio_7;

import java.util.Scanner;

public class Produto {

    private String nome_produto;
    private int codigo_produto;
    private float preco;
    private int quant;

    Scanner sc = new Scanner(System.in);

    Produto(String nome_produto,int codigo_produto,float preco,int quant){

        this.nome_produto = nome_produto;
        this.codigo_produto = codigo_produto;
        this.preco = preco;
        this.quant = quant;

    }

    public int getCodigo_produto() {
        return codigo_produto;
    }

    public int getQuant() {
        return quant;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco){

        this.preco = preco;
    }

    public void setQuant(int quant) {

        this.quant = quant;

    }

    public void compraProduto(int quant){

        this.setQuant(this.getQuant()+quant);

    }

    public void vendaProduto(int quant){

        String op;


        if(getQuant()-quant<0){

            System.out.println("SALDO INSUFICIENTE!!!!!!!");
        }else{

            System.out.println("Valor total da compra: "+getPreco()*quant);

            System.out.println("Deseja continuar(S/N): ");
            op = sc.nextLine();

            if(op.equals("S")){

                this.setQuant(this.getQuant()-quant);

            }else if(op.equals("N")){

                System.out.println("Venda Cancelada");

            }else{

                System.out.println("VENDA CANCELADA DEVIDO A OPÇÃO INVALIDA");
                
            }
        }

    }

    public void exibirProdutos(){

        System.out.println("----------------------------------------");
        System.out.println("Nome : "+getNome_produto());
        System.out.println("Codigo: "+getCodigo_produto());
        System.out.println("Preço: "+getPreco());
        System.out.println("Quantidade: "+getQuant());
        System.out.println("-----------------------------------------");

    }

    public boolean validaCodigo(int codigo, int aux){

        int i=0;

            if(codigo== getCodigo_produto()){
                return true;
            }else {

                return false;
            }
    }

    public float exibirRelatorio(){

        if(getQuant()<0){
            System.out.println("produto ("+getNome_produto()+") não possui unidades no estoque");
        }else{
            System.out.println("\tproduto ("+getNome_produto()+") ( "+getQuant()+" ) ("+getPreco()+")  ||| TOTAL: "+getPreco()*getQuant());
        }

        return getPreco()*getQuant();

    }

    public void exibirDisponiveis(){

        if(getQuant()>0){

        System.out.println("\tPRODUTO ("+getNome_produto()+") ( "+getQuant()+" ) ("+getPreco()+")  ||| TOTAL: "+getPreco()*getQuant());

        }
    
    }

    public void alterarPreco(float preco){

        if(preco<0){

            System.out.println("VALOR INVALIDO!!!!!");
        }else{

            setPreco(preco);

        }


    }
    
}