package co.edu.unbosque;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import co.edu.unbosque.Modelos.DAO.PaisDAO;
import co.edu.unbosque.Modelos.DTO.PaisDTO;


@Controller
public class PaisBean {

	@Autowired
	private PaisDAO pdao;
	
	@GetMapping("/listarpais")
	public String listarpais(Model modelo) {
		List<PaisDTO> lista = pdao.listar();
		modelo.addAttribute("listapais", lista);
		return "listapais";
	}
	
	@GetMapping("/agregarpais")
	public String agregarpais(Model modelo) {
		modelo.addAttribute("paisDTO", new PaisDTO());
		return "formulariopais";
	}
//	
	@PostMapping("/guardarPais")
	public String guardarPais(@ModelAttribute PaisDTO paisDTO) {
		pdao.guardar(paisDTO);
		return "redirect:/listarpais";
	}

	@GetMapping("/editarPais/{id}")
	public String editar(@PathVariable long id, Model modelo) {
		PaisDTO paisDTO = pdao.buscarId(id);
		modelo.addAttribute("paisDTO", paisDTO);
		return "formeditarpais";
	}
	
	@PostMapping("/actualizarPais")
	public String actualizar(@ModelAttribute PaisDTO paisDTO) {
		pdao.actualizar(paisDTO);
		return "redirect:/listarpais";
	}
//
	@GetMapping("/borrarPais/{id}")
	public String borrar (@PathVariable long id) {
		pdao.borrar(id);
		return "redirect:/listarpais";
	}
	
	@GetMapping("/regresarPais")
	public String regresar() {
		return "Menu";
	}
}
