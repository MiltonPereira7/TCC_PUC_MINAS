package br.com.sistema.doggis.InterfacesDAO;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sistema.doggis.entidades.Pet;

public interface PetRepositorio extends JpaRepository<Pet, Long>{

}
