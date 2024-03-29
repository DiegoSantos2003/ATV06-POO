package model;

import Controller.ImpostoStrategy;


public class BeloHorizonteStrategy implements ImpostoStrategy {
    @Override
    public double calcularImposto(double areaTotal, int numeroQuartos, int idadeImovel, double areaGaragem) {
        return areaTotal * 7 + numeroQuartos * 4;
    }
}
