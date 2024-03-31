package facul.desafios.exercicio_3;

public class ContaBancaria {

    private int numConta;
    private String nomeTitular;
    private float saldo;
    private int senha;

    ContaBancaria(int numConta,String nomeTitular, float saldo, int senha){

        this.numConta= numConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
        this.senha = senha;


    }

    public void depositar(float valor){
        
        this.saldo = getSaldo()+valor; 

    }

    public void sacar(float valor){

        this.saldo = getSaldo()-valor;

    }
    
    public float getSaldo(){
            
        return this.saldo;

    }

    public int getSenha(){

        return this.senha;

    }

    public boolean validaSenha(int senha){

        if(getSenha() == senha){

            return true;

        }else{
            return false;
        }

    }

    public String getNomeTitular(){

        return nomeTitular;
    }

    public int getNumeroConta(){

        return numConta;
    }

}
