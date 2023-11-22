package co.edu.unbosque;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import co.edu.unbosque.Modelos.DAO.Ubicacion_SucursalDAO;
import co.edu.unbosque.Modelos.DTO.Ubicacion_SucursalDTO;


@Repository
public class Ubicacion_SucursalBean {
	 @Autowired
	    private Ubicacion_SucursalDAO usdao;

	    @GetMapping()
	    public String listar(Model modelo) {
	        List<Ubicacion_SucursalDTO> lista = usdao.listar();
	        modelo.addAttribute("listaUbicacion_Sucursales", lista);
	        return "";
	    }

	    @GetMapping()
	    public String agregarboton(Model modelo) {
	        modelo.addAttribute("ubicacion_sucursalDTO", new Ubicacion_SucursalDTO());
	        return "";
	    }

	    @PostMapping()
	    public String guardar(@ModelAttribute Ubicacion_SucursalDTO ubicacion_sucursalDTO) {
	    	usdao.guardar(ubicacion_sucursalDTO);
	        return "";
	    }

	    @GetMapping()
	    public String editar(@PathVariable long id_Sucursal, Model modelo) {
	        Ubicacion_SucursalDTO ubicacion_sucursalDTO = usdao.buscarId(id_Sucursal);
	        modelo.addAttribute("ubicacion_sucursalDTO", ubicacion_sucursalDTO);
	        return "";
	    }

	    @PostMapping()
	    public String actualizar(@ModelAttribute Ubicacion_SucursalDTO ubicacion_sucursalDTO) {
	    	usdao.actualizar(ubicacion_sucursalDTO);
	        return "";
	    }

	    @GetMapping("")
	    public String borrar(@PathVariable long id_Sucursal) {
	    	usdao.borrar(id_Sucursal);
	        return "";
	    }
	    
	}