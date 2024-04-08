package com.joker.colors.services.impl;

import com.joker.colors.services.BluePrinter;
import org.springframework.stereotype.Component;

@Component
public class SpanishBluePrinter implements BluePrinter {
    @Override
    public String print() {
        return "Azul";
    }
}
