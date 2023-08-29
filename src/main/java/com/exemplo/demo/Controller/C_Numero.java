package com.exemplo.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class C_Numero {

    @GetMapping("/")
    public String getNumero() {
        return "index";
    }

    @PostMapping("/")
    public String postNumero(@RequestParam("numero") int numero,
                             Model model){

        int resultado = (int) Math.pow(numero,2);
        model.addAttribute("numero", numero);
        model.addAttribute("resultado", resultado);

        return "index";
    }


}
