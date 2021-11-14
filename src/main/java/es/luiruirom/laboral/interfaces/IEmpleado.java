package es.luiruirom.laboral.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import es.luiruirom.laboral.modelo.Empleado;

@Repository
public interface IEmpleado extends CrudRepository<Empleado, String>{
	
}
