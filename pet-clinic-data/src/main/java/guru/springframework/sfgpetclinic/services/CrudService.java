package guru.springframework.sfgpetclinic.services;

import java.util.Set;

/**
 * Created by Ihor Sukalin on 03.01.2023
 *
 * @author : Ihor Sukalin
 * date : 03.01.2023
 * project : svg-pet-clinic
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
