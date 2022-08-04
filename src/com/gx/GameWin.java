package com.gx;

import com.gx.obj.Puzzle;

import javax.swing.*;
import java.awt.*;


public class GameWin extends JFrame{

    int cnt=0;

    Puzzle[] puzzle = new Puzzle[8];

    JButton left, right, above, below;
    JButton restart = new JButton("Restart");

    void launch(){
        this.setVisible(true);
        this.setSize(900,900);
        this.setLocationRelativeTo(null);
        this.setTitle("Asteroid Escape");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

/*    @Override
    public void paint(Graphics g) {
        g.setColor(Color.CYAN);
        g.fillRect(0,0,900,900);

        g.setColor(Color.black);
        for (int i = 0; i < 3; i++) {
            g.drawLine(0,i*300,900,i*300);
        }
        for (int i = 0; i < 3; i++) {
            g.drawLine(i*300,0,i*300,900);
        }*/
}





