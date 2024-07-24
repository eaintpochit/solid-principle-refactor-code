package com.org.solid.principle.service.impl;

import com.org.solid.principle.service.CoffeeBrew;
import org.springframework.stereotype.Service;

@Service("espresso")
public class EspressoCoffeeMachineService  extends CoffeeBrew {

    @Override
    public void brew() {
        System.out.println("Espreeso Brew");
    }
}
