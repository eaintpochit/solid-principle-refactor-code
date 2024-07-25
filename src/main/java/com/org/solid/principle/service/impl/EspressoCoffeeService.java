package com.org.solid.principle.service.impl;

import com.org.solid.principle.service.CoffeeBrew;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("espresso")
public class EspressoCoffeeService extends CoffeeBrew {

    @Override
    public void brewCoffee() {
        System.out.println("Espreeso Brew");
    }
}
