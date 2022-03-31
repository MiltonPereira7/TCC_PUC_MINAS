package br.com.sistema.doggis.InterfacesDAO;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sistema.doggis.entidades.Servico;

public interface ServicoRepositorio extends JpaRepository<Servico, Long>{
	
}
