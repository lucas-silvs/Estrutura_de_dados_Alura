package br.com.alura.EstruturaDeDados.model.listaduplamenteligada;

public class ListaDuplamenteLigada {
    
    private Celula primeira = null;
    private int totalDeElementos = 0;
    private Celula ultima = null;
    public void adicionaNoComeço(Object elemento){

        if(this.totalDeElementos==0) {
            Celula nova = new Celula(elemento);
            this.primeira = nova;
            this.ultima = nova;
        }else{
            Celula nova = new Celula(elemento,this.primeira);
            this.primeira.setAnterior(nova);
            this.primeira = nova;
        }
        this.totalDeElementos++;
    }
    public void adiciona(Object elemento){
        if(this.totalDeElementos==0){
            adicionaNoComeço(elemento);
        }
        else {
            Celula nova = new Celula(elemento);
            this.ultima.setProxima(nova);
            nova.setAnterior(this.ultima);
            this.ultima = nova;
            this.totalDeElementos++;
        }



    }

    private boolean posicaoValida(int posicao){
        if(posicao >=0 && posicao<this.totalDeElementos){
            return  true;
        }
        return false;
    }

    private Celula pegaCelula(int posicao){
        if(!posicaoValida(posicao)){
            throw new IllegalArgumentException("posição invalida");
        }



        Celula atual = this.primeira;

        for (int i = 0; i<posicao;i++){
            atual = atual.getProxima();
        }

        return atual;
    }
    public void adiciona(int posicao, Object elemento) {
        if (posicao == 0 || this.totalDeElementos == 0){
            adicionaNoComeço(elemento);

        }else if(posicao==this.totalDeElementos){
            adiciona(elemento);
        }
        else{
            Celula posicaoCelula = this.pegaCelula(posicao);
            Celula anterior = posicaoCelula.getAnterior();
            Celula nova = new Celula(elemento,anterior.getProxima());

            anterior.setProxima(nova);
            nova.setAnterior(anterior);
            posicaoCelula.setAnterior(nova);
            this.totalDeElementos++;
        }
    }
    public Object pega(int posicao){

        return this.pegaCelula(posicao).getElemento();

    }

    public void remove(int posicao){

        if(posicao==0){
            removerDoComeco();
        }
        else if(posicao == this.totalDeElementos-1){
            removeDoFim();
        }
        else{

        Celula anterior = pegaCelula(posicao-1);
        Celula atual = pegaCelula(posicao);
        Celula proxima = atual.getProxima();
        anterior.setProxima(atual.getProxima());
        proxima.setAnterior(anterior);
        atual.setProxima(null);
        atual.setAnterior(null);
        this.totalDeElementos--;
        if(this.totalDeElementos==0) {
            this.ultima = null;
        }
        }
    }

    public void  removerDoComeco(){
        if(this.totalDeElementos==0){
            throw new IllegalArgumentException("lista vazia");
        }
        this.primeira = primeira.getProxima();
        this.totalDeElementos--;

        if(this.totalDeElementos==0){
            this.ultima=null;
        }
    }

    public void removeDoFim(){
        if(this.totalDeElementos==1){
            this.removerDoComeco();
        }else{
            Celula penultima = this.ultima.getAnterior();
            penultima.setProxima(null);
            this.ultima= penultima;
            this.totalDeElementos--;

        }

    }

    public int tamanho(){
    return this.totalDeElementos;
    }

    public boolean contem(Object o){
        Celula atual = this.primeira;
        for(int i = 0; i<this.totalDeElementos;i++){
            if(atual.getElemento() == o){
                return true;
            }
            atual = atual.getProxima();
        }
        return false;
    }

    @Override
    public String toString() {
        if(this.totalDeElementos==0){
            return "{}";
        }
        Celula atual = this.primeira;
        StringBuilder builder = new StringBuilder("[");
        for(int i = 0 ; i<this.totalDeElementos-1;i++){
            builder.append(atual.getElemento());
            builder.append(", ");

            atual = atual.getProxima();

        }

        builder.append(atual.getElemento());


        builder.append("]");
        return builder.toString();
    }

}
