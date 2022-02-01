package br.com.alura.EstruturaDeDados.model.fila;

import java.util.LinkedList;
import java.util.List;

public class Fila {

    private List<String> alunos = new LinkedList<String>();

    public void adiciona(String nome){
        alunos.add(nome);

    }

    public String remove(){
        return alunos.remove(0);
    }


    public boolean isEmpty(){
        return alunos.isEmpty();
    }


    @Override
    public String toString() {
        return alunos.toString();
    }
}
