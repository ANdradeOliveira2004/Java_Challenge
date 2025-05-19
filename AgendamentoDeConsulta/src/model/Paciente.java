package model;

public class Paciente {

    String nome;
    int idade;
    long CPF;


    public Paciente(String nome, int idade, long CPF) {
        this.nome = nome;
        this.idade = idade;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public long getCPF(){
        return CPF;
    }






}