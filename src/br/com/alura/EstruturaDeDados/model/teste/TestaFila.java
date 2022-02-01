package br.com.alura.EstruturaDeDados.model.teste;

import br.com.alura.EstruturaDeDados.model.fila.Fila;

import java.util.LinkedList;
import java.util.Queue;

public class TestaFila {

    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.adiciona("Robbin");
        fila.adiciona("Lennin");
        fila.adiciona("Rodorfo");

        System.out.println(fila);


        System.out.println(fila.remove());

        System.out.println(fila);


        //Fila do Java

        Queue<String> filaDoJava = new LinkedList<>();


        filaDoJava.add("Mauricio");
        filaDoJava.add("Paulo");
        filaDoJava.add("Guilherme");
        filaDoJava.poll();
        filaDoJava.add("João");
        filaDoJava.poll();

        System.out.println(filaDoJava);
    }

}
