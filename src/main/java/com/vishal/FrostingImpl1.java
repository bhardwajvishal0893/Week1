package com.vishal;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@ConditionalOnProperty(name = "frostingtype", havingValue = "strawberry")
@Component
public class FrostingImpl1 implements Frosting{
    @Override
    public String getFrostingType() {
        return "Strawberry";
    }
}
