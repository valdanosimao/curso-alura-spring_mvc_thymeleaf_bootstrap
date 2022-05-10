package br.com.alura.mvc.loja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.mvc.loja.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
