package model;

public class FuncionarioTempoIntegral extends Funcionario {

    public int getBancoDeHoras() {
        return bancoDeHoras;
    }

    public void setBancoDeHoras(int bancoDeHoras) {
        this.bancoDeHoras = bancoDeHoras;
    }

    private int bancoDeHoras;

    public FuncionarioTempoIntegral(int id, String nome, double salario, int bancoDeHoras) {
        super(id, nome, salario);
        this.bancoDeHoras = bancoDeHoras;
    }

}
