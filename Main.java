
class Estudiante {
    // Atributos de la clase
    String nombre;
    int edad;
    double calificacion;

    // Constructor
    public Estudiante(String nombre, int edad, double calificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = calificacion;
    }

    // Método para mostrar los datos
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Calificacion: " + calificacion);
    }

    // Método para verificar si aprobó
    public void verificarAprobacion() {
        if (calificacion >= 70) {
            System.out.println("Estado: Aprobado");
        } else {
            System.out.println("Estado: Reprobado");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        // Instanciación de objetos
        Estudiante estudiante1 =
            new Estudiante("Carlos", 20, 85.5);

        Estudiante estudiante2 =
            new Estudiante("Ana", 19, 65.0);

        // Uso de métodos
        System.out.println("--- Estudiante 1 ---");
        estudiante1.mostrarInformacion();
        estudiante1.verificarAprobacion();

        System.out.println("\n--- Estudiante 2 ---");
        estudiante2.mostrarInformacion();
        estudiante2.verificarAprobacion();
    }
}
