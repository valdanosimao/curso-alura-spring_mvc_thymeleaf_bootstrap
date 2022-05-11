package br.com.alura.mvc.loja.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.alura.mvc.loja.dto.RequisicaoNovoPedido;
import br.com.alura.mvc.loja.model.Pedido;
import br.com.alura.mvc.loja.repository.PedidoRepository;

@Controller
@RequestMapping("/pedido")
public class PedidoController {
	
	private final PedidoRepository pedidoRepository;
	
	public PedidoController(PedidoRepository pedidoRepository) {
		this.pedidoRepository = pedidoRepository;
	}

	@GetMapping("/formulario")
	public String formulario(RequisicaoNovoPedido requisicao) {
		return "formulario";
	}
	
	@PostMapping("/novo")
	public String novo(@Valid RequisicaoNovoPedido requisicao, BindingResult result) {
		if(result.hasErrors()) {
			return "/formulario";
		} else {
			Pedido pedido = requisicao.toPedido();
			pedidoRepository.save(pedido);
			
			return "/formulario";
		}
		
	}

}
