package f1;


import java.awt.Image;
import javax.swing.ImageIcon;

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
    Image img = new ImageIcon("res/Player.png").getImage();
    // car's sparametrs : speed, acseleration, way
    int speed = 10;
    int acsel = 0;
    int way = 0;
    // coordinates
    int x = 100;
    int y = 160;
    int layer1 = 0;
    
    
    public void move(){
        // way = way + speed
        way += speed;
        // layer1 = layer1 - speed
        layer1 -= speed;
    }
}
