/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package f1;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author asmalouski
 */
public class Road extends JPanel{
    Image img = new ImageIcon("res/road.png").getImage();
    
    public void paint(Graphics g){
        g = (Graphics2D) g;
        g.drawImage(img, 0, 0, null);
    }
}
