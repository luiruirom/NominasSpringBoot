package es.luiruirom.laboral.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import es.luiruirom.laboral.interfaces.IEmpleado;
import es.luiruirom.laboral.interfazServicio.IEmpleadoServicio;
import es.luiruirom.laboral.modelo.Empleado;

@Service
public class EmpleadoServicio implements IEmpleadoServicio{
	
	@Autowired
	private IEmpleado data;
	
	@Override
	public List<Empleado> listar() {
		return (List<Empleado>)data.findAll();
	}

	@Override
	public Optional<Empleado> listarDni(String dni) {
		return data.findById(dni);
	}

	@Override
	public int save(Empleado e) {
		int res=0;
		Empleado emp = data.save(e);
		if(!emp.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(String dni) {
		data.deleteById(dni);
	}

}
