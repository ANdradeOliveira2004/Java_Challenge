package model;

public class Funcionario {
    private String codigo;
    private String senha;

    public Funcionario(String codigo, String senha) {
        this.codigo = codigo;
        this.senha = senha;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getSenha() {
        return senha;
    }
    public boolean autenticar(String codigo, String senha) {
        return this.codigo.equals(codigo) && this.senha.equals(senha);
    }



}
