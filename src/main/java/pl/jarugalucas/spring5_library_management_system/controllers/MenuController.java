package pl.jarugalucas.spring5_library_management_system.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.jarugalucas.spring5_library_management_system.services.ReaderService;

@Controller
@RequestMapping("/library")
public class MenuController {

    private final ReaderService readerService;

    public MenuController(ReaderService readerService) {
        this.readerService = readerService;
    }

    @RequestMapping("/menu")
    public String index(){
        return "menu";
    }

    @GetMapping("/listOfBooks")
    public String getListOfBooks(){
        return "books";
    }

    @GetMapping("/listOfReaders")
    public String getListOfReaders(Model model) {

        model.addAttribute("readers", readerService.getReaders());
        return "readersList";
    }
}