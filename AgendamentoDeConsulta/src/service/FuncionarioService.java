package service;

import model.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioService {

    private static List<Funcionario> funcionarios = new ArrayList<>();

    static {
        funcionarios.add(new Funcionario("Paulo", "040704"));
    }

    public static boolean autenticar(String codigo, String senha) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.autenticar(codigo, senha)) {
                return true;
            }
        }
        return false;
    }

    public static void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

}
