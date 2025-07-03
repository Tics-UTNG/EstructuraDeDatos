package escolar;

public class Estudiante {
	//Definición de atributos
    private String nombre;
    private String matricula;
    private double calificacion;
    
    //Definición de constructorees     
    
    
	public Estudiante(String nombre, String matricula, double calificacion) {
		super();
		this.nombre = nombre;
		this.matricula = matricula;
		this.calificacion = calificacion;
	}
	
	public Estudiante() {
		super();
	}

	//Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
	
	// Métodos (comportamiento)
    public boolean aprobo() {
        return calificacion >= 70; // regla de negocio: 70 es aprobatorio
    }
    
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Calificación: " + calificacion);
        System.out.println("¿Aprobó?: " + (aprobo() ? "Sí" : "No"));
    }

    
}
