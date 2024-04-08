package com.joker.colors.services.impl;

import com.joker.colors.services.BluePrinter;
import com.joker.colors.services.ColorPrinter;
import com.joker.colors.services.GreenPrinter;
import com.joker.colors.services.RedPrinter;

public class ColorPrinterImpl implements ColorPrinter {
    private RedPrinter redPrinter;
    private BluePrinter bluePrinter;
    private GreenPrinter greenPrinter;

    public ColorPrinterImpl(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter) {
        this.redPrinter = redPrinter;
        this.bluePrinter = bluePrinter;
        this.greenPrinter = greenPrinter;
    }

    public String print() {
        return String.join(",", redPrinter.print(), bluePrinter.print(), greenPrinter.print());
    }


}
