package model;

import Controller.ImpostoStrategy;

public class PortoAlegreStrategy implements ImpostoStrategy {
    @Override
    public double calcularImposto(double areaTotal, int numeroComodos, int idadeImovel, double areaGaragem) {
        if (areaGaragem > 0) {
            return areaTotal * 7.5 + areaGaragem * 2.5;
        } else {
            return areaTotal * 8;
        }
    }
}
