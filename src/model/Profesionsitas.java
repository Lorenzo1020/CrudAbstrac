package model;

public abstract class Profesionsitas {
	// Es una super clase --- clase padre
	String matricula;
	String nombre;
	long cedula;

	public Profesionsitas() {
	}

	public Profesionsitas(String matricula, String nombre, long cedula) {
		this.matricula = matricula;
		this.nombre = nombre;
		this.cedula = cedula;
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getCedula() {
		return cedula;
	}

	public void setCedula(long cedula) {
		this.cedula = cedula;
	}

}
