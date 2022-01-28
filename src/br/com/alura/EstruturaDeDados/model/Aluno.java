package br.com.alura.EstruturaDeDados.model;

public class Aluno {

    private String nome;

    public String getNome() {
        return nome;
    }

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object obj){
        Aluno outroAluno = (Aluno) obj;

        return this.nome.equals(outroAluno.getNome());
    }

    @Override
    public String toString() {
        return this.getNome();
    }
}
