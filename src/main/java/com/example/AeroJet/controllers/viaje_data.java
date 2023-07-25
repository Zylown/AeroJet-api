package com.example.AeroJet.controllers;

import com.example.AeroJet.models.Compra;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class viaje_data {

@GetMapping("/paquete/Comprar")
public String showCompraForm(Model model) {
    model.addAttribute("compra", new Compra());
    return "compraForm";
}

@PostMapping("/paquete/Comprar")
public String saveCompra(@ModelAttribute Compra compra, Model model) {
    // Aquí guardarías el objeto compra en tu base de datos.
    model.addAttribute("compra", compra);
    return "resultadoCompra";  // Una vista para mostrar la compra realizada.
}
}
