package com.gx;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.intellijthemes.FlatArcOrangeIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatSolarizedDarkIJTheme;

public class Start {
    public static  void  main(String[]  args) {
        FlatSolarizedDarkIJTheme.setup();
        //FlatDarkLaf.setup();
        new GameWin();  //The startup class and the game main body are separated
    }
}
