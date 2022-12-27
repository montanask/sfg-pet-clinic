package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

/**
 * Created by Sukalin Ihor on 27.12.2022
 *
 * @author : Sukalin Ihor
 * date : 27.12.2022
 * project : svg-pet-clinic
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
