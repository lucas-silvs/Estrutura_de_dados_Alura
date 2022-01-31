package br.com.alura.EstruturaDeDados.model.listaLigadasimples;

public class Celula {

    private  Object elemento;
    private Celula proxima;

    public Celula(Object elemento, Celula proxima) {
        this.elemento = elemento;
        this.proxima = proxima;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    public Celula getProxima() {
        return proxima;
    }

    public void setProxima(Celula proxima) {
        this.proxima = proxima;
    }

    @Override
    public String toString() {
        return elemento.toString();
    }
}
