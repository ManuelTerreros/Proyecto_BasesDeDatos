package co.edu.unbosque;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import co.edu.unbosque.Modelos.DAO.InventarioDAO;
import co.edu.unbosque.Modelos.DTO.InventarioDTO;
import co.edu.unbosque.Modelos.DTO.PaisDTO;

@Controller
public class InventarioBean {

	@Autowired
	private InventarioDAO idao;
	
	@GetMapping("/listarinventario")
    public String listarInventario(Model modelo) {
        List<InventarioDTO> lista = idao.listar();
        modelo.addAttribute("listaInventario", lista);
        return "listaInventario";
    }
	@GetMapping("/agregarInventario")
    public String agregarInventario(Model modelo) {
        modelo.addAttribute("inventarioDTO", new InventarioDTO());
        return "formularioInventario";
    }

    @PostMapping("/guardarInventario")
    public String guardarInventario(@ModelAttribute InventarioDTO inventarioDTO) {
        idao.guardar(inventarioDTO);
        return "redirect:/listarinventario";
    }
    
    @GetMapping("/editarinventario/{id}")
    public String editarInventario(@PathVariable String id, Model modelo) {
        InventarioDTO inventarioDTO = idao.buscarId(id);
        modelo.addAttribute("inventarioDTO", inventarioDTO);
        return "formeditarinventario";
    }

    @PostMapping("/actualizarinventario")
    public String actualizarInventario(@ModelAttribute InventarioDTO inventarioDTO) {
        idao.actualizar(inventarioDTO);
        return "redirect:/listarinventario";
    }

    @GetMapping("/borrarinventario/{id}")
    public String borrarInventario(@PathVariable String id) {
        idao.borrar(id);
        return "redirect:/listarinventario";
    }
	@GetMapping("/regresarinventario")
	public String regresar() {
		return "Menu";
	}
}
