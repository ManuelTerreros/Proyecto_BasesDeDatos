package co.edu.unbosque;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import co.edu.unbosque.Modelos.DAO.ProductoDAO;
import co.edu.unbosque.Modelos.DTO.ProductoDTO;

@Controller
public class ProductoBean {

	@Autowired
	private ProductoDAO prdao;
	
	@GetMapping("/listarProductos")
    public String listarProductos(Model modelo) {
        List<ProductoDTO> lista = prdao.listar();
        modelo.addAttribute("listaProductos", lista);
        return "listaProductos";
    }
	@GetMapping("/regresarProducto")
	public String regresar() {
		return "Menu";
	}
	
	@GetMapping("/agregarproducto")
    public String agregarProducto(Model modelo) {
        modelo.addAttribute("productoDTO", new ProductoDTO());
        return "formularioproducto";
    }

    @PostMapping("/guardarproducto")
    public String guardarProducto(@ModelAttribute ProductoDTO productoDTO) {
    	prdao.guardar(productoDTO);
        return "redirect:/listarProductos";
    }

    @GetMapping("/editarproducto/{id}")
    public String editarProducto(@PathVariable long id, Model modelo) {
        ProductoDTO productoDTO = prdao.buscarId(id);
        modelo.addAttribute("productoDTO", productoDTO);
        return "formeditarproducto";
    }

    @PostMapping("/actualizarproducto")
    public String actualizarProducto(@ModelAttribute ProductoDTO productoDTO) {
    	prdao.actualizar(productoDTO);
        return "redirect:/listarProductos";
    }
//
    @GetMapping("/borrarproducto/{id}")
    public String borrarProducto(@PathVariable long id) {
    	prdao.borrar(id);
        return "redirect:/listarProductos";
    }
	
}
