package model;

public class Consulta {
    private final String data;
    private final String horario;
    private final String medico;

    public Consulta(String data, String horario, String medico) {
        this.data = data;
        this.horario = horario;
        this.medico = medico;
    }

    public String getData() {
        return data;
    }

    public String getHorario() {
        return horario;
    }

    public String getMedico() {
        return medico;
    }
}

