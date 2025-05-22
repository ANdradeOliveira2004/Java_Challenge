package view;

import model.Consulta;
import model.Medico;
import model.Paciente;
import service.AgendamentoService;
import service.FuncionarioService;
import service.MedicoRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        AgendamentoService consultasAgendadas = new AgendamentoService();

        System.out.println("==== Agendamento de Consulta ====");

        while (true) {

            System.out.println("1 - Agendar consulta");
            int opcoes = entrada.nextInt();

            switch (opcoes) {
                case 1:
                    entrada.nextLine();
                    System.out.println("Digite o seu nome: ");
                    String nome = entrada.nextLine();

                    System.out.println("Digite sua Idade: ");
                    int idade = entrada.nextInt();

                    System.out.println("Digite seu CPF: ");
                    long CPF = entrada.nextLong();
                    entrada.nextLine();

                    System.out.println("Data (dd/mm/aaaa)");
                    String data = entrada.nextLine();

                    System.out.println("Horário (hh:mm): ");
                    String horario = entrada.nextLine();

                    List<Medico> medicosDisponiveis = MedicoRepository.getMedicosDisponiveis();
                    System.out.println("Escolha o medico que você deseja passar: ");
                    for (int i = 0; i < medicosDisponiveis.size(); i++) {
                        Medico m = medicosDisponiveis.get(i);
                        System.out.println((i + 1) + m.getNomeMedico() + " - " + m.getEspecialidade() + " - " + m.getCRM());
                    }

                    System.out.println("Escolha um através do número qual médico você deseja: ");
                    int escolha = entrada.nextInt();
                    entrada.nextLine();

                    Medico medicoEscolhido = medicosDisponiveis.get(escolha - 1);

                    Paciente paciente = new Paciente(nome, idade, CPF);
                    Consulta consulta = new Consulta(data, horario, medicoEscolhido.getNomeMedico(), paciente);

                    //Fazendo o agendamento da consulta
                    consultasAgendadas.agendarConsulta(paciente, consulta);
                    break;

                case 2:
                    if (fazerLogin()) {
                        menuFuncionario(consultasAgendadas);
                    }else {
                        System.out.println("Lógin invalido!");
                    }
                    break;

            }
        }
    }

    private static boolean fazerLogin() {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite seu senha: ");
        String senha = sc.nextLine();

        return FuncionarioService.autenticar(nome, senha);

    }

    private static void menuFuncionario(AgendamentoService consultasAgendadas) {
        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.println("==== Menu Funcionário ====");
            System.out.println("1 - Listar Consultas por Paciente");
            System.out.println("2 - Sair");
            int opcao = entrada.nextInt();
            entrada.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do paciente:");
                    String nomePaciente = entrada.nextLine();
                    consultasAgendadas.listarConsultaPorPaciente(nomePaciente);
                    break;
                case 2:
                    System.out.println("Saindo do menu do funcionário.");
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

}





