package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import service.CarServiceImpl;

@Controller
public class Cars {
    CarServiceImpl carService = new CarServiceImpl();


    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false, defaultValue = "5") Integer count,
                            ModelMap model) {
        if (count >= 5) {
            model.addAttribute("cars", carService.getCars().subList(0, 5));
        } else {
            model.addAttribute("cars", carService.showCar(count));
        }
        return "Cars";
    }

}