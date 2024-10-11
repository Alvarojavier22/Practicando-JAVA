package Ejercicio12;

import java.util.TreeMap;

public class GestionContactos {
    private TreeMap<String, String> contactos;

    public GestionContactos(){
        contactos = new TreeMap<>();
    }
    public void agregarContacto(String nombre, String telefono){
        if(contactos.containsKey(nombre)){
            System.out.println("El contacto ya existe. No se puede agregar.");
        }else {
            contactos.put(nombre, telefono);
            System.out.println("Contacto agregado correctamente.");
        }
    }
    public void eliminarContacto(String nombre){
        if(contactos.containsKey(nombre)){
            contactos.remove(nombre);
            System.out.println("Contacto "+ nombre +" eliminado correctamente.");
        }else {
            System.out.println("No se puede eliminar el contacto con el nombre: " + contactos.get(nombre) + ".");
        }
    }
    public void buscarContacto(String nombre){
        if(contactos.containsKey(nombre)){
            System.out.println("Contacto encontrado: " + nombre + "- Teléfono: " + contactos.get(nombre));
        }else {
            System.out.println("No se encontró el contacto con el nombre: " + nombre + ".");
        }
    }
    public void mostrarContactos(){
        if(contactos.isEmpty()){
            System.out.println("No hay contactos en la lista.");
        }else {
            System.out.println("Lista de contactos: ");
            for(String nombre : contactos.keySet()){
                System.out.println("Nombre: " + nombre + ", Telefono: " + contactos.get(nombre));
            }
        }
    }
}
