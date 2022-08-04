package com.gx;

import com.gx.obj.Puzzle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GameWin extends JFrame implements MouseListener,KeyListener, ActionListener {

    int cnt=0;

    Puzzle[] puzzle = new Puzzle[8];

    JButton left, right, above, below;

    JButton restart = new JButton("Restart");

    JButton about=new JButton("About");

    JButton help=new JButton("Help");

    JButton mouse=new JButton("Mouse");

    JButton key=new JButton("Keyboard");

    JButton message=new JButton("Step："+cnt);

    JButton begin=new JButton("Start");

    JButton star=new JButton();


    public GameWin(){
        launch();
        setBounds(200,200,640,800);
        validate();

    }


    void launch(){
        setLayout(null);

        add(restart);
        restart.addActionListener(this);
        restart.setBounds(120, 640, 100, 50);


        add(about);
        about.addActionListener(this);
        about.setBounds(250,640,100,50);


        add(mouse);
        mouse.setBounds(280,40,100,50);
        mouse.addActionListener(this);


        add(key);
        key.setBounds(400, 40, 100, 50);
        key.addActionListener(this);


        add(help);
        help.setBounds(380, 640, 100, 50);
        help.addActionListener(this);


        add(message);
        message.setBounds(110,40,160,50);
        ImageIcon starr=new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\AsteroidEscape\\imgs\\fm.jpg");//导入图片
        star.setIcon(starr);
        star.setBounds(108,208,400,400);
        add(star);


        add(begin);
        begin.addActionListener(this);
        begin.setBounds(250,140,100,50);
        setVisible(true);



        left=new JButton();
        right=new JButton();
        above=new JButton();
        below=new JButton();
        add(left);
        add(right);
        add(above);
        add(below);

        left.setBounds(98, 98, 10, 520);
        right.setBounds(508,98,10,520);
        above.setBounds(98, 98, 420, 10);
        below.setBounds(98, 608, 420, 10);

        setVisible(true);


        setLocationRelativeTo(null);
        setTitle("Asteroid Escape");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

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





