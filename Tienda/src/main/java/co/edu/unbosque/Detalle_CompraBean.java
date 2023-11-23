package co.edu.unbosque;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import co.edu.unbosque.Modelos.DAO.Detalle_CompraDAO;
import co.edu.unbosque.Modelos.DTO.Detalle_CompraDTO;



@Controller
public class Detalle_CompraBean {

	@Autowired
	private Detalle_CompraDAO detCompra;
	
	@GetMapping("/listaDetalle_Compra")
	public String listaDetalle_Compra(Model modelo) {
		List<Detalle_CompraDTO> lista = detCompra.listar();
		modelo.addAttribute("listasDetalle_Compra", lista);
		return "listaDetalle_Compra";
	}
	
	@GetMapping("/agregarDetalle_Compra")
	public String agregarDetalle_Compra(Model modelo) {
		modelo.addAttribute("detalle_CompraDTO", new Detalle_CompraDTO());
		return "formularioDetalle_Compra";
	}
	
	@PostMapping("/guardarDetalle_Compra")
	public String guardarDetalle_Compra(@ModelAttribute Detalle_CompraDTO detalle_CompraDTO) {
		detCompra.guardar(detalle_CompraDTO);
		return "redirect:/listaDetalle_Compra";
	}
	
	@GetMapping("/editarDetalle_Compra/{id}")
	public String editarDetalle_Compra(@PathVariable String id, Model modelo) {
		Detalle_CompraDTO detalle_CompraDTO = detCompra.buscarId(id);
		modelo.addAttribute("detalle_CompraDTO", detalle_CompraDTO);
		return "formeditarDetalle_Compra";
	}
	
	@PostMapping("/actualizarDetalle_Compra")
	public String actualizarDetalle_Compra(@ModelAttribute Detalle_CompraDTO detalle_CompraDTO) {
		detCompra.actualizar(detalle_CompraDTO);
		return "redirect:/listaDetalle_Compra";
	}
	
	@GetMapping("/borrarDetalle_Compra/{id}")
	public String borrarDetalle_Compra (@PathVariable String id) {
		detCompra.borrar(id);
		return "redirect:/listaDetalle_Compra";
	}
}
