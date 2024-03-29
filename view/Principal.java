package view;

import java.time.LocalDate;
import model.ControleContratacao;
import model.FuncionarioTempoIntegral;
import model.FuncionarioTempoParcial;
import model.FuncionarioTemporario;
import model.Funcionario;



public class Principal {
    public static void main(String[] args) {
        Funcionario funcionario1 = ControleContratacao.contratarFuncionarioTempoIntegral(1, "João", 3000.0, 40);
        Funcionario funcionario2 = ControleContratacao.contratarFuncionarioTempoParcial(2, "Maria", 2000.0, "08:00", "17:00");
        Funcionario funcionario3 = ControleContratacao.contratarFuncionarioTemporario(3, "Pedro", 2500.0, LocalDate.of(2024, 12, 31));

        System.out.println("Funcionário Tempo Integral:");
        System.out.println("ID: " + funcionario1.getId());
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Salário: " + funcionario1.getSalario());
        System.out.println("Banco de Horas: " + ((FuncionarioTempoIntegral) funcionario1).getBancoDeHoras());

        System.out.println("\nFuncionário Tempo Parcial:");
        System.out.println("ID: " + funcionario2.getId());
        System.out.println("Nome: " + funcionario2.getNome());
        System.out.println("Salário: " + funcionario2.getSalario());
        System.out.println("Hora de Entrada: " + ((FuncionarioTempoParcial) funcionario2).getHoraEntrada());
        System.out.println("Hora de Saída: " + ((FuncionarioTempoParcial) funcionario2).getHoraSaida());

        System.out.println("\nFuncionário Temporário:");
        System.out.println("ID: " + funcionario3.getId());
        System.out.println("Nome: " + funcionario3.getNome());
        System.out.println("Salário: " + funcionario3.getSalario());
        System.out.println("Data Fim Contrato: " + ((FuncionarioTemporario) funcionario3).getDataFimContrato());
    }
}