package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ihor Sukalin on 03.01.2023
 *
 * @author : Ihor Sukalin
 * date : 03.01.2023
 * project : svg-pet-clinic
 */

@Controller
public class IndexController {

    @RequestMapping({"", "/","index", "index.html"})
    public String index() {
        return "index";
    }

    @RequestMapping("/oups")
    public String oupsHandler() {
        return "notimplemented";
    }
}
