package Ejercicio11;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        inventario.agregarArticulo(101, "Laptop");
        inventario.agregarArticulo(102, "Mouse");
        inventario.agregarArticulo(103, "Teclado");

        inventario.mostrarInventario();
        inventario.buscarArticulo(102);
        inventario.eliminarArticulo(103);

        inventario.mostrarInventario();
    }
}
