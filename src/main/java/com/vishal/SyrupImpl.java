package com.vishal;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "syrup", havingValue = "chocolate")
public class SyrupImpl implements Syrup{
    @Override
    public String getSyrupType() {
        return "Chocolate";
    }
}
