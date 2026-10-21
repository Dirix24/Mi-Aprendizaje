package proyectos;
import java.util.Scanner; // Importamos la herramienta para leer lo que escribes

public class ControlDeAcceso {
    public static void main(String[] args) {
        // Creamos el lector (en Python harías un input directo, aquí usamos Scanner)
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== SISTEMA DE ACCESO AL JUEGO ===");
        System.out.print("Por favor, ingresa tu edad: ");
        
        // Leemos el número entero que escribe el usuario
        int edad = scanner.nextInt();
        
        // Evaluamos la edad con un if/else (igual que en Python, pero con llaves {})
        if (edad >= 18) {
            System.out.println("¡Acceso concedido! Bienvenido al juego.");
        } else {
            System.out.println("Acceso denegado. Necesitas ser mayor de 18 años.");
        }
        
        // Cerramos el scanner (buena práctica en Java)
        scanner.close();
    }
}