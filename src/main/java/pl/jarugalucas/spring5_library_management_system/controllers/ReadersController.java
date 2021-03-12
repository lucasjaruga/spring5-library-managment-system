package pl.jarugalucas.spring5_library_management_system.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.jarugalucas.spring5_library_management_system.entity.Reader;
import pl.jarugalucas.spring5_library_management_system.services.ReadersService;

@Controller
@RequestMapping("/readers")
public class ReadersController {

    private final ReadersService readersService;

    public ReadersController(ReadersService readersServiceImpl) {
        this.readersService = readersServiceImpl;
    }

    @GetMapping("/newReader")
    public String getAddNewReader(Model model) {

        // create model attribute to bind form data
        model.addAttribute("reader", new Reader());
        return "readerForm";
    }

    @PostMapping("/saveReader")
    public String saveReader(@ModelAttribute("reader") Reader reader){

        readersService.saveOrUpdateReader(reader);
        return "redirect:/library/listOfReaders";
    }

    @GetMapping("/updateReader")
    public String updateReader(@RequestParam("readerId") int id, Model model){

        Reader reader = readersService.getReader(id);
        model.addAttribute("reader", reader);

        return "readerForm";
    }

    @GetMapping("/deleteReader")
    public String deleteReader(@RequestParam("readerId") int id){

        readersService.deleteReader(id);
        return "redirect:/library/listOfReaders";
    }
}