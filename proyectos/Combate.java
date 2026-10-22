package proyectos;

import java.util.Scanner;

public class Combate{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int vidaEnemigo = 100;
        int turno = 1;
        
        System.out.println("=== ¡COMIENZA LA BATALLA! ===");
        System.out.println("Vida inicial del enemigo: " + vidaEnemigo);
        System.out.println("--------------------------------");
        
        // Bucle while: se ejecuta mientras el enemigo siga con vida
        while (vidaEnemigo > 0) {
            System.out.println("\n--- Turno " + turno + " ---");
            System.out.print("¿Cuánto daño quieres hacer? (Escribe un número): ");
            
            int dano = scanner.nextInt();
            
            // Restamos el daño a la vida actual
            vidaEnemigo = vidaEnemigo - dano;
            
            if (vidaEnemigo > 0) {
                System.out.println("¡Le pegaste! Vida restante del enemigo: " + vidaEnemigo);
            } else {
                System.out.println("¡Ataque crítico de " + dano + "! El enemigo ha sido derrotado.");
            }
            
            turno++; // Equivale a turno += 1 o turno = turno + 1
        }
        
        System.out.println("\n¡Felicidades, ganaste la batalla en " + (turno - 1) + " turnos!");
        scanner.close();
    }
}