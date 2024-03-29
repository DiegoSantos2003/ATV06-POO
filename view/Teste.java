package view;

import model.Carga;
import model.Motor;
import model.Passeio;


public class Teste {
        public static void main(String[] args) {
   
            Motor motor1 = new Motor(4, 200);
            Motor motor2 = new Motor(6, 300); 

            Passeio passeio1 = new Passeio("ABC1234", "Toyota", "Corolla", "Red", 120, 4, motor1, 5);
            Passeio passeio2 = new Passeio("XYZ5678", "Honda", "Civic", "Blue", 150, 4, motor2, 4);
    
            Carga carga1 = new Carga("DEF4321", "Ford", "F-150", "Black", 100, 4, motor1, 2000, 500);
            Carga carga2 = new Carga("GHI9876", "Chevrolet", "Silverado", "White", 120, 4, motor2, 2500, 600);
    
            System.out.println("Passeio 1 - Velocidade máxima (metros por hora): " + passeio1.resumo());
            System.out.println("Passeio 2 - Velocidade máxima (metros por hora): " + passeio2.resumo());
            System.out.println("Carga 1 - Velocidade máxima (cemtimetros por hora): " + carga1.resumo());
            System.out.println("Carga 2 - Velocidade máxima (centrimentros por hora): " + carga2.resumo());
        }
    }
    