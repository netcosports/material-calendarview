package com.prolificinteractive.materialcalendarview.font;

import android.graphics.Typeface;

public class FontDecorator {

    private Typeface dayFont;
    private Typeface monthFont;
    private Typeface dayWeekFont;

    public FontDecorator(Typeface font) {
        this(font, font, font);
    }

    public FontDecorator(Typeface dayFont, Typeface monthFont, Typeface dayWeekFont) {
        this.dayFont = dayFont;
        this.monthFont = monthFont;
        this.dayWeekFont = dayWeekFont;
    }

    public Typeface getDayFont() {
        return dayFont;
    }

    public Typeface getDayWeekFont() {
        return dayWeekFont;
    }

    public Typeface getMonthFont() {
        return monthFont;
    }
}
