package facul.desafios.exercicio_2;

public class Livro {

    String titulo;
    String autor;
    String ano;


    Livro(String titulo, String autor, String ano){

        this.titulo= titulo;
        this.autor=autor;
        this.ano=ano;

    }

    public void exibirInfo(boolean mostrar){
  
        System.out.println(""+titulo);
        System.out.println(""+autor);
        System.out.println(""+ano);
        System.out.println("\n\n\n");
    }
}
