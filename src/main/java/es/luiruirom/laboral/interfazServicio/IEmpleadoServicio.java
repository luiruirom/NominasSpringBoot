package es.luiruirom.laboral.interfazServicio;

import java.util.*;

import es.luiruirom.laboral.modelo.Empleado;

public interface IEmpleadoServicio {
	public List<Empleado> listar();
	public Optional<Empleado> listarDni(String dni);
	public int save(Empleado e);
	public void delete(String dni);
}
