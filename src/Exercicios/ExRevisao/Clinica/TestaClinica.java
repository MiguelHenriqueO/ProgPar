package Clinica;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestaClinica {
    public static void main(String[] args){

        Medico me1 = new Medico(265, "Paulo", "ESteticista");
        Paciente pa1 = new Paciente(12, 1002, "maria");

        LocalDateTime data = LocalDateTime.of(2026,5,20,12,55);
        Consulta c1 = new Consulta(data,200,pa1,me1);
        System.out.println(c1.toString());
    }
}
