package br.com.livraria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import br.com.livraria.modelo.Autor;

public interface AutorDAO extends JpaRepository<Autor, Integer>{

}
