package com.joker.colors.services.impl;

import com.joker.colors.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishRedPrinter implements RedPrinter {
    public String print() {
        return "Red";
    }
}
