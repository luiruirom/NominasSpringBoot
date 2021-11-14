package es.luiruirom.laboral.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empleados")
public class Empleado {
	
//	
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int id;
	
	@Id
	private String dni;
	
	private String nombre;
	private char sexo;
	private int categoria=1;
	private int anyos=0;
	
	public Empleado() {	
	}
	
	
	public Empleado(String nombre, String dni, char sexo, int categoria, int anyos) {
		this.nombre = nombre;
		this.dni = dni;
		this.sexo = sexo;
		this.setCategoria(categoria);
		this.anyos = anyos;
	}

	public Empleado(String nombre, String dni, char sexo) {
		this.nombre = nombre;
		this.dni = dni;
		this.sexo = sexo;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getAnyos() {
		return anyos;
	}

	public void setAnyos(int anyos) {
		this.anyos = anyos;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public void incrAnyo() {
		this.anyos++;
	}

	public String imprime() {
		return "Empleado [nombre=" + nombre + ", dni=" + dni +", categoria=" + categoria + ", anyos=" + anyos + "]";
	}
}
