package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        BookStack bookStack = new BookStack();

        bookStack.pushBook("Libro 1");
        bookStack.pushBook("Libro 2");
        bookStack.pushBook("Libro 3");

        bookStack.peekBook();

        bookStack.popBook();
        bookStack.popBook();

        bookStack.peekBook();
    }
}
