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

    JButton easy=new JButton("easy");

    JButton medium=new JButton("medium");

    JButton difficult=new JButton("difficult");

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
        ImageIcon starr=new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\AsteroidEscape\\imgs\\fm.jpg");
        star.setIcon(starr);
        star.setBounds(108,108,400,400);
        add(star);


        add(easy);
        easy.addActionListener(this);
        easy.setBounds(120,578,100,50);
        setVisible(true);

        add(medium);
        medium.addActionListener(this);
        medium.setBounds(250,578,100,50);
        setVisible(true);

        add(difficult);
        difficult.addActionListener(this);
        difficult.setBounds(380,578,100,50);
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

        puzzle[1].setBounds(108,374,133,133);
        ImageIcon a_bl=new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\AsteroidEscape\\imgs\\a_bl.jpg");
        puzzle[1].setIcon(a_bl);

        puzzle[2].setBounds(241,374,133,133);
        ImageIcon a_blb=new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\AsteroidEscape\\imgs\\a_blb.jpg");
        puzzle[2].setIcon(a_blb);

        puzzle[3].setBounds(108,241,133,133);
        ImageIcon a_dd=new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\AsteroidEscape\\imgs\\a_dd.jpg");
        puzzle[3].setIcon(a_dd);

        puzzle[4].setBounds(241,241,133,133);
        ImageIcon a_dl=new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\AsteroidEscape\\imgs\\a_dl.jpg");
        puzzle[4].setIcon(a_dl);

        puzzle[5].setBounds(374,374,133,133);
        ImageIcon a_lb=new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\AsteroidEscape\\imgs\\a_lb.png");
        puzzle[5].setIcon(a_lb);

        puzzle[6].setBounds(108,108,133,133);
        ImageIcon a_lt=new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\AsteroidEscape\\imgs\\a_lt.jpg");
        puzzle[6].setIcon(a_lt);

        puzzle[7].setBounds(374,241,133,133);
        ImageIcon a_ltb=new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\AsteroidEscape\\imgs\\a_ltb.jpg");
        puzzle[7].setIcon(a_ltb);

    }

    public void map2(){

        for(int k=0;k<name.length;k++)
        {
            puzzle[k]=new Puzzle(k,name[k]);
            add(puzzle[k]);
        }


        puzzle[0].setBounds(241,241,133,133);
        ImageIcon spaceship=new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\AsteroidEscape\\imgs\\spaceship.jpg");
        puzzle[0].setIcon(spaceship);

        puzzle[1].setBounds(108,108,133,133);
        ImageIcon a_bl=new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\AsteroidEscape\\imgs\\ma_bl.jpg");
        puzzle[1].setIcon(a_bl);

        puzzle[2].setBounds(374,108,133,133);
        ImageIcon a_blb=new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\AsteroidEscape\\imgs\\ma_blb.jpg");
        puzzle[2].setIcon(a_blb);

        puzzle[3].setBounds(241,108,133,133);
        ImageIcon a_dd=new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\AsteroidEscape\\imgs\\ma_dd.jpg");
        puzzle[3].setIcon(a_dd);

        puzzle[4].setBounds(374,241,133,133);
        ImageIcon a_dl=new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\AsteroidEscape\\imgs\\ma_dl.jpg");
        puzzle[4].setIcon(a_dl);

        puzzle[5].setBounds(374,374,133,133);
        ImageIcon a_lb=new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\AsteroidEscape\\imgs\\ma_lb.png");
        puzzle[5].setIcon(a_lb);

        puzzle[6].setBounds(108,374,133,133);
        ImageIcon a_lt=new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\AsteroidEscape\\imgs\\ma_lt.jpg");
        puzzle[6].setIcon(a_lt);

        puzzle[7].setBounds(108,241,133,133);
        ImageIcon a_ltb=new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\AsteroidEscape\\imgs\\ma_ltb.jpg");
        puzzle[7].setIcon(a_ltb);

    }

    public void map3(){

        for(int k=0;k<name.length;k++)
        {
            puzzle[k]=new Puzzle(k,name[k]);
            add(puzzle[k]);
        }


        puzzle[0].setBounds(374,241,133,133);
        ImageIcon spaceship=new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\AsteroidEscape\\imgs\\spaceship.jpg");
        puzzle[0].setIcon(spaceship);

        puzzle[1].setBounds(241,374,133,133);
        ImageIcon a_bl=new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\AsteroidEscape\\imgs\\da_bl.jpg");
        puzzle[1].setIcon(a_bl);

        puzzle[2].setBounds(374,374,133,133);
        ImageIcon a_blb=new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\AsteroidEscape\\imgs\\da_blb.jpg");
        puzzle[2].setIcon(a_blb);

        puzzle[3].setBounds(108,108,133,133);
        ImageIcon a_dd=new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\AsteroidEscape\\imgs\\da_dd.jpg");
        puzzle[3].setIcon(a_dd);

        puzzle[4].setBounds(108,241,133,133);
        ImageIcon a_dl=new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\AsteroidEscape\\imgs\\da_dl.jpg");
        puzzle[4].setIcon(a_dl);

        puzzle[5].setBounds(108,374,133,133);
        ImageIcon a_lb=new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\AsteroidEscape\\imgs\\da_lb.png");
        puzzle[5].setIcon(a_lb);

        puzzle[6].setBounds(241,108,133,133);
        ImageIcon a_lt=new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\AsteroidEscape\\imgs\\da_lt.jpg");
        puzzle[6].setIcon(a_lt);

        puzzle[7].setBounds(241,241,133,133);
        ImageIcon a_ltb=new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\AsteroidEscape\\imgs\\da_ltb.jpg");
        puzzle[7].setIcon(a_ltb);

    }

    public void win(){
        JOptionPane.showMessageDialog(this, "You Win！\n" +cnt+" steps.");
        for(int k=0;k<name.length;k++)
            this.remove(puzzle[k]);
    }

    public void movek(Puzzle p,JButton direction){
        cnt++;
        message.setText("Step："+cnt);
        boolean move=true;
        Rectangle pRect=p.getBounds();
        int x=p.getBounds().x;
        int y=p.getBounds().y;
        if(direction==below)
            y=y+133;
        else if(direction==above)
            y=y-133;
        else if(direction==left)
            x=x-133;
        else if(direction==right)
            x=x+133;
        pRect.setLocation(x,y);
        Rectangle directionRect=direction.getBounds();
        for(int k=0;k<8;k++){
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
        if(cx==241&&cy==374)
        {
            win();
            return ;

        }

    }

    public void movem(Puzzle p,JButton direction){
        cnt++;
        message.setText("Step："+cnt);
        boolean move=true;
        Rectangle pRect=p.getBounds();
        int x=p.getBounds().x;
        int y=p.getBounds().y;
        if(direction==below)
            y=y+133;
        else if(direction==above)
            y=y-133;
        else if(direction==left)
            x=x-133;
        else if(direction==right)
            x=x+133;
        pRect.setLocation(x,y);
        Rectangle directionRect=direction.getBounds();
        for(int k=0;k<8;k++){
            Rectangle personRect=puzzle[k].getBounds();
            if((pRect.intersects(personRect))&&(p.id!=k))
                move=false;
        }
        if(pRect.intersects(directionRect))
            move=false;
        if(move==true)
            p.setLocation(x,y);
        int cx,cy;
        cx=puzzle[0].getBounds().x;
        cy=puzzle[0].getBounds().y;
        if(cx==241&&cy==374)
        {
            win();
            return ;
        }
    }

    public boolean movec(Puzzle p,JButton direction){
        boolean move=true;
        Rectangle pRect=p.getBounds();
        int x=p.getBounds().x;
        int y=p.getBounds().y;
        if(direction==below)
            y=y+133;
        else if(direction==above)
            y=y-133;
        else if(direction==left)
            x=x-133;
        else if(direction==right)
            x=x+133;
        pRect.setLocation(x,y);
        Rectangle directionRect=direction.getBounds();
        for(int k=0;k<18;k++){
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
            JOptionPane.showMessageDialog(this, "The object of Asteroid Escape is to navigate your spaceship through the asteroid field and reach the exit.\n"
                    + "Select a challenge. Place the 8 puzzle pieces on the game board as indicated. Pay attention to the exact orientation of each puzzle piece!, one by one:\n"
                            + "· All puzzle pieces must remain horizontal on the game board! Tilting or lifting up pieces is not allowed.\n"+"·Sometimes asteroids will overlap empty parts of other puzzle pieces or the border of the game board. But asteroids can never overlap other asteroids!\n"
                            +"· The spaceship can also overlap empty parts of puzzle pieces and the border. But the spaceship can never overlap asteroids.\n"+"· Only the spaceship can slide off the game board.\n"
                            + "You have found a solution when you can slide the spaceship through the opening of the game board. The shortest solution is shown at the end of the challenge booklet,\n"
                    );
        }
        if(b==help)
        {
            JOptionPane.showMessageDialog(this,"easy:ship→,↑,→,→,↑,→,↑,↑,←,↑,←,←,ship↓,ship←,ship↓ \n"+"medium:←,ship↓,→,→,↑,↑,←,←,ship↓,→,↑,ship←,ship↓ \n"+"difficult:ship↑,↑,→,→,↓,←,↑,→,↓,↓,←,ship←,↑,→,→,↓,ship←,←,↑,↑,→,↓,→,ship↓,←,←,↑,→,ship→,↑,←,←,↓,ship→,↑,←,ship↓,→,→,↑,←,ship←,ship↓ \n");

        }
        if(b==key)
        {
            b.setBackground(Color.GRAY);
            for(int k=0;k<name.length;k++)
            {
                puzzle[k].addKeyListener(this);
            }
            puzzle[7].requestFocus();
        }
        if(b==mouse)
        {
            b.setBackground(Color.GRAY);
            for(int k=0;k<name.length;k++)
                puzzle[k].addMouseListener(this);
        }
        if(b==easy)
        {
            b.setBackground(Color.yellow);
            this.remove(easy);
            this.remove(star);
            map();
        }
        if(b==medium)
        {
            b.setBackground(Color.yellow);
            this.remove(medium);
            this.remove(star);
            map2();
        }
        if(b==difficult)
        {
            b.setBackground(Color.yellow);
            this.remove(difficult);
            this.remove(star);
            map3();
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
        Puzzle p=(Puzzle) e.getSource();
        int x=-1,y=-1;
        x=e.getX();
        y=e.getY();
        int w=p.getBounds().width;
        int h=p.getBounds().height;
        if(y>h/2&&x>w/3&&x<(w*2)/3)
        {
            movem(p,below);//下面
        }
        if(y<h/2&&x>w/3&&x<(w*2)/3)
        {
            movem(p,above);//上面
        }
        if(x<w/2&&y>h/3&&y<(h*2)/3)
        {
            movem(p,left);//左
        }
        if(x>w/2&&y>h/3&&y<(h*2)/3)
        {
            movem(p,right);//右
        }
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





