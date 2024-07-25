package com.org.solid.principle.controller;

import com.org.solid.principle.service.ICoffeeBrewService;
import com.org.solid.principle.service.ICoffeeMachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coffee")
public class CoffeeMachineController {

    @Autowired
    ICoffeeMachineService coffeeMachineService;

    @PostMapping("/brew/{typeOfCoffee}")
    public void brewCoffee(@PathVariable String typeOfCoffee){

        coffeeMachineService.coffeeBrewMachine(typeOfCoffee);
    }
}
