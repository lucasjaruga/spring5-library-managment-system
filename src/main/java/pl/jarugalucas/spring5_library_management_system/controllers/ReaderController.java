package pl.jarugalucas.spring5_library_management_system.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.jarugalucas.spring5_library_management_system.entity.Reader;
import pl.jarugalucas.spring5_library_management_system.services.ReaderService;

@Controller
@RequestMapping("/reader")
public class ReaderController {

    private final ReaderService readerService;

    public ReaderController(ReaderService readerServiceImpl) {
        this.readerService = readerServiceImpl;
    }

    @GetMapping("/newReader")
    public String getAddNewReader(Model model) {

        // create model attribute to bind form data
        model.addAttribute("reader", new Reader());
        return "readerForm";
    }

    @PostMapping("/saveReader")
    public String saveReader(@ModelAttribute("reader") Reader reader){

        readerService.saveReader(reader);
        return "redirect:/library/listOfReaders";
    }

    @GetMapping("/updateReader")
    public String updateReader(@RequestParam("reader") Reader reader){


        return "readerForm";
    }
}