package co.edu.unbosque;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import co.edu.unbosque.Modelos.DAO.AfiliadoDAO;
import co.edu.unbosque.Modelos.DTO.AfiliadoDTO;
import co.edu.unbosque.Modelos.DTO.ClienteDTO;

@Controller
public class AfiliadoBean {
	
	@Autowired
	private AfiliadoDAO aficao;
	
	@GetMapping("/listarAfiliados")
	public String listarAfiliados(Model modelo) {
		List<AfiliadoDTO> lista = aficao.listar();
		modelo.addAttribute("listaafiliados", lista);
		return "listaAfiliados";
	}
	
	@GetMapping("/agregarAfiliado")
	public String agregarAfiliado(Model modelo) {
		modelo.addAttribute("afiliadoDTO", new AfiliadoDTO());
		return "formularioAfiliado";
	}
	
	@PostMapping("/guardarAfilado")
	public String guardarAfiliado(@ModelAttribute AfiliadoDTO afiliadoDTO) {
		aficao.guardar(afiliadoDTO);
		return "redirect:/listarAfiliados";
	}
	
	@GetMapping("/editarAfiliado/{id}")
	public String editar(@PathVariable long id, Model modelo) {
	    AfiliadoDTO afiliadoDTO = aficao.buscarId(id);
		modelo.addAttribute("afiliadoDTO", afiliadoDTO);
		return "formeditarAfiliado";
	}
	
	@PostMapping("/actualizarAfiliado")
	public String actualizar(@ModelAttribute AfiliadoDTO afiliadoDTO) {
		aficao.actualizar(afiliadoDTO);
		return "redirect:/listarAfiliados";
	}
	
	@GetMapping("/regresarIndex")
	public String regresar() {
		return "Menu";
	}
	

}
