package br.com.sistema.doggis.InterfacesDAO;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sistema.doggis.entidades.Agendamento;

public interface AgendamentoRepositorio extends JpaRepository<Agendamento, Long> {
	
	
}
