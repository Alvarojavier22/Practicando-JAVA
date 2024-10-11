package Ejercicio11;

import java.util.TreeMap;

public class Inventario {
    private TreeMap<Integer, String> inventario;

    public Inventario(){
        inventario = new TreeMap<>();
    }
    public void agregarArticulo(int codigo, String nombre){
        if(inventario.containsKey(codigo)){
            System.out.println("El código ya existe. No se puede agregar el artículo.");
        }else {
            inventario.put(codigo, nombre);
            System.out.println("Artículo agregado correctamente.");
        }
    }
    public void eliminarArticulo(int codigo){
        if(inventario.containsKey(codigo)){
            inventario.remove(codigo);
            System.out.println("Artículo eliminado correctamente.");
        }else {
            System.out.println("No se encontró el artículo con el código " + codigo + ".");
        }
    }
    public void buscarArticulo(int codigo){
        if(inventario.containsKey(codigo)){
            System.out.println("Artículo encontrado: " + inventario.get(codigo));
        }else {
            System.out.println("No se encontró el artículo con el códidigo " + codigo + ".");
        }
    }
    public void mostrarInventario(){
        if(inventario.isEmpty()){
            System.out.println("El inventario está vacío.");
        }else {
            System.out.println("Inventario: ");
            for(Integer codigo : inventario.keySet()){
                System.out.println("Artículo: " + codigo + " " + inventario.get(codigo));
            }
        }
    }
}
