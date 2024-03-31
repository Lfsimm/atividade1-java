package facul.desafios.desafio6;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    List<Contato> contatos =new ArrayList<Contato>();


    Agenda(){

    }

    public void buscarContato(String nome){

        int i=0;

        while (!contatos.get(i).nome.equals(nome)){

            System.out.println("TESTE");
            i++;
        }

    }

    void addLista(Contato novo_contato){

        contatos.add(novo_contato);

        System.out.println("teste");
    }
}
