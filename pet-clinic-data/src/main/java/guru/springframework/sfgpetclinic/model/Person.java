package guru.springframework.sfgpetclinic.model;

/**
 * Created by Ihor Sukalin on 27.12.2022
 *
 * @author : Ihor Sukalin
 * date : 27.12.2022
 * project : svg-pet-clinic
 */
public class Person extends BaseEntity {

    private String firstName;

    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
