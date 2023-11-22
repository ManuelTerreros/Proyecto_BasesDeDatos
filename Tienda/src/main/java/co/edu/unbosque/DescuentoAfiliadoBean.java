package co.edu.unbosque;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import co.edu.unbosque.Modelos.DAO.Descuentos_AfiliadosDAO;
import co.edu.unbosque.Modelos.DTO.Descuentos_afiliadosDTO;

@Controller
public class DescuentoAfiliadoBean {
	
	@Autowired
	private Descuentos_AfiliadosDAO dao;
	
	@GetMapping("/listarDescuentos")
	public String listarAfiliados(Model modelo) {
		List<Descuentos_afiliadosDTO> lista = dao.listar();
		modelo.addAttribute("listaDescuentos", lista);
		return "listadescuentos";
	}
	
	@GetMapping("/agregardescuento")
	public String agregardescuento(Model modelo) {
		modelo.addAttribute("descuentoDTO", new Descuentos_afiliadosDTO());
		return "formulariodescuento";
	}
	
	@PostMapping("/guardarDescuento")
	public String guardarDescuento(@ModelAttribute Descuentos_afiliadosDTO descuentos_afiliadosDTO) {
		dao.guardar(descuentos_afiliadosDTO);
		return "redirect:/listarDescuentos";
	}
	
	@GetMapping("/editardescuento/{id}")
	public String editar(@PathVariable long id, Model modelo) {
	    Descuentos_afiliadosDTO descuentos_afiliadosDTO = dao.buscarId(id);
		modelo.addAttribute("descuentoDTO", descuentos_afiliadosDTO);
		return "formeditardescuento";
	}
	
	@PostMapping("/actualizardescuento")
	public String actualizar(@ModelAttribute Descuentos_afiliadosDTO descuentos_afiliadosDTO) {
		dao.actualizar(descuentos_afiliadosDTO);
		return "redirect:/listarDescuentos";
	}
	
	@GetMapping("/regresarIndexDesc")
	public String regresar() {
		return "Menu";
	}

}
