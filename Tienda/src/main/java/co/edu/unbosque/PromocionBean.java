package co.edu.unbosque;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import co.edu.unbosque.Modelos.DAO.PromocionesDAO;
import co.edu.unbosque.Modelos.DTO.PromocionesDTO;

@Controller
public class PromocionBean {
	
	@Autowired
	private PromocionesDAO pdao;
	
	   @GetMapping("/listarPromociones")
	    public String listarPromociones(Model modelo) {
	        List<PromocionesDTO> lista = pdao.listar();
	        modelo.addAttribute("listaPromociones", lista);
	        return "listaPromociones";
	    }

	    @GetMapping("/agregarPromocion")
	    public String agregarPromocion(Model modelo) {
	        modelo.addAttribute("promocionesDTO", new PromocionesDTO());
	        return "formularioPromocion";
	    }
	    
	    @PostMapping("/guardarPromocion")
	    public String guardarPromocion(@ModelAttribute PromocionesDTO promocionesDTO) {
	        pdao.guardar(promocionesDTO);
	        return "redirect:/listarPromociones";
	    }
	    
	    @GetMapping("/editarpromocion/{id}")
	    public String editarPromocion(@PathVariable long id, Model modelo) {
	        PromocionesDTO promocionesDTO = pdao.buscarId(id);
	        modelo.addAttribute("promocionesDTO", promocionesDTO);
	        return "formeditarPromocion";
	    }

	    @PostMapping("/actualizarpromocion")
	    public String actualizarPromocion(@ModelAttribute PromocionesDTO promocionesDTO) {
	        pdao.actualizar(promocionesDTO);
	        return "redirect:/listarPromociones";
	    }

	    @GetMapping("/borrarpromocion/{id}")
	    public String borrarPromocion(@PathVariable long id) {
	        pdao.borrar(id);
	        return "redirect:/listarPromociones";
	    }
	    
		@GetMapping("/regresarpromocion")
		public String regresar() {
			return "Menu";
		}

}
