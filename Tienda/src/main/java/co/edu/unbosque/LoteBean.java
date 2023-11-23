package co.edu.unbosque;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import co.edu.unbosque.Modelos.DAO.LoteDAO;
import co.edu.unbosque.Modelos.DTO.LoteDTO;

@Controller
public class LoteBean {


	    @Autowired
	    private LoteDAO ldao;

	    @GetMapping("/listarlote")
	    public String listaLotes(Model modelo) {
	        List<LoteDTO> lista = ldao.listar();
	        modelo.addAttribute("listaLotes", lista);
	        return "indexlote";
	    }

	    @GetMapping("/agregarlote")
	    public String agregarLote(Model modelo) {
	        modelo.addAttribute("loteDTO", new LoteDTO());
	        return "formulariolote";
	    }

	    @PostMapping("/guardarlote")
	    public String guardarLote(@ModelAttribute LoteDTO loteDTO) {
	        ldao.guardar(loteDTO);
	        return "redirect:/listarlote";
	    }

	    @GetMapping("/editarlote/{id}")
	    public String editarLote(@PathVariable long id, Model modelo) {
	        LoteDTO loteDTO = ldao.buscarId(id);
	        modelo.addAttribute("loteDTO", loteDTO);
	        return "formeditarlote";
	    }

	    @PostMapping("/actualizarlote")
	    public String actualizarLote(@ModelAttribute LoteDTO loteDTO) {
	        ldao.actualizar(loteDTO);
	        return "redirect:/listarlote";
	    }

	    @GetMapping("/borrarlote/{id}")
	    public String borrarLote(@PathVariable long id) {
	        ldao.borrar(id);
	        return "redirect:/listarlote";
	    }
	}
