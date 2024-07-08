package com.vishal;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@ConditionalOnProperty(name = "syrup", havingValue = "strawberry")
@Component
public class SyrupImpl1 implements Syrup{
    @Override
    public String getSyrupType() {
        return "Strawberry";
    }
}
