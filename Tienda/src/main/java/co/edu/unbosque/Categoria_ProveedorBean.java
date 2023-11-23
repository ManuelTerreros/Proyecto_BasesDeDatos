package co.edu.unbosque;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import co.edu.unbosque.Modelos.DAO.Categoria_ProveedorDao;
import co.edu.unbosque.Modelos.DTO.Categoria_ProveedorDTO;


@Controller
public class Categoria_ProveedorBean {

	@Autowired
	private Categoria_ProveedorDao catProvee;
	
	@GetMapping("/listaCategoria_Proveedor")
	public String listaCategoria_Proveedor(Model modelo) {
		List<Categoria_ProveedorDTO> lista = catProvee.listar();
		modelo.addAttribute("listasCategoria_Proveedor", lista);
		return "listaCategoria_Proveedor";
	}
	
	@GetMapping("/agregarCategoria_Proveedor")
	public String agregarCategoria_Proveedor(Model modelo) {
		modelo.addAttribute("categoria_ProveedorDTO", new Categoria_ProveedorDTO());
		return "formularioCategoria_Proveedor";
	}
	
	@PostMapping("/guardarCategoria_Proveedor")
	public String guardarCategoria_Proveedor(@ModelAttribute Categoria_ProveedorDTO categoria_ProveedorDTO) {
		catProvee.guardar(categoria_ProveedorDTO);
		return "redirect:/listaCategoria_Proveedor";
	}
	
	@GetMapping("/editarCategoria_Proveedor/{id}")
	public String editarCategoria_Proveedor(@PathVariable String id, Model modelo) {
		Categoria_ProveedorDTO categoria_ProveedorDTO = catProvee.buscarId(id);
		modelo.addAttribute("categoria_ProveedorDTO", categoria_ProveedorDTO);
		return "formeditarCategoria_Proveedor";
	}
	
	@PostMapping("/actualizarCategoria_Proveedor")
	public String actualizarCategoria_Proveedor(@ModelAttribute Categoria_ProveedorDTO categoria_ProveedorDTO) {
		catProvee.actualizar(categoria_ProveedorDTO);
		return "redirect:/listaCategoria_Proveedor";
	}
	
	@GetMapping("/borrarCategoria_Proveedor/{id}")
	public String borrarCategoria_Proveedor (@PathVariable String id) {
		catProvee.borrar(id);
		return "redirect:/listaCategoria_Proveedor";
	}
	
}
