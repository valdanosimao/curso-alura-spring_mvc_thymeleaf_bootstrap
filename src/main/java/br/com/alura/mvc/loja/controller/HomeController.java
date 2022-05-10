package br.com.alura.mvc.loja.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.loja.model.Pedido;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("REDMI NOTE 11 TWILIGHT BLUE 4GB RAM 128GB ROM");
		pedido.setUrlImagem("https://m.media-amazon.com/images/I/71bru4lFzzL._AC_SX679_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/REDMI-NOTE-11-TWILIGHT-128GB"
				+ "/dp/B09QSC4HN9?ref_=Oct_d_obs_d_16243890011&pd_rd_w=tfNcW&pf_rd_p=574d7dde"
				+ "-c8d1-436d-a7fc-f2654a8c3190&pf_rd_r=KVK7ANBDYD5FW0P56JAM&pd_rd_r=271a0050"
				+ "-339f-430d-84da-0368d4d26019&pd_rd_wg=sfMSP&pd_rd_i=B09QSC4HN9");
		pedido.setDescricao("descricao do pedido");
		
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}

}
