package model;

public class Medico {

    private String nomeMedico;
    private String especialidade;
    private int CRM;

    public Medico(String nomeMedico, String especialidade, int CRM) {
        this.nomeMedico = nomeMedico;
        this.especialidade = especialidade;
        this.CRM = CRM;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public int getCRM() {
        return CRM;
    }

    @Override
    public String toString() {
        return nomeMedico +
                " especialidade: " + especialidade;
    }
}
