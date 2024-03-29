package model;

import Controller.ImpostoStrategy;

public class CuritibaStrategy implements ImpostoStrategy {
    @Override
    public double calcularImposto(double areaTotal, int numeroComodos, int idadeImovel, double areaGaragem) {
        double imposto = areaTotal * 5;
        if (idadeImovel > 50) {
            imposto += idadeImovel * 3;
        } else if (idadeImovel < 20) {
            imposto += idadeImovel * 2;
        } else {
            imposto += idadeImovel * 2.5;
        }
        return imposto;
    }
}