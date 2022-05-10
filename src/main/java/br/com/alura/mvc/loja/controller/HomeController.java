package br.com.alura.mvc.loja.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.loja.model.Pedido;
import br.com.alura.mvc.loja.repository.PedidoRepository;

@Controller
public class HomeController {
	
	private final PedidoRepository pedidoRepository;
	
	public HomeController(PedidoRepository pedidoRepository) {
		this.pedidoRepository = pedidoRepository;
	}

	@GetMapping("/home")
	public String home(Model model) {	
		List<Pedido> pedidos = pedidoRepository.findAll();
		model.addAttribute("pedidos", pedidos);		
		return "home";
	}

}
