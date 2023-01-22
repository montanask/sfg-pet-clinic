package guru.springframework.sfgpetclinic.model;

/**
 * Created by Ihor Sukalin on 22.01.2023
 *
 * @author : Ihor Sukalin
 * date : 22.01.2023
 * project : svg-pet-clinic
 */

public class Speciality extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
