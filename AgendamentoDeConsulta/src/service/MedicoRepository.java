package service;

import model.Medico;

import java.util.ArrayList;
import java.util.List;

public class MedicoRepository {

    public static List<Medico> getMedicosDisponiveis() {
        List<Medico> medicos = new ArrayList<>();
        medicos.add(new Medico("Dr. Osvaldo", "Clinico geral", 563299));
        medicos.add(new Medico("Dr. Moises", "Otopedista", 637646));
        medicos.add(new Medico("Dr. Fernando", "Cirurgião Plastico", 434322));
        return medicos;
    }

}
