package model;

import java.time.LocalDate;

public class FuncionarioTemporario extends Funcionario {
    private LocalDate dataFimContrato;

    public LocalDate getDataFimContrato() {
        return dataFimContrato;
    }

    public void setDataFimContrato(LocalDate dataFimContrato) {
        this.dataFimContrato = dataFimContrato;
    }

    public FuncionarioTemporario(int id, String nome, double salario, LocalDate dataFimContrato) {
        super(id, nome, salario);
        this.dataFimContrato = dataFimContrato;
    }

}