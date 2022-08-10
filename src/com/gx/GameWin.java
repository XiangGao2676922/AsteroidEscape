package com.gx;

import com.gx.obj.Puzzle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GameWin extends JFrame implements MouseListener,KeyListener, ActionListener {

    int cnt=0;

    Puzzle[] puzzle = new Puzzle[8];

    String name[]={"spaceship","a_bl","a_blb","a_dd","a_dl","a_lb","a_lt","a_ltb"};

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


    public void launch(){
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
        star.setBounds(108,108,400,400);
        add(star);


        add(begin);
        begin.addActionListener(this);
        begin.setBounds(250,578,100,50);
        setVisible(true);



        left=new JButton();
        right=new JButton();
        above=new JButton();
        below=new JButton();
        add(left);
        add(right);
        add(above);
        add(below);

        left.setBounds(98, 98, 10, 420);
        right.setBounds(508,98,10,420);
        above.setBounds(98, 98, 420, 10);
        below.setBounds(98, 508, 420, 10);

        setVisible(true);


        setLocationRelativeTo(null);
        setTitle("Asteroid Escape");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public void map(){
        for(int k=0;k<name.length;k++)
        {
            puzzle[k]=new Puzzle(k,name[k]);
            add(puzzle[k]);
        }


        puzzle[0].setBounds(241,108,133,133);
        ImageIcon spaceship=new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\AsteroidEscape\\imgs\\spaceship.jpg");
        puzzle[0].setIcon(spaceship);

        puzzle[1].setBounds(241,241,133,133);
        ImageIcon a_bl=new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\AsteroidEscape\\imgs\\a_bl.jpg");
        puzzle[1].setIcon(a_bl);

        puzzle[2].setBounds(108,241,133,133);
        ImageIcon a_blb=new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\AsteroidEscape\\imgs\\a_blb.jpg");
        puzzle[2].setIcon(a_blb);

        puzzle[3].setBounds(374,241,133,133);
        ImageIcon a_dd=new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\AsteroidEscape\\imgs\\a_dd.jpg");
        puzzle[3].setIcon(a_dd);

        puzzle[4].setBounds(108,108,133,133);
        ImageIcon a_dl=new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\AsteroidEscape\\imgs\\a_dl.jpg");
        puzzle[4].setIcon(a_dl);

        puzzle[5].setBounds(374,108,133,133);
        ImageIcon a_lb=new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\AsteroidEscape\\imgs\\a_lb.png");
        puzzle[5].setIcon(a_lb);

        puzzle[6].setBounds(108,374,133,133);
        ImageIcon a_lt=new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\AsteroidEscape\\imgs\\a_lt.jpg");
        puzzle[6].setIcon(a_lt);

        puzzle[7].setBounds(374,374,133,133);
        ImageIcon a_ltb=new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\AsteroidEscape\\imgs\\a_ltb.jpg");
        puzzle[7].setIcon(a_ltb);

    }

    public void win(){
        JOptionPane.showMessageDialog(this, "WIN！\n" +cnt+"step.");
    }

    public void movek(Puzzle p,JButton direction){
        cnt++;
        message.setText("Step："+cnt);
        boolean move=true;
        Rectangle pRect=p.getBounds();
        int x=p.getBounds().x;
        int y=p.getBounds().y;
        if(direction==below)
            y=y+100;
        else if(direction==above)
            y=y-100;
        else if(direction==left)
            x=x-100;
        else if(direction==right)
            x=x+100;
        pRect.setLocation(x,y);
        Rectangle directionRect=direction.getBounds();
        for(int k=0;k<10;k++){
            Rectangle personRect=puzzle[k].getBounds();
            if((pRect.intersects(personRect))&&(p.id!=k)){

                for(Puzzle p2:puzzle){
                    if(movec(p2,direction)==true){
                        return;
                    }
                }
                move=false;
            }
        }
        if(pRect.intersects(directionRect)){
            for(Puzzle p2:puzzle){
                if(movec(p2,direction)==true){
                    return;
                }
            }
            move=false;
        }
        if(move==true)
        {
            p.setLocation(x,y);
        }
        int cx,cy;
        cx=puzzle[0].getBounds().x;
        cy=puzzle[0].getBounds().y;
        if(cx==208&&cy==208)
        {
            win();
            return ;

        }

    }

    public void movem(){

    }

    public boolean movec(Puzzle p,JButton direction){
        boolean move=true;
        Rectangle pRect=p.getBounds();
        int x=p.getBounds().x;
        int y=p.getBounds().y;
        if(direction==below)
            y=y+100;
        else if(direction==above)
            y=y-100;
        else if(direction==left)
            x=x-100;
        else if(direction==right)
            x=x+100;
        pRect.setLocation(x,y);
        Rectangle directionRect=direction.getBounds();
        for(int k=0;k<10;k++){
            Rectangle personRect=puzzle[k].getBounds();
            if((pRect.intersects(personRect))&&(p.id!=k))
                move=false;
        }
        if(pRect.intersects(directionRect))
            move=false;

        if(move==true)
            p.setLocation(x,y);

        return move;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton b=(JButton)e.getSource();
        if(b==restart)
        {
            dispose();
            new GameWin();
        }
        if(b==about)
        {

        }
        if(b==help)
        {

        }
        if(b==key)
        {
            b.setBackground(Color.green);
            for(int k=0;k<name.length;k++)
            {
                puzzle[k].addKeyListener(this);
            }
            puzzle[7].requestFocus();
        }
        if(b==mouse)
        {

        }
        if(b==begin)
        {
            b.setBackground(Color.yellow);
            this.remove(begin);
            this.remove(star);
            map();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        Puzzle p=(Puzzle) e.getSource();
        if(e.getKeyCode()==KeyEvent.VK_DOWN)
            movek(p,below);
        if(e.getKeyCode()==KeyEvent.VK_UP)
            movek(p,above);
        if(e.getKeyCode()==KeyEvent.VK_LEFT)
            movek(p,left);
        if(e.getKeyCode()==KeyEvent.VK_RIGHT)
            movek(p,right);
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





