package br.com.exemplo.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.exemplo.portfolio.model.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {

}
