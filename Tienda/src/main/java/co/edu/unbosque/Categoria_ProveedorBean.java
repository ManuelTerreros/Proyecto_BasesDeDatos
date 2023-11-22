package co.edu.unbosque;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import co.edu.unbosque.Modelos.DAO.Categoria_ProveedorDao;
import co.edu.unbosque.Modelos.DTO.Categoria_ProveedorDTO;

public class Categoria_ProveedorBean {

	    @Autowired
	    private Categoria_ProveedorDao categoria_proveedorDAO;

	    @GetMapping()
	    public String listar(Model modelo) {
	        List<Categoria_ProveedorDTO> lista = categoria_proveedorDAO.listar();
	        modelo.addAttribute("listaCategoria_Proveedores", lista);
	        return "";
	    }

	    @GetMapping()
	    public String agregarboton(Model modelo) {
	        modelo.addAttribute("categoria_proveedorDTO", new Categoria_ProveedorDTO());
	        return "";
	    }

	    @PostMapping()
	    public String guardar(@ModelAttribute Categoria_ProveedorDTO categoria_proveedorDTO) {
	        categoria_proveedorDAO.guardar(categoria_proveedorDTO);
	        return "";
	    }

	    @GetMapping("/editar/{id_Categoria_Proveedor}")
	    public String editar(@PathVariable String id_Categoria_Proveedor, Model modelo) {
	        Categoria_ProveedorDTO categoria_proveedorDTO = categoria_proveedorDAO.buscarId(id_Categoria_Proveedor);
	        modelo.addAttribute("categoria_proveedorDTO", categoria_proveedorDTO);
	        return "";
	    }

	    @PostMapping("/actualizar")
	    public String actualizar(@ModelAttribute Categoria_ProveedorDTO categoria_proveedorDTO) {
	        categoria_proveedorDAO.actualizar(categoria_proveedorDTO);
	        return "";
	    }

	    @GetMapping("/borrar/{id_Categoria_Proveedor}")
	    public String borrar(@PathVariable String id_Categoria_Proveedor) {
	        categoria_proveedorDAO.borrar(id_Categoria_Proveedor);
	        return "";
	    }
	}

