package pl.jarugalucas.spring5_library_management_system.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.jarugalucas.spring5_library_management_system.services.BooksService;
import pl.jarugalucas.spring5_library_management_system.services.ReadersService;

@Controller
@RequestMapping("/library")
public class MenuController {

    private final ReadersService readersService;
    private final BooksService booksService;

    public MenuController(ReadersService readersService, BooksService booksService) {
        this.readersService = readersService;
        this.booksService = booksService;
    }

    @RequestMapping("/menu")
    public String index(){
        return "menu";
    }

    @GetMapping("/listOfBooks")
    public String getListOfBooks(Model model){

        model.addAttribute("books", booksService.getBooks());
        return "booksList";
    }

    @GetMapping("/listOfReaders")
    public String getListOfReaders(Model model) {

        model.addAttribute("readers", readersService.getReaders());
        return "readersList";
    }
}