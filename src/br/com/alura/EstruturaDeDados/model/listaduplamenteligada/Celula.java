package br.com.alura.EstruturaDeDados.model.listaduplamenteligada;

public class Celula {

    private  Object elemento;
    private Celula proxima;
    private Celula anterior;

    public Celula(Object elemento, Celula proxima) {
        this.elemento = elemento;
        this.proxima = proxima;
    }

    public Celula(Object elemento) {
        this(elemento,null);

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

    public Celula getAnterior() {
        return anterior;
    }

    public void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }

    @Override
    public String toString() {
        return elemento.toString();
    }
}
