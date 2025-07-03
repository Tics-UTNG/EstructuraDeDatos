package escolar;

public class MainEstudiante {
	public static void main(String args[]) {
		
		Estudiante alumno1 = new Estudiante("Luis Pérez", "A012345", 85.5);
        Estudiante alumno2 = new Estudiante("Ana Torres", "A098765", 62.0);
        
        // Mostrar información
        alumno1.mostrarInfo();
        System.out.println("-----");
        alumno2.mostrarInfo();

	}
}
