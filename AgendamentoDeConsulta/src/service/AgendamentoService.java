package service;

import model.Consulta;
import model.Paciente;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AgendamentoService {

    private List<Consulta> consultas = new ArrayList<>();

    public boolean agendarConsulta(Paciente paciente, Consulta consulta) {

        for (Consulta teste : consultas) {
            boolean comparaHorario = teste.getHorario().equals(consulta.getHorario()) &&
                    teste.getData().equals(consulta.getData()) &&
                    teste.getMedico().equals(consulta.getMedico());

            if (comparaHorario) {
                System.out.println("Consulta já marcada no dia: " + consulta.getData() + " Horario: " + consulta.getHorario() + " Com o médico: " + consulta.getMedico());
                return false;
            }
        }

        consultas.add(consulta);
        System.out.println("Consulta agendada com sucesso!");
        System.out.println("Paciente: " + paciente.getNome());
        System.out.println("Idade: " + paciente.getIdade());
        System.out.println("CPF: " + paciente.getCPF());
        System.out.println("Data: " + consulta.getData());
        System.out.println("Horario Consulta: " + consulta.getHorario());
        System.out.println("Medico: " + consulta.getMedico());
        return true;

    }

    public void listarConsultaPorPaciente(String nomePaciente) {
        boolean encontrada = false;

        for (Consulta c : consultas) {
            if (c.getPaciente().getNome().equalsIgnoreCase(nomePaciente)) {
                System.out.println("\nConsulta encontrada!");
                System.out.println(c);
                encontrada = true;
            }
        }

        if (!encontrada) {
            System.out.println("Nenhuma consulta foi encontrada para o paciente: " + nomePaciente);
        }
    }



}
