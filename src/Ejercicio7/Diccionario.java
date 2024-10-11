package Ejercicio7;

import java.util.HashMap;

public class Diccionario {
    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("java", "Es un muy buen lenguaje de programación para aplicar el paradigma de POO.");
        diccionario.put("python", "Lenguaje de programación de alto nivel, ideal para niños.");
        diccionario.put("c++", "Lenguaje de programación con soporte POO y desarrollo de sistemas.");
        diccionario.put("javascript", "Lenguaje de programación ideal para el desarrollo web.");

        System.out.println("---Palabras en el Diccionario---");
        for(String key : diccionario.keySet()){
            System.out.println(key + ": " + diccionario.get(key));
        }
        String palabraBuscar = "java";
        if(diccionario.containsKey(palabraBuscar)){
            System.out.println("\nEl significado de '" + palabraBuscar + "' es: " + diccionario.get(palabraBuscar));

        }else {
            System.out.println("\nLa palabra '" + palabraBuscar + "' no se encuentra en el diccionario");
        }
        String palabraEliminar = "c++";
        if(diccionario.containsKey(palabraEliminar)){
            diccionario.remove(palabraEliminar);
            System.out.println("\n Palabra: '" + palabraEliminar + "' eliminada correctamente.");
        }else {
            System.out.println("\n La palabra: '" + palabraEliminar+ "' no se encuentra en el diccionario.");
        }

        System.out.println("\n---Diccionario actualizado---");
        for(String key : diccionario.keySet()){
            System.out.println(key + ": " + diccionario.get(key));
        }
    }
}
