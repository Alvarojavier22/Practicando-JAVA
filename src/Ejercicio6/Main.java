package Ejercicio6;

public class Main {
    public static void main(String[] args) {
        ColaImpresion colaImpresion = new ColaImpresion();

        colaImpresion.agregarDocumento("Informe Alvaro.pdf");
        colaImpresion.agregarDocumento("informe.txt");
        colaImpresion.agregarDocumento("2024.pdf");

        colaImpresion.proximoDocumento();

        colaImpresion.imprimirDocumento();
        colaImpresion.imprimirDocumento();

        colaImpresion.mostrarDocumentos();

        colaImpresion.imprimirDocumento();

        colaImpresion.imprimirDocumento();
    }
}
