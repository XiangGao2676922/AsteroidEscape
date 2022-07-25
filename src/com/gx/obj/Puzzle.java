package com.gx.obj;

import com.gx.GameWin;

import java.awt.*;

public class Puzzle {

    Image image;

    int x;
    int y;
    int width = 300;
    int height = 300;

    GameWin frame;


    public Puzzle() {
    }

    public Puzzle(Image image, int x, int y, int width, int height, GameWin frame) {
        this.image = image;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.frame = frame;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public GameWin getFrame() {
        return frame;
    }

    public void setFrame(GameWin frame) {
        this.frame = frame;
    }


    public void paintSelf(Graphics g){
        g.drawImage(image,x,y,null);
    }
}
