package com.gx.obj;

import com.gx.GameWin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

//This class is used to instantiate every character object in the game.
// Because each puzzle object can actually be regarded as a button of the form.
public class Puzzle extends JButton implements FocusListener {//Implement the FocusListener interface

    //Image image;
    public int id;

    public Puzzle(int id, String s) {
        this.id = id;
        addFocusListener(this); //Add focus event listener
    }

    @Override
    public void focusGained(FocusEvent e) {
        setBackground(Color.RED);// When the button gets focus, the color turns red
    }

    @Override
    public void focusLost(FocusEvent e) {
        setBackground(Color.GRAY);// When the button loses focus, the color changes back to gray
    }
}
