package model;

import Controller.ImpostoStrategy;

public class CalculadoraImposto {
    private ImpostoStrategy strategy;

    public ImpostoStrategy getStrategy() {
        return strategy;
    }

    public CalculadoraImposto(ImpostoStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(ImpostoStrategy strategy) {
        this.strategy = strategy;
    }

    public double calcularImposto(double areaTotal, int numeroComodos, int idadeImovel, double areaGaragem) {
        return strategy.calcularImposto(areaTotal, numeroComodos, idadeImovel, areaGaragem);
    }
}