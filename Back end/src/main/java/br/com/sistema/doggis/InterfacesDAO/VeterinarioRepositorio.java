package br.com.sistema.doggis.InterfacesDAO;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sistema.doggis.entidades.Veterinario;

public interface VeterinarioRepositorio extends JpaRepository<Veterinario, Long>{

}
