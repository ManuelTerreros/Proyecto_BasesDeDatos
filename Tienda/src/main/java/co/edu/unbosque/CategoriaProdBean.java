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
import co.edu.unbosque.Modelos.DAO.Categoria_ProveedorDao;
import co.edu.unbosque.Modelos.DTO.Categoria_ProdDTO;
import co.edu.unbosque.Modelos.DTO.Categoria_ProveedorDTO;


@Controller
public class CategoriaProdBean {
	
	@Autowired
	private Categoria_ProdDAO cpdao;
	
	@GetMapping("/listarCategoriaProd")
	public String listarCategoriaProd(Model modelo) {
	     List<Categoria_ProdDTO> lista =  cpdao.listar();
	     modelo.addAttribute("listacategoriaprod", lista);
	     return "listacategoriaprod";
	 }
//	
	@GetMapping("/agregarcategoriaProd")
    public String agregarcategoriaProv(Model modelo) {
        modelo.addAttribute("categoriaProdDTO", new Categoria_ProdDTO());
        return "formularioCategoriaProd";
    }
////
    @PostMapping("/guardarcategoriaprod")
    public String guardarcategoriaprod(@ModelAttribute Categoria_ProdDTO categoria_ProdDTO) {
        cpdao.guardar(categoria_ProdDTO);
        return "redirect:/listarCategoriaProd";
    }
//    
    @GetMapping("/editarcategoriaprod/{id}")
    public String editar(@PathVariable String id, Model modelo) {
    	Categoria_ProdDTO categoria_ProdDTO = cpdao.buscarId(id);
        modelo.addAttribute("categoriaProdDTO", categoria_ProdDTO);
        return "formeditarcategoriaprodl";
    }
//
    @PostMapping("/actualizarcategoriaprod")
    public String actualizar(@ModelAttribute Categoria_ProdDTO categoria_ProdDTO) {
        cpdao.actualizar(categoria_ProdDTO);
        return "redirect:/listarCategoriaProd";
    }
////
    @GetMapping("/borrarcategoriaprod/{id}")
    public String borrar(@PathVariable String id) {
        cpdao.borrar(id);
        return "redirect:/listarCategoriaProd";
    }
//    
    @GetMapping("/regresarcategoriaprod")
	public String regresar() {
		return "Menu";
	}

}
