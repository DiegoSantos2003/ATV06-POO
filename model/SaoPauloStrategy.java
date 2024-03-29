package model;

import Controller.ImpostoStrategy;


public class SaoPauloStrategy implements ImpostoStrategy {

    public double calcularImposto(double areaTotal, int numeroComodos, int idadeImovel, double areaGaragem) {
        return areaTotal * 10 + numeroComodos * 2;
    }
}
