package pl.jarugalucas.spring5_library_management_system.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/library")
public class IndexController {

    @RequestMapping("/menu")
    public String index(Model model){
        return "menu";
    }
}