package br.com.alura.EstruturaDeDados.model.teste;

import br.com.alura.EstruturaDeDados.model.pilha.Pilha;

import java.util.Stack;

public class TestaPilha {

    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        pilha.push("Lucas");

        pilha.push("Maninho");

        System.out.println(pilha);

        System.out.println(pilha.pop());

        System.out.println(pilha.isEmpty());

        System.out.println("Pilha do Java Stack");

        //pilha do Java
        Stack<String> pilhaDoJava = new Stack<>();


        pilhaDoJava.push("Mauricio");
        pilhaDoJava.push("Marcelo");
        pilhaDoJava.pop();
        pilhaDoJava.push("Guilherme");
        pilhaDoJava.push("Paulo");
        pilhaDoJava.pop();
        pilhaDoJava.push("João");

        System.out.println(pilhaDoJava);

        System.out.println(pilhaDoJava.pop());

        System.out.println(pilhaDoJava.isEmpty());

        String peek = pilhaDoJava.peek();

        System.out.println(peek);

        System.out.println(pilhaDoJava);

    }
}
