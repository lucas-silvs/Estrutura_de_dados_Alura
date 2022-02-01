package br.com.alura.EstruturaDeDados.model.teste;

import br.com.alura.EstruturaDeDados.model.listaLigadasimples.ListaLigada;

public class TestaListaLigada {

    public static void main(String[] args) {
        ListaLigada listaLigada = new ListaLigada();


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

        listaLigada.adiciona(5,'7');
        System.out.println(listaLigada);

        System.out.println(listaLigada.contem("2"));
        System.out.println(listaLigada.contem("9"));

        listaLigada.removerDoComeco();
        System.out.println(listaLigada);
    }
}
