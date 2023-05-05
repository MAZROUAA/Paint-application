

package com.mycompany.mavenproject2;

import javax.swing.JFrame;


public class Mavenproject2 {

    public static void main(String[] args) {
       JFrame f= new JFrame();
         
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        f.setTitle("Paint ");
        
        Mypanel mp=new Mypanel();
       // mp = new Mypanel();
        
        f.setContentPane(mp);
        f.setSize(1000, 500);
        
        f.setVisible(true);
        
    }
}
