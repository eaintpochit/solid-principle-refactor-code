package com.org.solid.principle.service.impl;

import com.org.solid.principle.service.CoffeeBrew;
import com.org.solid.principle.service.ICoffeeBrewService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CoffeeBrewService implements ICoffeeBrewService {


    public final Map<String, CoffeeBrew> coffeeBrewMap;

    public CoffeeBrewService(Map<String, CoffeeBrew> coffeeBrewMap) {
        this.coffeeBrewMap = coffeeBrewMap;

    }

    @Override
    public void brewCoffee(String typeOfCoffee) {
        //polymorphism
        //liskov substitution principle
        CoffeeBrew coffeeBrew = coffeeBrewMap.get(typeOfCoffee);
        if(coffeeBrew!=null){
            //ocp
           coffeeBrew.brewCoffee();
        }
    }

}
