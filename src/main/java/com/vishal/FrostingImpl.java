package com.vishal;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "frostingtype", havingValue = "chocolate")
public class FrostingImpl implements Frosting{

    @Override
    public String getFrostingType() {
        return "Chocolate";
    }
}
