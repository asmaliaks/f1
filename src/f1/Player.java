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
    int speed = 100;
    int acsel = 0;
    int way = 0;
    // coordinates
    int x = 100;
    int y = 160;
    int layer1 = 0;
    int layer2 = 1200;
    
    public void move(){
        // way = way + speed
        way += speed;
        
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
}
