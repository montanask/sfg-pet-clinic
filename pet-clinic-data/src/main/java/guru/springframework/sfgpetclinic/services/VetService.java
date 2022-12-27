package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * Created by Sukalin Ihor on 27.12.2022
 *
 * @author : Sukalin Ihor
 * date : 27.12.2022
 * project : svg-pet-clinic
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
