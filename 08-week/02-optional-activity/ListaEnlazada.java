

public class ListaEnlazada {

    // Clase interna Estática para que el main pueda usarla directamente
    static class Nodo {
        String nombre;
        Nodo siguiente;

        public Nodo(String nombre) {
            this.nombre = nombre;
            this.siguiente = null;
        }
    }

    public static void main(String[] args) {
        // 1. Crear los nodos individuales
        Nodo n1 = new Nodo("Sofia");
        Nodo n2 = new Nodo("Solano");
        Nodo n3 = new Nodo("Mar");
        Nodo n4 = new Nodo("Milena");

        // 2. Enlazar los nodos (crear la cadena)
        n1.siguiente = n2;
        n2.siguiente = n3;
        n3.siguiente = n4;
        n4.siguiente = null;

        // 3. Definir quién es la cabeza
        Nodo cabeza = n1;

        // 4. Recorrer e imprimir la lista
        System.out.println("Contenido de la lista:");
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println("- " + actual.nombre);
            actual = actual.siguiente;
        }
        // ===============================
        // RESPUESTAS TEÓRICAS
        // ===============================

        // 2. ¿Cuál es el primer nodo (cabeza)?
        // El primer nodo es "Sofia", porque es el inicio de la lista
        // y es al que apunta la variable cabeza.

        // 3. ¿Cuál es el último nodo y a qué apunta?
        // El último nodo es "Milena" y su referencia apunta a NULL,
        // indicando que no hay más elementos en la lista.

        // 4. ¿Por qué es una estructura dinámica?
        // Una lista enlazada es una estructura dinámica porque su tamaño puede cambiar durante la ejecución del
        // programa. No requiere un tamaño fijo como los arreglos. Los nodos se crean y eliminan según se necesiten,
        // usando memoria dinámica. Cada elemento está conectado mediante referencias, no por posiciones
        // contiguas en memoria. Esto permite insertar o eliminar elementos fácilmente sin reorganizar 
        // toda la estructura.
    }
}