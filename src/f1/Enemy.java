/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package f1;

import java.awt.Image;
import java.awt.Rectangle;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author asmalouski
 */
public class Enemy {
   
    public static final int MAX_TOP = 50;
    public static final int MAX_BOTTOM = 480;
    public static final int MIN_SPEED = 10;
    int x;
    int y;
    int speed;
    Image img = new ImageIcon("res/Enemy.png").getImage();
    Road road;
    
    public Rectangle getRect(){
        return new Rectangle(x, y, 90, 30);
    }
    
    public Enemy(int x, int y, int speed, Road road){
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.road = road;
        
    }
    
    public void move(){
        if(speed <= MIN_SPEED) speed = MIN_SPEED;
        x = x - road.player.speed + speed; 
        if(y <= MAX_TOP)y=MAX_TOP;
        if(y >= MAX_BOTTOM)y=MAX_BOTTOM;
    }
    
}
