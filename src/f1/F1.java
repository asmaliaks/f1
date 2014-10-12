/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package f1;


import javax.swing.*;
/**
 *
 * @author asmalouski
 */
public class F1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame j = new JFrame("Java F1");
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(1100, 610);
        // before makeing the frame visible we have to add the image to it
        j.add(new Road());
        //make the frame visible
        j.setVisible(true);

    }
    
}
