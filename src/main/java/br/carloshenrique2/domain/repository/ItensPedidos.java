package br.carloshenrique2.domain.repository;

import br.carloshenrique2.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItensPedidos extends JpaRepository<ItemPedido, Integer> {

}
