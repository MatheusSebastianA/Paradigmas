package Encapsulamento;

public class Principal {
    public static void main(String[] args){
    Aluno alunos[] = new Aluno[3];

    alunos[0] = new Aluno("Pedro", 10, 5);
    alunos[1] = new Aluno("Ana", 12, 7);
    alunos[2] = new Aluno("Carlos", 8, 3);
        
    for(int i = 0; i < 3; i++){
        alunos[i].exibirInformacao();
    }
    }
}
