package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

/**
 * Created by Ihor Sukalin on 27.12.2022
 *
 * @author : Ihor Sukalin
 * date : 27.12.2022
 * project : svg-pet-clinic
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
