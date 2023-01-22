package guru.springframework.sfgpetclinic.model;

import java.util.Set;

/**
 * Created by Ihor Sukalin on 27.12.2022
 *
 * @author : Ihor Sukalin
 * date : 27.12.2022
 * project : svg-pet-clinic
 */
public class Vet extends Person{

    private Set<Speciality> specialities;

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
