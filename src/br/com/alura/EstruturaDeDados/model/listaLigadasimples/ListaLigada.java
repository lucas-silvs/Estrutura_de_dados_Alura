package br.com.alura.EstruturaDeDados.model.listaLigadasimples;

public class ListaLigada {
    
    private Celula primeira = null;
    private int totalDeElementos = 0;
    private Celula ultima = null;
    public void adicionaNoComeço(Object elemento){
        Celula nova = new Celula(elemento,primeira);
        this.primeira = nova;

        if(totalDeElementos == 0 ){
            this.ultima = this.primeira;
        }
        
        this.totalDeElementos++;

    }
    public void adiciona(Object elemento){
        if(this.totalDeElementos==0){
            adicionaNoComeço(elemento);
        }
        else {
            Celula nova = new Celula(elemento, null);
            this.ultima.setProxima(nova);
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
            Celula anterior = this.pegaCelula(posicao -1);
            Celula nova = new Celula(elemento,anterior.getProxima());
            anterior.setProxima(nova);
            this.totalDeElementos++;
        }
    }
    public Object pega(int posicao){

        return this.pegaCelula(posicao).getElemento();

    }

    public void remove(int posicao){
        Celula anterior = pegaCelula(posicao-1);
        Celula atual = pegaCelula(posicao);
        anterior.setProxima(atual.getProxima());
        atual.setProxima(null);
        this.totalDeElementos--;
        if(this.totalDeElementos==0){
            this.ultima=null;
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
