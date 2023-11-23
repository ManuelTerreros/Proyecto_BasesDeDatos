package co.edu.unbosque;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import co.edu.unbosque.Modelos.DAO.ProveedorDAO;
import co.edu.unbosque.Modelos.DTO.ProveedorDTO;



@Controller
public class ProveedorBean {

	@Autowired
	private ProveedorDAO proveedor;
	
	@GetMapping("/listaProveedor")
	public String listaProveedor(Model modelo) {
		List<ProveedorDTO> lista = proveedor.listar();
		modelo.addAttribute("listasProveedor", lista);
		return "listaProveedor";
	}
	
	@GetMapping("/agregarProveedor")
	public String agregarProveedor(Model modelo) {
		modelo.addAttribute("proveedorDTO", new ProveedorDTO());
		return "formularioProveedor";
	}
	
	@PostMapping("/guardarProveedor")
	public String guardarProveedor(@ModelAttribute ProveedorDTO proveedorDTO) {
		proveedor.guardar(proveedorDTO);
		return "redirect:/listaProveedor";
	}
	
	@GetMapping("/editarProveedor/{id}")
	public String editarProveedor(@PathVariable long id, Model modelo) {
		ProveedorDTO proveedorDTO = proveedor.buscarId(id);
		modelo.addAttribute("proveedorDTO", proveedorDTO);
		return "formeditarProveedor";
	}
	
	@PostMapping("/actualizarProveedor")
	public String actualizarProveedor(@ModelAttribute ProveedorDTO proveedorDTO) {
		proveedor.actualizar(proveedorDTO);
		return "redirect:/listaProveedor";
	}
	
	@GetMapping("/borrarProveedor/{id}")
	public String borrarProveedor (@PathVariable long id) {
		proveedor.borrar(id);
		return "redirect:/listaProveedor";
	}
}
