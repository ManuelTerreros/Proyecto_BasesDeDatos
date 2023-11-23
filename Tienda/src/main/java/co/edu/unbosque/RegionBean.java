package co.edu.unbosque;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import co.edu.unbosque.Modelos.DAO.RegionDAO;
import co.edu.unbosque.Modelos.DTO.AfiliadoDTO;
import co.edu.unbosque.Modelos.DTO.RegionDTO;

@Controller
public class RegionBean {
	
	@Autowired
	private RegionDAO rdao;
	
	@GetMapping("/listarregiones")
	public String listarregiones(Model modelo) {
		List<RegionDTO> lista = rdao.listar();
		modelo.addAttribute("listaregion", lista);
		return "listaRegiones";
	}
	
	@GetMapping("/agregarregion")
	public String agregarregion(Model modelo) {
		modelo.addAttribute("regionDTO", new RegionDTO());
		return "formularioRegion";
	}
	
	@PostMapping("/guardarRegion")
	public String guardarRegion(@ModelAttribute RegionDTO regionDTO) {
		rdao.guardar(regionDTO);
		return "redirect:/listarregiones";
	}
	
	@GetMapping("/editarRegion/{id}")
	public String editar(@PathVariable String id, Model modelo) {
		RegionDTO regionDTO = rdao.buscarId(id);
		modelo.addAttribute("regionDTO", regionDTO);
		return "formeditarRegion";
	}
	
	@PostMapping("/actualizarRegion")
	public String actualizar(@ModelAttribute RegionDTO regionDTO) {
		rdao.actualizar(regionDTO);
		return "redirect:/listarregiones";
	}

	@GetMapping("/borrarregion/{id}")
	public String borrar (@PathVariable String id) {
		rdao.borrar(id);
		return "redirect:/listarregiones";
	}
	
	@GetMapping("/regresarRegion")
	public String regresar() {
		return "Menu";
	}

}
