package co.edu.unbosque;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import co.edu.unbosque.Modelos.DAO.EnvioDAO;
import co.edu.unbosque.Modelos.DTO.EnvioDTO;


@Controller
public class EnvioBean {

	@Autowired
	private EnvioDAO envi;
	
	@GetMapping("/listaEnvio")
	public String listaEnvio(Model modelo) {
		List<EnvioDTO> lista = envi.listar();
		modelo.addAttribute("listasEnvio", lista);
		return "listaEnvio";
	}
	
	@GetMapping("/agregarEnvio")
	public String agregarEnvio(Model modelo) {
		modelo.addAttribute("envioDTO", new EnvioDTO());
		return "formularioEnvio";
	}
	
	@PostMapping("/guardarEnvio")
	public String guardarEnvio(@ModelAttribute EnvioDTO envioDTO) {
		envi.guardar(envioDTO);
		return "redirect:/listaEnvio";
	}
	
	@GetMapping("/editarEnvio/{id}")
	public String editarEnvio(@PathVariable String id, Model modelo) {
		EnvioDTO envioDTO = envi.buscarId(id);
		modelo.addAttribute("envioDTO", envioDTO);
		return "formeditarEnvio";
	}
	
	@PostMapping("/actualizarEnvio")
	public String actualizarEnvio(@ModelAttribute EnvioDTO envioDTO) {
		envi.actualizar(envioDTO);
		return "redirect:/listaEnvio";
	}
	
	@GetMapping("/borrarEnvio/{id}")
	public String borrarEnvio (@PathVariable String id) {
		envi.borrar(id);
		return "redirect:/listaEnvio";
	}
	
}
