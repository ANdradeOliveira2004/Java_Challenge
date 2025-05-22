package model;

public class Consulta {
    private final String data;
    private final String horario;
    private final String medico;
    Paciente paciente;

    public Consulta(String data, String horario, String medico,Paciente paciente) {
        this.data = data;
        this.horario = horario;
        this.medico = medico;
        this.paciente = paciente;

    }

    public Paciente getPaciente() {
        return paciente;
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

    @Override
    public String toString() {
        return "Consulta " +
                "data= " + data +
                ", horario= " + horario +
                ", medico= " + medico +
                ", paciente= " + paciente.getNome();
    }
}

