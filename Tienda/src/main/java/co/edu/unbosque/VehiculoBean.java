package co.edu.unbosque;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import co.edu.unbosque.Modelos.DAO.VahiculoDAO;
import co.edu.unbosque.Modelos.DTO.VehiculoDTO;
@Controller
public class VehiculoBean {

    @Autowired
    private VahiculoDAO vdao;

    @GetMapping("/listarVehiculos")
    public String listarVehiculos(Model modelo) {
        List<VehiculoDTO> lista = vdao.listar();
        modelo.addAttribute("listaVehiculos", lista);
        return "listarVehiculos";
    }

    @GetMapping("/agregarVehiculos")
    public String agregarVehiculo(Model modelo) {
        modelo.addAttribute("vehiculoDTO", new VehiculoDTO());
        return "formularioVehiculo";
    }

    @PostMapping("/guardarVehiculos")
    public String guardarVehiculo(@ModelAttribute VehiculoDTO vehiculoDTO) {
        vdao.guardar(vehiculoDTO);
        return "redirect:/listarVehiculos";
    }

    @GetMapping("/editarVehiculos/{id}")
    public String editarVehiculo(@PathVariable String id_Vehiculo, Model modelo) {
        VehiculoDTO vehiculoDTO = vdao.buscarId(id_Vehiculo);
        modelo.addAttribute("vehiculoDTO", vehiculoDTO);
        return "formeditar_Vehiculo";
    }

    @PostMapping("/actualizarVehiculos")
    public String actualizarVehiculo(@ModelAttribute VehiculoDTO vehiculoDTO) {
        vdao.actualizar(vehiculoDTO);
        return "redirect:/listarVehiculos";
    }

    @GetMapping("/borrarVehiculos/{id}")
    public String borrarVehiculo(@PathVariable String id_Vehiculo) {
        vdao.borrar(id_Vehiculo);
        return "redirect:/listarVehiculos";
    }

}
