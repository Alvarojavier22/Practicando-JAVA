package Ejercicio12;

public class Main {
    public static void main(String[] args) {
        GestionContactos agenda = new GestionContactos();

        agenda.agregarContacto("Alvaro", "091445363");
        agenda.agregarContacto("Pedro", "091234567");
        agenda.agregarContacto("Carlos", "555566778");

        agenda.mostrarContactos();
        agenda.buscarContacto("Alvaro");
        agenda.eliminarContacto("Carlos");

        System.out.println("---Agenda después de actualizar---");
        agenda.mostrarContactos();
    }
}
