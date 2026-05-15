package Clinica;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Consulta {
    private int ValorConsulta;
    private LocalDateTime data;
    private Paciente paciente;
    private Medico medico;


    public Consulta() {
    }

    public Consulta(LocalDateTime data, int valorConsulta, Paciente paciente, Medico medico) {
        this.data = data;
        this.ValorConsulta = valorConsulta;
        this.paciente = paciente;
        this.medico = medico;
    }

    public LocalDateTime getData() {
        return this.data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public int getValorConsulta() {
        return this.ValorConsulta;
    }

    public void setValorConsulta(int valorConsulta) {
        this.ValorConsulta = valorConsulta;
    }

    public Paciente getPaciente() {
        return this.paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return this.medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy 'ás' HH:mm");
        return "Consulta{" +
                "ValorConsulta=" + this.ValorConsulta +
                ", data=" + this.data.format(formatoBR) +
                ", paciente=" + this.paciente +
                ", medico=" + this.medico +
                '}';
    }
}
