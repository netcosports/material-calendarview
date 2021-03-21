package com.prolificinteractive.materialcalendarview.sample;

import android.app.Application;
import android.graphics.Typeface;

import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;

import com.prolificinteractive.materialcalendarview.font.CalendarFontInterface;
import com.prolificinteractive.materialcalendarview.font.FontDecorator;

public class CalendarSampleApplication extends Application implements CalendarFontInterface {

    private FontDecorator fontDecorator;

    @Override
    public void onCreate() {
        super.onCreate();
        fontDecorator = new FontDecorator(ResourcesCompat.getFont(this, R.font.comic_sans));
    }

    @Nullable
    @Override
    public FontDecorator getFontDecorator() {
        return fontDecorator;
    }
}
