package model;

//Clase hijo o subclase
public class LicInformatica extends Profesionsitas {
	String equipoComp;
	String tecgDesar;

	public LicInformatica() {
	}

	// Al gregar este constructor seleccionar los atributos de la super clase
	public LicInformatica(String matricula, String nombre, long cedula, String equipoComp, String tecgDesar) {
		super(matricula, nombre, cedula);
		this.equipoComp = equipoComp;
		this.tecgDesar = tecgDesar;
	}

	// Al agregar este metodo seleccionar los atributos de la superclase y subirlos
	@Override
	public String toString() {
		return "LicInformatica [matricula=" + matricula + ", nombre=" + nombre + ", cedula=" + cedula + ", equipoComp="
				+ equipoComp + ", tecgDesar=" + tecgDesar + "]\n";
	}

	public String getEquipoComp() {
		return equipoComp;
	}

	public void setEquipoComp(String equipoComp) {
		this.equipoComp = equipoComp;
	}

	public String getTecgDesar() {
		return tecgDesar;
	}

	public void setTecgDesar(String tecgDesar) {
		this.tecgDesar = tecgDesar;
	}

}
