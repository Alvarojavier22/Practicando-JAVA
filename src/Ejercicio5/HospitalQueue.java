package Ejercicio5;

import java.util.LinkedList;
import java.util.Queue;

public class HospitalQueue {
    private Queue<String> pacientes;

    public HospitalQueue(){
        pacientes = new LinkedList<>();
    }
    public void agregarPaciente(String nombrePaciente){
        pacientes.add(nombrePaciente);
        System.out.println("Paciente agregado: " + nombrePaciente);
    }
    public String atenderPaciente(){
        if(pacientes.isEmpty()){
            System.out.println("No hay pacientes en la cola.");
            return null;
        }else{
            String pacienteAtendido = pacientes.poll();
            System.out.println("Atendiendo a: " + pacienteAtendido);
            return pacienteAtendido;
        }
    }
    public String proximoPaciente() {
        if(pacientes.isEmpty()){
            System.out.println("No hay pacientes en la cola.");
            return null;
        }else{
            String proximo = pacientes.peek();
            System.out.println("Próximo paciente: " + proximo);
            return proximo;
        }
    }
    public int contarPacientes(){
        int count = pacientes.size();
        System.out.println("Número de pacientes: " + count);
        return count;
    }
}
