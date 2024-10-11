package Ejercicio13;


public class Main {
    public static void main(String[] args) {
        ConjuntoNumeros conjunto = new ConjuntoNumeros();

        conjunto.agregarNumero(10);
        conjunto.agregarNumero(20);
        conjunto.agregarNumero(30);
        conjunto.agregarNumero(40);
        conjunto.agregarNumero(50);


        conjunto.mostrarInferioYSuperior(25);
        conjunto.mostrarInferioYSuperior(40);
        conjunto.mostrarInferioYSuperior(10);
    }
}
