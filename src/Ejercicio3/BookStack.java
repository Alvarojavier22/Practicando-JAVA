package Ejercicio3;

import java.util.Stack;

public class BookStack {
    private Stack<String> libros;

    public BookStack(){
        libros = new Stack<>();
    }
    public void pushBook(String libro){
        libros.push(libro);
        System.out.println("Libro agregado: " + libro);
    }
    public void popBook(){
        if(libros.isEmpty()){
            System.out.println("La pila está vacía. no se puede quitar ningún libro.");
        }else{
            String libroEliminado = libros.pop();
            System.out.println("Libro eliminado: " + libroEliminado);
        }
    }
    public void peekBook(){
        if(libros.isEmpty()){
            System.out.println("La pila está vacía.");
        }else {
            System.out.println("Libro en la cima: " + libros.peek());
        }
    }
}
