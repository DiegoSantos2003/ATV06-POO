package view;

import java.util.Scanner;
import model.CalculadoraImposto;
import model.CuritibaStrategy;
import model.SaoPauloStrategy;
import model.BeloHorizonteStrategy;
import model.PortoAlegreStrategy;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione a cidade para calcular o imposto:");
        System.out.println("1. São Paulo");
        System.out.println("2. Belo Horizonte");
        System.out.println("3. Porto Alegre");
        System.out.println("4. Curitiba");

        int opcao = scanner.nextInt();

        CalculadoraImposto calculadora = null;
        switch (opcao) {
            case 1:
                calculadora = new CalculadoraImposto(new SaoPauloStrategy());
                break;
            case 2:
                calculadora = new CalculadoraImposto(new BeloHorizonteStrategy());
                break;
            case 3:
                calculadora = new CalculadoraImposto(new PortoAlegreStrategy());
                break;
            case 4:
                calculadora = new CalculadoraImposto(new CuritibaStrategy());
                break;
            default:
                System.out.println("Opção inválida");
                System.exit(1);
        }

        System.out.println("Informe a área total do imóvel:");
        double areaTotal = scanner.nextDouble();
        System.out.println("Informe o número de cômodos/quartos do imóvel:");
        int numeroComodos = scanner.nextInt();
        System.out.println("Informe a área da garagem (ou 0 caso não tenha):");
        double areaGaragem = scanner.nextDouble();
        System.out.println("Informe a idade do imóvel:");
        int idadeImovel = scanner.nextInt();

        double imposto = calculadora.calcularImposto(areaTotal, numeroComodos, idadeImovel, areaGaragem);
        System.out.println("O valor do imposto é: R$ " + imposto);

        scanner.close();
    }
}