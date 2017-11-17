package com.greenfox.dzsofaexam.controllers;

import com.greenfox.dzsofaexam.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {

    @Autowired
    CarService carService;

    @GetMapping({"/", ""})
    public String getList(Model model) {
        model.addAttribute("carList", carService.getAllCars());
        return "index";
    }

    @GetMapping("/search")
    public String search(@RequestParam(value = "police", required = false) Boolean police, @RequestParam(value = "diplomat", required = false) Boolean diplomat, @RequestParam(value = "q", required = false) String q, Model model) {
        if (diplomat) {
            carService.getDiplomat();
        }
        if (police) {
            carService.getPolice();
        }
        return "index";
    }

    @GetMapping("/search/{brand}")
    public String searchByBrand(@PathVariable String brand, Model model) {
        carService.getCarsByBrand(brand);
        return "index";
    }
}
