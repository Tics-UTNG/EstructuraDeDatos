package unidad_uno.ejemplo2;

/**
 * La clase Libro representa a los libros de una biblioteca
 */
public class Libro {
	//Atributos de la clase
	private	String nombre;
	private String autor;
	
	//Constructores de la clase
	public Libro() {
		super();
	}

	public Libro(String nombre, String autor) {
		super();
		this.nombre = nombre;
		this.autor = autor;
	}

	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Libro [nombre=" + nombre + ", autor=" + autor + "]";
	}	
}
