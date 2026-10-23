
package proyectos;

import java.util.Scanner;

public class AdivinaElNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numeroSecreto = 7; // Puedes cambiarlo por el número que quieras
        int intento = 0;       // Variable para guardar lo que escribes
        
        System.out.println("=== ADIVINA EL CÓDIGO SECRETO ===");
        System.out.println("Adivina el número del 1 al 10.");
        
        // El bucle se repite MIENTRAS (while) tu intento sea DIFERENTE (!=) al secreto
        while (intento != numeroSecreto) {
            System.out.print("Escribe un número: ");
            intento = scanner.nextInt();
            
            if (intento < numeroSecreto) {
                System.out.println("¡Muy bajo! Prueba con uno más alto.");
            } else if (intento > numeroSecreto) {
                System.out.println("¡Muy alto! Prueba con uno más bajo.");
            } else {
                System.out.println("¡Felicidades! ¡Adivinaste el código secreto!");
            }
        }
        
        scanner.close();
    }
}