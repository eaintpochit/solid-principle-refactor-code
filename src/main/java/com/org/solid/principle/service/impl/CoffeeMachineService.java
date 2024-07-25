package com.org.solid.principle.service.impl;


import com.org.solid.principle.service.ICoffeeBeanService;
import com.org.solid.principle.service.ICoffeeBrewService;
import com.org.solid.principle.service.ICoffeeMachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoffeeMachineService implements ICoffeeMachineService {

    @Autowired
    ICoffeeBrewService coffeeBrewService;

    @Autowired
    ICoffeeBeanService coffeeBeanService;

    @Override
    public void coffeeBrewMachine(String typeOfCoffee) {

        coffeeBrewService.brewCoffee(typeOfCoffee);
    }

    @Override
    public void coffeeBeanMachine(String typeOfBean) {
        coffeeBeanService.beanCoffee(typeOfBean);
    }
}
