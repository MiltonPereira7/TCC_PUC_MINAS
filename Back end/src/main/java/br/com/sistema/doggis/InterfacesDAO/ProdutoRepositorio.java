package br.com.sistema.doggis.InterfacesDAO;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sistema.doggis.entidades.Produto;

public interface ProdutoRepositorio extends JpaRepository<Produto, Long>{

}
