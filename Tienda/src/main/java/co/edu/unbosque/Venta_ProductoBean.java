package co.edu.unbosque;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import co.edu.unbosque.Modelos.DAO.Venta_ProductoDAO;
import co.edu.unbosque.Modelos.DTO.Venta_ProductoDTO;
@Controller
public class Venta_ProductoBean {

    @Autowired
    private Venta_ProductoDAO vpdao;

    @GetMapping()
    public String listar(Model modelo) {
        List<Venta_ProductoDTO> lista = vpdao.listar();
        modelo.addAttribute("listaventa_productos", lista);
        return "";
    }

    @GetMapping()
    public String agregarboton(Model modelo) {
        modelo.addAttribute("venta_productoDTO", new Venta_ProductoDTO());
        return "";
    }

    @PostMapping()
    public String guardar(@ModelAttribute Venta_ProductoDTO venta_productoDTO) {
        vpdao.guardar(venta_productoDTO);
        return "";
    }

    @GetMapping()
    public String editar(@PathVariable long id_Venta, long id_Producto, Model modelo) {
        Venta_ProductoDTO venta_productoDTO = vpdao.buscarId(id_Venta, id_Producto);
        modelo.addAttribute("venta_productoDTO", venta_productoDTO);
        return "";
    }

    @PostMapping()
    public String actualizar(@ModelAttribute Venta_ProductoDTO venta_productoDTO) {
        vpdao.actualizar(venta_productoDTO);
        return "redirect:/listar";
    }

    @GetMapping()
    public String borrar(@PathVariable long id_Venta, long id_Producto) {
        vpdao.borrar(id_Venta, id_Producto);
        return "";
    }

	
	@GetMapping("/ingresar")
	public String ingresar() {
		return "Menu";
	}
	
	@GetMapping("/regresar")
	public String regresar() {
		return "Menu";
	}
}

