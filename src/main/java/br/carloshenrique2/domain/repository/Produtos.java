package br.carloshenrique2.domain.repository;

import br.carloshenrique2.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto, Integer> {

}
