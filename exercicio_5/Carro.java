package facul.desafios.exercicio_5;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private int velocidade;

    Carro(String marca,String modelo,int ano, String placa,int velocidade){

        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidade = velocidade;
    }

    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public String getPlaca(){
        return this.placa;
    }
    public int getAno(){
        return this.ano;
    }
    public int getVelocidade(){
        return this.velocidade;
    }

    void setVelocidade(int valor){

        this.velocidade = valor;
    }

    public void acelerar(int valor){

        this.setVelocidade(this.getVelocidade()+valor);

    }

    public void frear(int valor){

        if(velocidade - valor<0){
            System.out.println("VELOCIDADE MINIMA ATINGIDA");
        }
        this.setVelocidade(this.getVelocidade()-valor);

    }

    public void exibirCarros(){

        System.out.println("\n\nMarca: "+getMarca());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Ano: "+getAno());
        System.out.println("Placa: "+getPlaca());
        System.out.println("Velocidade: "+getVelocidade()+"\n\n");
    }
}
