package co.edu.unbosque;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import co.edu.unbosque.Modelos.DAO.Forma_Pago;
import co.edu.unbosque.Modelos.DTO.Forma_PagoDTO;


@Controller
public class Forma_PagoBean {

	@Autowired
	private Forma_Pago formPago;
	
	@GetMapping("/listaForma_Pago")
	public String listaForma_Pago(Model modelo) {
		List<Forma_PagoDTO> lista = formPago.listar();
		modelo.addAttribute("listasForma_Pago", lista);
		return "listaForma_Pago";
	}
	
	@GetMapping("/agregarForma_Pago")
	public String agregarForma_Pago(Model modelo) {
		modelo.addAttribute("forma_PagoDTO", new Forma_PagoDTO());
		return "formularioForma_Pago";
	}
	
	@PostMapping("/guardarForma_Pago")
	public String guardarForma_Pago(@ModelAttribute Forma_PagoDTO forma_PagoDTO) {
		formPago.guardar(forma_PagoDTO);
		return "redirect:/listaForma_Pago";
	}
	
	@GetMapping("/editarForma_Pago/{id}")
	public String editarForma_Pago(@PathVariable String id, Model modelo) {
		Forma_PagoDTO forma_PagoDTO = formPago.buscarId(id);
		modelo.addAttribute("forma_PagoDTO", forma_PagoDTO);
		return "formeditarForma_Pago";
	}
	
	@PostMapping("/actualizarForma_Pago")
	public String actualizarForma_Pago(@ModelAttribute Forma_PagoDTO forma_PagoDTO) {
		formPago.actualizar(forma_PagoDTO);
		return "redirect:/listaForma_Pago";
	}
	
	@GetMapping("/borrarForma_Pago/{id}")
	public String borrarForma_Pago (@PathVariable String id) {
		formPago.borrar(id);
		return "redirect:/listaForma_Pago";
	}
	
}
