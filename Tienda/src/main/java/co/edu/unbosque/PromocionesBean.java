package co.edu.unbosque;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import co.edu.unbosque.Modelos.DAO.PromocionesDAO;
import co.edu.unbosque.Modelos.DTO.PromocionesDTO;

public class PromocionesBean {
	
	    @Autowired
	    private PromocionesDAO pdao;

	    @GetMapping()
	    public String listarPromociones(Model modelo) {
	        List<PromocionesDTO> lista = pdao.listar();
	        modelo.addAttribute("listaPromociones", lista);
	        return "";
	    }

	    @GetMapping()
	    public String agregarPromocion(Model modelo) {
	        modelo.addAttribute("promocionesDTO", new PromocionesDTO());
	        return "";
	    }

	    @PostMapping()
	    public String guardarPromocion(@ModelAttribute PromocionesDTO promocionesDTO) {
	        pdao.guardar(promocionesDTO);
	        return "";
	    }

	    @GetMapping()
	    public String editarPromocion(@PathVariable long id_Promocion, Model modelo) {
	        PromocionesDTO promocionesDTO = pdao.buscarId(id_Promocion);
	        modelo.addAttribute("promocionesDTO", promocionesDTO);
	        return "";
	    }

	    @PostMapping()
	    public String actualizarPromocion(@ModelAttribute PromocionesDTO promocionesDTO) {
	        pdao.actualizar(promocionesDTO);
	        return "";
	    }

	    @GetMapping()
	    public String borrarPromocion(@PathVariable long id_Promocion) {
	        pdao.borrar(id_Promocion);
	        return "";
	    }

	}

