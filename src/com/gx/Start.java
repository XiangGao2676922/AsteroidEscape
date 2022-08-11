package com.gx;

import com.formdev.flatlaf.FlatDarkLaf;

public class Start {
    public static  void  main(String[]  args) {
        FlatDarkLaf.setup();
        new GameWin();  //The startup class and the game main body are separated
    }
}
