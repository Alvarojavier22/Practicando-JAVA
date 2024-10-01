package Ejercicio6;

import java.util.LinkedList;
import java.util.Queue;

public class ColaImpresion {
    private Queue<String> documentos;

    public ColaImpresion(){
        documentos = new LinkedList<>();
    }
    public void agregarDocumento(String documento){
        documentos.add(documento);
        System.out.println("Documento agregado a la cola: " + documento);
    }
    public String imprimirDocumento(){
        if(documentos.isEmpty()){
            System.out.println("No hay documentos en la cola de impresión.");
            return null;
        }else{
            String documentoImpreso = documentos.poll();
            System.out.println("Imprimiendo documento: " + documentoImpreso);
            return documentoImpreso;
        }
    }
    public String proximoDocumento(){
        if(documentos.isEmpty()){
            System.out.println("No hay documentos en la cola de impresión");
            return null;
        }else{
            String proximo = documentos.peek();
            System.out.println("Próximo documento a imprimir: " + proximo);
            return proximo;
        }
    }
    public void mostrarDocumentos(){
        if(documentos.isEmpty()){
            System.out.println("No hay documentos en la cola de impresión.");
        }else {
            System.out.println("Documentos en la cola de impresión: " + documentos);
        }
    }
}
