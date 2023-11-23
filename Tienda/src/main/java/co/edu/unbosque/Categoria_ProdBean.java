package co.edu.unbosque;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import co.edu.unbosque.Modelos.DAO.Categoria_ProdDAO;
import co.edu.unbosque.Modelos.DTO.Categoria_ProdDTO;

@Controller
public class Categoria_ProdBean {

	@Autowired
	private Categoria_ProdDAO categoria_Produ;
	
	@GetMapping("/listaCategoria_Prod")
	public String listaCategoria_Prod(Model modelo) {
		List<Categoria_ProdDTO> lista = categoria_Produ.listar();
		modelo.addAttribute("listasCategoria_Prod", lista);
		return "listaCategoria_Prod";
	}
	
	@GetMapping("/agregarCategoria_Prod")
	public String agregarCategoria_Prod(Model modelo) {
		modelo.addAttribute("categoria_ProdDTO", new Categoria_ProdDTO());
		return "formularioCategoria_Prod";
	}
	
	@PostMapping("/guardarCategoria_Prod")
	public String guardarCategoria_Prod(@ModelAttribute Categoria_ProdDTO categoriaProductoDTO) {
		categoria_Produ.guardar(categoriaProductoDTO);
		return "redirect:/listaCategoria_Prod";
	}
	
	@GetMapping("/editarCategoria_Prod/{id}")
	public String editarCategoria_Prod(@PathVariable String id, Model modelo) {
		Categoria_ProdDTO categoriaProductoDTO = categoria_Produ.buscarId(id);
		modelo.addAttribute("categoria_ProdDTO", categoriaProductoDTO);
		return "formeditarCategoria_Prod";
	}
	
	@PostMapping("/actualizarCategoria_Prod")
	public String actualizarCategoria_Prod(@ModelAttribute Categoria_ProdDTO categoriaProductoDTO) {
		categoria_Produ.actualizar(categoriaProductoDTO);
		return "redirect:/listaCategoria_Prod";
	}
	
	@GetMapping("/borrarCategoria_Prod/{id}")
	public String borrarCategoria_Prod (@PathVariable String id) {
		categoria_Produ.borrar(id);
		return "redirect:/listaCategoria_Prod";
	}
	
}
