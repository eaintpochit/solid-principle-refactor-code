package com.org.solid.principle.service.impl;

import com.org.solid.principle.service.CoffeeBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("darkRoast")
public class DarkRoastBeanService extends CoffeeBean {

    @Override
    public void beanCoffee() {
        System.out.println("Bean Coffee Dark Roast");
    }
}
