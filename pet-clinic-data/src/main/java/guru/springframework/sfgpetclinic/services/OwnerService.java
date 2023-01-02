package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

/**
 * Created by Ihor Sukalin on 27.12.2022
 *
 * @author : Ihor Sukalin
 * date : 27.12.2022
 * project : svg-pet-clinic
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
