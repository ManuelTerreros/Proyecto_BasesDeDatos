package co.edu.unbosque;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import co.edu.unbosque.Modelos.DAO.ClienteDAO;
import co.edu.unbosque.Modelos.DTO.ClienteDTO;

@Controller
public class ClienteBean {
	
	@Autowired
	private ClienteDAO cldao;

	@GetMapping("/listar")
	public String listar(Model modelo) {
		List<ClienteDTO> lista = cldao.Listar();
		modelo.addAttribute("listaclientes", lista);
		return "index1";
	}
	
	@GetMapping("/agregarboton")
	public String agregarboton(Model modelo) {
		modelo.addAttribute("clienteDTO", new ClienteDTO());
		return "formulariocliente";
	}
	
	@PostMapping("/guardar")
	public String guardar(@ModelAttribute ClienteDTO clienteDTO) {
		cldao.guardarCliente(clienteDTO);
		return "redirect:/listar";
	}
}
