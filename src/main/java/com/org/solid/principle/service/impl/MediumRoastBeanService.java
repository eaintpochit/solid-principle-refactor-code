package com.org.solid.principle.service.impl;

import com.org.solid.principle.service.CoffeeBean;
import org.springframework.stereotype.Component;

@Component("mediumRoast")
public class MediumRoastBeanService extends CoffeeBean {

    @Override
    public void beanCoffee() {
        System.out.println("Bean Coffee Medium Roast");
    }
}
