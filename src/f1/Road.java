/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package f1;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author asmalouski
 */
public class Road extends JPanel implements ActionListener{
    
    Timer mainTimer = new Timer(20, this);
    
    Image img = new ImageIcon("res/road.png").getImage();
    
    Player player = new Player();
    
    public Road(){
        mainTimer.start();
    }
    
    public void paint(Graphics g){
        g = (Graphics2D) g;
        g.drawImage(img, player.layer1, 0, null);
        g.drawImage(player.img, player.x, player.y, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        player.move();
        repaint();
    }
}
