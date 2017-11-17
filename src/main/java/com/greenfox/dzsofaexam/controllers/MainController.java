package com.greenfox.dzsofaexam.controllers;

import com.greenfox.dzsofaexam.services.CarService;
import com.sun.org.apache.xpath.internal.operations.Mod;
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
        model.addAttribute("carlist", carService.getAllCars());
        return "index";
    }

    @GetMapping("/search")
    public String search(@RequestParam(value = "isPolice", required = false) Boolean police, @RequestParam(value = "isDiplomat", required = false) Boolean diplomat, @RequestParam(value = "search", required = false) String search, Model model) {
        model.addAttribute("diplomat", carService.getDiplomat());
        model.addAttribute("police", carService.getPolice());
return "index";
    }

    @GetMapping("/search/{brand}")
    public String searchByBrand(@PathVariable String brand) {
        return "index";
    }
}
