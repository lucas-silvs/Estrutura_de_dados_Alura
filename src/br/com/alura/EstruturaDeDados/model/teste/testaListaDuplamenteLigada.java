package br.com.alura.EstruturaDeDados.model.teste;

import br.com.alura.EstruturaDeDados.model.listaLigadasimples.ListaLigada;
import br.com.alura.EstruturaDeDados.model.listaduplamenteligada.ListaDuplamenteLigada;

public class testaListaDuplamenteLigada {

    public static void main(String[] args) {
        ListaDuplamenteLigada listaLigada = new ListaDuplamenteLigada();


        listaLigada.adicionaNoComeço("1");
        listaLigada.adicionaNoComeço("2");
        listaLigada.adicionaNoComeço("3");
        System.out.println(listaLigada);

        listaLigada.adiciona("4");
        listaLigada.adiciona("5");

        System.out.println(listaLigada);

        listaLigada.adiciona(2,"6");
        System.out.println(listaLigada);

        listaLigada.remove(5);
        System.out.println(listaLigada);



        System.out.println(listaLigada.contem("2"));
        System.out.println(listaLigada.contem("9"));

        listaLigada.removerDoComeco();
        System.out.println(listaLigada);

        listaLigada.removeDoFim();
        System.out.println(listaLigada);

        listaLigada.remove(1);
        System.out.println(listaLigada);


    }
}
