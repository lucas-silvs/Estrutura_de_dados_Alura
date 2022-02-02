package br.com.alura.EstruturaDeDados.model.teste;

import br.com.alura.EstruturaDeDados.model.conjunto.Conjunto;

import java.util.LinkedList;
import java.util.List;

public class TesteConjunto {

    public static void main(String[] args) {

        List conjunto =  new LinkedList<String>();

        conjunto.add("Mauricio");

        if(!conjunto.contains("Mauricio")){
            conjunto.add("Mauricio");
        }

        Conjunto conjunto1 = new Conjunto();

        conjunto1.adiciona("Mauricio");

        conjunto1.adiciona("Laura");

        conjunto1.adiciona("Mauricio");
        conjunto1.adiciona("Marcelo");

        System.out.println(conjunto1);

        conjunto1.adiciona("Lucas");

        System.out.println(conjunto1);

        conjunto1.remove("Lucas");

        System.out.println(conjunto1);

        Conjunto conjunto2 = new Conjunto();

        conjunto2.adiciona("Mauricio");
        conjunto2.adiciona("Mauricio");
        conjunto2.adiciona("Guilherme");
        conjunto2.adiciona("Paulo");
        conjunto2.remove("Guilherme");

        System.out.println("Exercicio do modulo\n");

        System.out.println(conjunto2);


    }


}
