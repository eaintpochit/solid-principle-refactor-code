package com.org.solid.principle.service.impl;

import com.org.solid.principle.service.CoffeeBean;
import com.org.solid.principle.service.ICoffeeBeanService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CoffeeBeanService implements ICoffeeBeanService {

    public final Map<String, CoffeeBean> coffeeBeanMap;

    public CoffeeBeanService(Map<String, CoffeeBean> coffeeBeanMap) {
        this.coffeeBeanMap = coffeeBeanMap;
    }

    @Override
    public void beanCoffee(String typeOfBean) {
        CoffeeBean coffeeBean = coffeeBeanMap.get(typeOfBean);
        if(coffeeBean!=null){
            coffeeBean.beanCoffee();
        }

    }
}
