package com.joker.colors.services.impl;

import com.joker.colors.services.GreenPrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishGreenPrinter implements GreenPrinter {
    public String print() {
        return "Green";
    }
}
