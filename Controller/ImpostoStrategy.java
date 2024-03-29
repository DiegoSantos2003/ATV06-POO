package Controller;

public interface ImpostoStrategy {
    double calcularImposto(double areaTotal, int numeroComodos, int idadeImovel, double areaGaragem);
}