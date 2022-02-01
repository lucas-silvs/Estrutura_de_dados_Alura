package br.com.alura.EstruturaDeDados.model.teste;

import br.com.alura.EstruturaDeDados.model.vetor.Aluno;
import br.com.alura.EstruturaDeDados.model.vetor.ArrayDeAlunos;

public class VetorTeste {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("joão");
        Aluno aluno2 = new Aluno("Pedro");
        Aluno aluno3 = new Aluno("Roberto");

        ArrayDeAlunos alunos = new ArrayDeAlunos();
        alunos.adiciona(aluno1);
        alunos.adiciona(aluno2);
        System.out.println(alunos.toString());
        System.out.println(alunos.tamanho());
        System.out.println(alunos.contem(aluno1));

        alunos.adiciona(aluno3,0);
        System.out.println(alunos);

        alunos.remove(aluno3);
        System.out.println(alunos);
        for(int i = 0; i<20;i++){
            alunos.adiciona(aluno1);
        }

        System.out.println(alunos);
    }
}
