package model;


public class Passeio extends Veiculo {
    private int qtdPassageiros;

 
    public Passeio(String placa, String marca, String modelo, String cor, float velocMax, int qtdRodas, Motor motor, int qtdPassageiros) {
        super(placa, marca, modelo, cor, velocMax, qtdRodas, motor);
        this.qtdPassageiros = qtdPassageiros;
    }

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    public float resumo() {
        float velocMaxMetrosPorHora = getVelocMax() * 1000;
        return velocMaxMetrosPorHora;
    }

}
