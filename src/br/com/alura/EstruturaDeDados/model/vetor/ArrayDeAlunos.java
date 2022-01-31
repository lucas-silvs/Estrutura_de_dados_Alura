package br.com.alura.EstruturaDeDados.model.vetor;

import java.util.Arrays;

public class ArrayDeAlunos {

    private Aluno[] alunos = new Aluno[10];
    private int total = 0;



    private void garanteEspaco(){
        if(total==alunos.length){
            Aluno[] novaArray = new Aluno[total * 2];
            for(int i = 0; i< total; i++){
                novaArray[i] = alunos[i];
            }
            this.alunos = novaArray;
        }
    }

    public void adiciona(Aluno aluno) {
        garanteEspaco();
        this.alunos[total] = aluno;
        total++;
    }

    private boolean posicaoValidaParaAdicionarAluno(int posicao) {
        return posicao >= 0 && posicao <= total;
    }

    public void adiciona(Aluno aluno, int posicao) {

        garanteEspaco();
        if (!posicaoValidaParaAdicionarAluno(posicao)) {
            throw new IllegalArgumentException("posição para inserção invalida");
        }
        for (int i = this.total - 1; i >= posicao; i--) {
            alunos[i + 1] = alunos[i];
        }

        alunos[posicao] = aluno;
        total++;
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.total;
    }

    public Aluno pegarAluno(int posicao) {

        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição não ocupada ou invalida");
        }
        return alunos[posicao];

    }

    public int posicaoParaRemocao(Aluno aluno) {
        for (int i = 0; i < total; i++) {
            if (aluno.equals(alunos[i])) {
                return i;
            }
        }
        throw new IllegalArgumentException("aluno não encontrado");
    }


    public void remove(Aluno aluno) {

        int posicao = posicaoParaRemocao(aluno);
        for (int i = posicao; i < total; i++) {
            alunos[i] = alunos[i+1];
        }
        total--;
        System.out.println("aluno removido com sucesso");
    }


    public boolean contem(Aluno aluno) {
        for (int i = 0; i < alunos.length; i++) {
            if (aluno.equals(alunos[i])) {
                System.out.println("aluno removido com sucesso");
                return true;
            }
        }
        System.out.println("aluno não encontrado na array");
        return false;


    }

    public int tamanho() {
        return total;
    }

    @Override
    public String toString() {
        return "Array{" +
                "alunos=" + Arrays.toString(alunos) +
                '}';
    }
}
