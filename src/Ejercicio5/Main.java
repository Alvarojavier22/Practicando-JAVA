package Ejercicio5;

public class Main {
    public static void main(String[] args) {
        HospitalQueue colaHospital = new HospitalQueue();

        colaHospital.agregarPaciente("Alvaro Chagas");
        colaHospital.agregarPaciente("Javier Capurro");
        colaHospital.agregarPaciente("Juan Perez");

        colaHospital.proximoPaciente();

        colaHospital.atenderPaciente();
        colaHospital.atenderPaciente();

        colaHospital.contarPacientes();

        colaHospital.proximoPaciente();

        colaHospital.atenderPaciente();

        colaHospital.contarPacientes();
    }
}
