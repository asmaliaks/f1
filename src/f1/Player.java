package f1;


import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asmalouski
 */
public class Player {
    
    public static final int MAX_SPEED = 50;
    public static final int MAX_TOP = 50;
    public static final int MAX_BOTTOM = 480;
    
    Image img = new ImageIcon("res/Player.png").getImage();
    // car's sparametrs : speed, acseleration, way
    int speed = 0;
    int acsel = 0;
    int way = 0;
    // coordinates
    int x = 100;
    int y = 160;
    int dy = 0;
    int layer1 = 0;
    int layer2 = 1200;
    
    public void move(){
        // way = way + speed
        way += speed;
        // change speed
        speed += acsel;
        if(speed <= 0) speed = 0;
        if(speed >= MAX_SPEED) speed = MAX_SPEED;
//        // change coardinations  y
        y -= dy;
        if(y <= MAX_TOP)y = MAX_TOP;
        if(y >= MAX_BOTTOM)y = MAX_BOTTOM;
        
        
        if(layer2 - speed <= 0){
            layer1= 0;
            layer2 = 1200;
        }else{
           // layer1 = layer1 - speed
           layer1 -= speed;
           //layer2 = layer2 - speed 
           layer2 -= speed;
        }
    }
    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_RIGHT){
            acsel = 1;
        }
        if(key == KeyEvent.VK_LEFT){
            acsel = -3;
        }
        if(key == KeyEvent.VK_UP && speed != 0){
            dy = 5;
        }
        if(key == KeyEvent.VK_DOWN && speed != 0){
            dy = -5;
        }
    }
    
    public void keyReleased(KeyEvent e){
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_LEFT){
           acsel = 0;

        }
        if(key == KeyEvent.VK_UP || key == KeyEvent.VK_DOWN){
            dy = 0;
        }
    }
}
