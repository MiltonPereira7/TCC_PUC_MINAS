package br.com.sistema.doggis.InterfacesDAO;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sistema.doggis.entidades.Endereco;

public interface EnderecoRepositorio extends JpaRepository<Endereco, Long>{

}
