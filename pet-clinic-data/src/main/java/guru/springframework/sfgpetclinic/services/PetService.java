package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

/**
 * Created by Ihor Sukalin on 27.12.2022
 *
 * @author : Ihor Sukalin
 * date : 27.12.2022
 * project : svg-pet-clinic
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
