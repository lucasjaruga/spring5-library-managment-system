package pl.jarugalucas.spring5_library_management_system.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/library")
public class MenuController {

    @RequestMapping("/menu")
    public String index(){
        return "menu";
    }

    @GetMapping("/listOfBooks")
    public String getListOfBooks(Model model){

        return "books";
    }

    @GetMapping("/listOfReaders")
    public String getListOfReaders(Model model) {

        return "readers";
    }
}