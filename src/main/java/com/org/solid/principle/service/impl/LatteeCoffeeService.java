package com.org.solid.principle.service.impl;


import com.org.solid.principle.service.CoffeeBrew;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("latte")
public class LatteeCoffeeService extends CoffeeBrew {

    @Override
    public void brewCoffee() {
        System.out.println("latte brew");
    }
}
