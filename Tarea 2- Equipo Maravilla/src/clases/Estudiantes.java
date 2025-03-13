package clases;

public class Estudiantes {
    public String nombre;
    public int edad;
    public String matricula;
    public String carrera;

    public Estudiantes() {
        nombre = "";
        edad = 0;
        matricula = "";
        carrera = "";
    }
    
    public Estudiantes(String nombre, int edad, String matricula, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.matricula = matricula;
        this.carrera = carrera;
    }
}
