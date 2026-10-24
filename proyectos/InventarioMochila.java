package proyectos;

public class InventarioMochila {
    public static void main(String[] args) {
        // En Java, los arreglos tienen un tamaño fijo y un tipo de dato estricto.
        // Aquí creamos una lista de objetos para la mochila:
        String[] mochila = {"Espada de madera", "Poción de vida", "Escudo básico", "Antídoto"};

        System.out.println("=== INVENTARIO DE TU MOCHILA ===");
        System.out.println("Capacidad total de objetos: " + mochila.length);
        System.out.println("----------------------------------------");

        // Bucle for clásico para recorrer la mochila (similar al for de Python)
        for (int i = 0; i < mochila.length; i++) {
            // Mostramos la posición (i + 1 para que empiece en 1) y el objeto
            System.out.println("Espacio [" + (i + 1) + "] -> " + mochila[i]);
        }
    }
}