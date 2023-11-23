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

    @GetMapping("/listaVenta_Producto")
    public String listar(Model modelo) {
        List<Venta_ProductoDTO> lista = vpdao.listar();
        modelo.addAttribute("listaventa_productos", lista);
        return "listaVenta_Producto";
    }

    @GetMapping("/agregarVenta_Producto")
    public String agregarboton(Model modelo) {
        modelo.addAttribute("venta_productoDTO", new Venta_ProductoDTO());
        return "formularioVenta_Producto";
    }

    @PostMapping("/guardarVenta_Producto")
    public String guardar(@ModelAttribute Venta_ProductoDTO venta_productoDTO) {
        vpdao.guardar(venta_productoDTO);
        return "redirect:/listaVenta_Producto";
    }

    @GetMapping("/editarVenta_Producto/{id}")
    public String editar(@PathVariable long id, Model modelo) {
        Venta_ProductoDTO venta_productoDTO = vpdao.buscarId(id);
        modelo.addAttribute("venta_productoDTO", venta_productoDTO);
        return "formeditarVenta_Producto";
    }

    @PostMapping("/actualizarVenta_Producto")
    public String actualizar(@ModelAttribute Venta_ProductoDTO venta_productoDTO) {
        vpdao.actualizar(venta_productoDTO);
        return "redirect:/listaVenta_Producto";
    }

    @GetMapping("/borrarVenta_Producto/{id_Venta}")
    public String borrar(@PathVariable long id_Venta) {
        vpdao.borrar(id_Venta);
        return "redirect:/listaVenta_Producto";
    }

}

