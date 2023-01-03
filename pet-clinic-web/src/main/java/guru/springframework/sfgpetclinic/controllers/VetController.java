package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ihor Sukalin on 04.01.2023
 *
 * @author : Ihor Sukalin
 * date : 04.01.2023
 * project : svg-pet-clinic
 */

@Controller
public class VetController {

    @RequestMapping({"/vets","vets/index", "vets/index.html"})
    public String listVets() {
        return "vets/index";
    }
}
