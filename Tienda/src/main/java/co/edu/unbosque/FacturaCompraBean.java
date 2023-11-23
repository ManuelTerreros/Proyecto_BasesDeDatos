package co.edu.unbosque;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import co.edu.unbosque.Modelos.DAO.Factura_CompraDAO;
import co.edu.unbosque.Modelos.DTO.Factura_CompraDTO;


@Controller
public class FacturaCompraBean {

	@Autowired
	private Factura_CompraDAO factuCompra;
	
	@GetMapping("/listaFactura_Compra")
	public String listaFactura_Compra(Model modelo) {
		List<Factura_CompraDTO> lista = factuCompra.listar();
		modelo.addAttribute("listasFactura_Compra", lista);
		return "listaFactura_Compra";
	}
	
	@GetMapping("/agregarFactura_Compra")
	public String agregarFactura_Compra(Model modelo) {
		modelo.addAttribute("factura_CompraDTO", new Factura_CompraDTO());
		return "formularioFactura_Compra";
	}
	
	@PostMapping("/guardarFactura_Compra")
	public String guardarFactura_Compra(@ModelAttribute Factura_CompraDTO factura_CompraDTO) {
		factuCompra.guardar(factura_CompraDTO);
		return "redirect:/listaFactura_Compra";
	}
	
	@GetMapping("/editarFactura_Compra/{id}")
	public String editarFactura_Compra(@PathVariable long id, Model modelo) {
		Factura_CompraDTO factura_CompraDTO = factuCompra.buscarId(id);
		modelo.addAttribute("factura_CompraDTO", factura_CompraDTO);
		return "formeditarFactura_Compra";
	}
	
	@PostMapping("/actualizarFactura_Compra")
	public String actualizarFactura_Compra(@ModelAttribute Factura_CompraDTO factura_CompraDTO) {
		factuCompra.actualizar(factura_CompraDTO);
		return "redirect:/listaFactura_Compra";
	}
	
	@GetMapping("/borrarFactura_Compra/{id}")
	public String borrarFactura_Compra (@PathVariable long id) {
		factuCompra.borrar(id);
		return "redirect:/listaFactura_Compra";
	}
	
}
