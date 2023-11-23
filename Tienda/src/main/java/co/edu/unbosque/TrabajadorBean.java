package co.edu.unbosque;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import co.edu.unbosque.Modelos.DAO.TrabajadorDAO;
import co.edu.unbosque.Modelos.DTO.TrabajadorDTO;

@Controller
public class TrabajadorBean {

    @Autowired
    private TrabajadorDAO tdao;

    @GetMapping("/listartrabajador")
    public String listarTrabajador(Model modelo) {
        List<TrabajadorDTO> lista = tdao.listar();
        modelo.addAttribute("listaTrabajadores", lista);
        return "indextrabajador";
    }

    @GetMapping("/agregartrabajador")
    public String agregarTrabajador(Model modelo) {
        modelo.addAttribute("trabajadorDTO", new TrabajadorDTO());
        return "formulariotrabajador";
    }

    @PostMapping("/guardartrabajador")
    public String guardarTrabajador(@ModelAttribute TrabajadorDTO trabajadorDTO) {
        tdao.guardar(trabajadorDTO);
        return "redirect:/indextrabajador";
    }

    @GetMapping("/editartrabajador/{id}")
    public String editarTrabajador(@PathVariable long id_Empleado, Model modelo) {
        TrabajadorDTO trabajadorDTO = tdao.buscarId(id_Empleado);
        modelo.addAttribute("trabajadorDTO", trabajadorDTO);
        return "formeditartrabajador";
    }

    @PostMapping("/actualizartrabajador")
    public String actualizarTrabajador(@ModelAttribute TrabajadorDTO trabajadorDTO) {
        tdao.actualizar(trabajadorDTO);
        return "redirect:/indextrabajador";
    }

    @GetMapping("/borrartrabajador/{id}")
    public String borrarTrabajador(@PathVariable long id_Empleado) {
        tdao.borrar(id_Empleado);
        return "redirect:/indextrabajador";
    }

}


