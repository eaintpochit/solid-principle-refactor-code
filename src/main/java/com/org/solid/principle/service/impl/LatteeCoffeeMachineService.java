package com.org.solid.principle.service.impl;


import com.org.solid.principle.service.CoffeeBrew;
import com.org.solid.principle.service.ILatteCoffeeMachineService;
import org.springframework.stereotype.Service;

@Service("latte")
public class LatteeCoffeeMachineService extends CoffeeBrew {

    @Override
    public void brew() {
        System.out.println("latte brew");
    }
}
