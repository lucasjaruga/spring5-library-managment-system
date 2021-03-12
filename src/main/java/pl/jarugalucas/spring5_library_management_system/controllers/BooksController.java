package pl.jarugalucas.spring5_library_management_system.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.jarugalucas.spring5_library_management_system.entity.Book;
import pl.jarugalucas.spring5_library_management_system.services.BooksService;

@Controller
@RequestMapping("/books")
public class BooksController {

    private final BooksService booksService;

    public BooksController(BooksService booksService) {
        this.booksService = booksService;
    }

    @GetMapping("/addNewBook")
    public String addNewBook(Model model) {

        model.addAttribute("book", new Book());
        return "bookForm";
    }

    @PostMapping("/saveBook")
    public String saveBook(@ModelAttribute("book") Book book){

        booksService.saveOrUpdateBook(book);
        return "redirect:/library/listOfBooks";
    }

    @GetMapping("/updateBook")
    public String updateBook(@RequestParam("bookId") int id, Model model){

        Book book = booksService.getBook(id);
        model.addAttribute("book", book);
        return "bookForm";
    }

    @GetMapping("deleteBook")
    public String deleteBook(@RequestParam("bookId") int id){

        booksService.deleteBook(id);
        return "redirect:/library/listOfBooks";
    }
}