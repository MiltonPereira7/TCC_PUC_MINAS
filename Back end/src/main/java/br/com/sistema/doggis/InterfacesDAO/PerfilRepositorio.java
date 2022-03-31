package br.com.sistema.doggis.InterfacesDAO;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sistema.doggis.entidades.Perfil;

public interface PerfilRepositorio extends JpaRepository<Perfil, Long>{

}
