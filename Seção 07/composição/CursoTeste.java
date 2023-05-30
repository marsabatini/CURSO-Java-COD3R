package Modulo_07.oo.composicao;

public class CursoTeste {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Pedro");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("Web Completo");
        Curso curso3 = new Curso("React Native");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);
        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        aluno1.adicionarCurso(curso1);
        aluno3.adicionarCurso(curso2);

        for(Aluno aluno: curso1.alunos){
            System.out.println("Estou matriculado no curso 1..." + curso3.nome);
            System.out.println("Meu nome é " + aluno.nome);
            System.out.println();
        }

        System.out.println(aluno1.cursos.get(0).alunos + "\n");

        Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo");
        if(cursoEncontrado != null){
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        }
    }
}
