package co.edu.unbosque;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import co.edu.unbosque.Modelos.DAO.DepartamentoDAO;
import co.edu.unbosque.Modelos.DTO.DepartamentoDTO;


@Controller
public class DepartamentoBean {

	@Autowired
	private DepartamentoDAO depart;
	
	@GetMapping("/listaDepartamento")
	public String listaDepartamento(Model modelo) {
		List<DepartamentoDTO> lista = depart.listar();
		modelo.addAttribute("listadepartamento", lista);
		return "listaDepartamento";
	}
	
	@GetMapping("/agregarDepartamento")
	public String agregarDepartamento(Model modelo) {
		modelo.addAttribute("departamentoDTO", new DepartamentoDTO());
		return "formularioDepartamento";
	}
	
	@PostMapping("/guardarDepartamento")
	public String guardarDepartamento(@ModelAttribute DepartamentoDTO departamentoDTO) {
		depart.guardar(departamentoDTO);
		return "redirect:/listaDepartamento";
	}
	
	@GetMapping("/editarDepartamento/{id}")
	public String editarDepartamento(@PathVariable long id, Model modelo) {
		DepartamentoDTO departamentoDTO = depart.buscarId(id);
		modelo.addAttribute("departamentoDTO", departamentoDTO);
		return "formeditarDepartamento";
	}
	
	@PostMapping("/actualizarDepartamento")
	public String actualizarDepartamento(@ModelAttribute DepartamentoDTO departamentoDTO) {
		depart.actualizar(departamentoDTO);
		return "redirect:/listaDepartamento";
	}
	
	@GetMapping("/borrarDepartamento/{id}")
	public String borrarDepartamento (@PathVariable long id) {
		depart.borrar(id);
		return "redirect:/listaDepartamento";
	}
}
