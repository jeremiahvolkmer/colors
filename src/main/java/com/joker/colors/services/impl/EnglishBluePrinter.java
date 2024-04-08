package com.joker.colors.services.impl;

import com.joker.colors.services.BluePrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishBluePrinter implements BluePrinter {
    public String print() {
        return "Blue";
    }
}
