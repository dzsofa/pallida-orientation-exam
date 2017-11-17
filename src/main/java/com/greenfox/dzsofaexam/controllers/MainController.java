package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import service.CarService;

@Controller
public class MainController {

    @Autowired
    CarService carService;

    @GetMapping("/")
    public String getList(Model model) {
        model.addAttribute("carlist", carService.getAllCars());
        return "index";
    }
}
