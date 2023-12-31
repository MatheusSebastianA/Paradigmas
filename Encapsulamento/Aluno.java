package Encapsulamento;
import java.util.Scanner;

public class Aluno{
    private String nome;
    private int idade, serie;

    //Construtor 
    public Aluno(String nome, int idade, int serie){
        this.nome = nome;
        this.idade = idade;
        this.serie = serie;
    }

    public Aluno(){
        
    }

    //Get e Set
    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public int getSerie() {
        return serie;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public void exibirInformacao(){
        System.out.println("Idade é: " + this.idade);
        System.out.println("Serie é: " + this.serie);
        System.out.println("Nome é: " + this.nome);
    }
}