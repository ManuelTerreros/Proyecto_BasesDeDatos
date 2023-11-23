package co.edu.unbosque;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import co.edu.unbosque.Modelos.DAO.CargoDAO;
import co.edu.unbosque.Modelos.DTO.CargoDTO;


@Controller
public class CargoBean {
	
	@Autowired
	private CargoDAO carg;
	
	@GetMapping("/listaCargo")
	public String listaCargo(Model modelo) {
		List<CargoDTO> lista = carg.listar();
		modelo.addAttribute("listasCargo", lista);
		return "listaCargo";
	}
	
	@GetMapping("/agregarCargo")
	public String agregarCargo(Model modelo) {
		modelo.addAttribute("cargoDTO", new CargoDTO());
		return "formularioCargo";
	}
	
	@PostMapping("/guardarCargo")
	public String guardarCargo(@ModelAttribute CargoDTO cargoDTO) {
		carg.guardar(cargoDTO);
		return "redirect:/listaCargo";
	}
	
	@GetMapping("/editarCargo/{id}")
	public String editarCargo(@PathVariable String id, Model modelo) {
		CargoDTO cargoDTO = carg.buscarId(id);
		modelo.addAttribute("cargoDTO", cargoDTO);
		return "formeditarCargo";
	}
	
	@PostMapping("/actualizarCargo")
	public String actualizarCargo(@ModelAttribute CargoDTO cargoDTO) {
		carg.actualizar(cargoDTO);
		return "redirect:/listaCargo";
	}
	
	@GetMapping("/borrarCargo/{id}")
	public String borrarCargo (@PathVariable String id) {
		carg.borrar(id);
		return "redirect:/listaCargo";
	}
	
	

}
