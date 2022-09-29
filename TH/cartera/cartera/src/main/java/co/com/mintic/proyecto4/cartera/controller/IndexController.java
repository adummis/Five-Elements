package co.com.mintic.proyecto4.cartera.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(Model model){
        System.out.println(IndexController.class + " - index");
        var mensaje = "hola index";
        model.addAttribute("mensaje",mensaje);
        return "index";

    }

}
