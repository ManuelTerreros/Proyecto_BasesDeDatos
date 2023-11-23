package co.edu.unbosque;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import co.edu.unbosque.Modelos.DAO.Ubicacion_SucursalDAO;
import co.edu.unbosque.Modelos.DTO.Ubicacion_SucursalDTO;

@Controller
public class SucursalBean {
	
	@Autowired
	private Ubicacion_SucursalDAO udao;
	
	@GetMapping("/listarSucursalubi")
	public String listarSucursalubi(Model modelo) {
	     List<Ubicacion_SucursalDTO> lista = udao.listar();
	     modelo.addAttribute("listasucursal", lista);
	     return "listaSucursal";
	 }
	
	@GetMapping("/agregarSucursal")
    public String agregarSucursal(Model modelo) {
        modelo.addAttribute("sucursalDTO", new Ubicacion_SucursalDTO());
        return "formularioSucursal";
    }
//
    @PostMapping("/guardarSucursal")
    public String guardarSucursal(@ModelAttribute Ubicacion_SucursalDTO ubicacion_sucursalDTO) {
        udao.guardar(ubicacion_sucursalDTO);
        return "redirect:/listarSucursalubi";
    }
    
    @GetMapping("/editarSucursal/{id}")
    public String editar(@PathVariable long id, Model modelo) {
        Ubicacion_SucursalDTO ubicacion_sucursalDTO = udao.buscarId(id);
        modelo.addAttribute("sucursalDTO", ubicacion_sucursalDTO);
        return "formeditarSucursal";
    }
//
    @PostMapping("/actualizarSucursal")
    public String actualizar(@ModelAttribute Ubicacion_SucursalDTO ubicacion_sucursalDTO) {
        udao.actualizar(ubicacion_sucursalDTO);
        return "redirect:/listarSucursalubi";
    }
//
    @GetMapping("/borrarSucursal/{id}")
    public String borrar(@PathVariable long id) {
        udao.borrar(id);
        return "redirect:/listarSucursalubi";
    }
    
    @GetMapping("/regresarsucursal")
	public String regresar() {
		return "Menu";
	}

}
