package model;

import java.time.LocalDate;

public class ControleContratacao {
    public static Funcionario contratarFuncionarioTempoIntegral(int id, String nome, double salario, int bancoDeHoras) {
        return new FuncionarioTempoIntegral(id, nome, salario, bancoDeHoras);
    }

    public static Funcionario contratarFuncionarioTempoParcial(int id, String nome, double salario, String horaEntrada, String horaSaida) {
        return new FuncionarioTempoParcial(id, nome, salario, horaEntrada, horaSaida);
    }

    public static Funcionario contratarFuncionarioTemporario(int id, String nome, double salario, LocalDate dataFimContrato) {
        return new FuncionarioTemporario(id, nome, salario, dataFimContrato);
    }
}