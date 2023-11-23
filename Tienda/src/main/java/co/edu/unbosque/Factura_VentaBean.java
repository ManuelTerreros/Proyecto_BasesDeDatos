package co.edu.unbosque;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import co.edu.unbosque.Modelos.DAO.Factura_VentaDAO;
import co.edu.unbosque.Modelos.DTO.Factura_ventaDTO;


@Controller
public class Factura_VentaBean {

	@Autowired
	private Factura_VentaDAO factVenta;
	
	@GetMapping("/listaFactura_Venta")
	public String listaFactura_Venta(Model modelo) {
		List<Factura_ventaDTO> lista = factVenta.listar();
		modelo.addAttribute("listasFactura_Venta", lista);
		return "listaFactura_Venta";
	}
	
	@GetMapping("/agregarFactura_Venta")
	public String Factura_Venta(Model modelo) {
		modelo.addAttribute("factura_VentaDTO", new Factura_ventaDTO());
		return "formularioFactura_Venta";
	}
	
	@PostMapping("/guardarFactura_Venta")
	public String guardarFactura_Venta(@ModelAttribute Factura_ventaDTO factura_VentaDTO) {
		factVenta.guardar(factura_VentaDTO);
		return "redirect:/listaFactura_Venta";
	}
	
	@GetMapping("/editarFactura_Venta/{id}")
	public String editarFactura_Venta(@PathVariable long id, Model modelo) {
		Factura_ventaDTO factura_VentaDTO = factVenta.buscarId(id);
		modelo.addAttribute("factura_VentaDTO", factura_VentaDTO);
		return "formeditarFactura_Venta";
	}
	
	@PostMapping("/actualizarFactura_Venta")
	public String actualizarFactura_Venta(@ModelAttribute Factura_ventaDTO factura_VentaDTO) {
		factVenta.actualizar(factura_VentaDTO);
		return "redirect:/listaFactura_Venta";
	}
	
	@GetMapping("/borrarFactura_Venta/{id}")
	public String borrarFactura_Venta (@PathVariable long id) {
		factVenta.borrar(id);
		return "redirect:/listaFactura_Venta";
	}
	
}
