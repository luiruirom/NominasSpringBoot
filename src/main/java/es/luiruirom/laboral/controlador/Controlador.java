package es.luiruirom.laboral.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import es.luiruirom.laboral.interfazServicio.IEmpleadoServicio;
import es.luiruirom.laboral.modelo.Empleado;

@Controller
@RequestMapping
public class Controlador {
	
	@Autowired
	private IEmpleadoServicio servicio;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Empleado> empleados = servicio.listar();
		model.addAttribute("empleados", empleados);
		return "index";
	}
	
	@GetMapping("/nuevo")
	public String agregar(Model model) {
		model.addAttribute("empleado", new Empleado());
		return "form";
	}
	
	@PostMapping("/save")
	public String guardar(Empleado e, Model model) {
		servicio.save(e);
		return "redirect:/listar";
	}
	
	@GetMapping("/editar/{dni}")
	public String editar(@PathVariable String dni, Model model) {
		Optional<Empleado>empleado = servicio.listarDni(dni);
		model.addAttribute("empleado", empleado);
		return "form";
	}
	
	@GetMapping("/eliminar/{dni}")
	public String delete(Model model, @PathVariable String dni) {
		servicio.delete(dni);
		return "redirect:/listar";
	}
}
