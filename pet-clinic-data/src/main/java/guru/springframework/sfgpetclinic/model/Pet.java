package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

/**
 * Created by Ihor Sukalin on 23.12.2022
 *
 * @author : Ihor Sukalin
 * date : 23.12.2022
 * project : svg-pet-clinic
 */
public class Pet {

    private PetType type;

    private Owner owner;

    private LocalDate birthDate;

    public PetType getType() {
        return type;
    }

    public void setType(PetType type) {
        this.type = type;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
