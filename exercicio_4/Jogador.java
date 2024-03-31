package facul.desafios.exercicio_4;

public class Jogador {

    String nome;
    float pontuacao;
    int nivel;

    Jogador(String nome, Float pontuacao,int nivel){

        this.nome = nome;
        this.pontuacao = pontuacao;
        this.nivel = nivel;

    }

    public void mudarPontuacao(float pontuacao){

        this.pontuacao = pontuacao;

    }

    public void mudarNivel(int nivel){

        this.nivel = nivel;

    }



}
