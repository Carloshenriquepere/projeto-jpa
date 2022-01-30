package br.carloshenrique2.domain.repository;

import br.carloshenrique2.domain.entity.Cliente;
import br.carloshenrique2.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Pedidos extends JpaRepository<Pedido, Integer> {
    List<Pedido> findByCliente(Cliente cliente);
}
