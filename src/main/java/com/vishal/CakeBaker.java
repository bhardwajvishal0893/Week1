package com.vishal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class CakeBaker {

    @Autowired
    private Frosting frosting;

    @Autowired
    private Syrup syrup;
    public void bakeCake()
    {
        System.out.println("The frosting is : "+frosting.getFrostingType()+" the syrup type is : "+syrup.getSyrupType());
    }

}
