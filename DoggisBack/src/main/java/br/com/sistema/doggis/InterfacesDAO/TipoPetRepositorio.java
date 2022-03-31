package br.com.sistema.doggis.InterfacesDAO;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sistema.doggis.entidades.TipoPet;

public interface TipoPetRepositorio extends JpaRepository<TipoPet, Long>{

}
