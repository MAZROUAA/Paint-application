
package com.mycompany.mavenproject2;

import com.sun.java.accessibility.util.AWTEventMonitor;
import java.awt.Color;
import static java.awt.Color.cyan;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import static java.lang.Math.abs;
import java.util.Vector;
import javax.smartcardio.Card;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.*;




public class Mypanel extends JPanel{
    int x1,z12;
    int c=0;
    int y1;
    int x2;
    int y2;
    int rx1,ox1,hx1,ex1;
    int ry1,oy1,hy1,ey1;
    int rx2,ox2,hx2,ex2;
    int ry2,oy2,hy2,ey2;
    int f=0;
    int f2=0;
    
    ButtonGroup s=new ButtonGroup();

    JRadioButton rec;
    JRadioButton oval;
    JRadioButton yourline;
    JRadioButton handline;
    JRadioButton eraser;
    JCheckBox dotted;
    JCheckBox filled;
    JButton red;
    JButton green;
    JButton blue;
    JButton black;
    JButton clear;
   
    Vector<Integer> vec= new Vector<>();
    Vector<Integer> vecd= new Vector<>();
    Vector<Integer> vec2= new Vector<>();
    Vector<Integer> vec2f= new Vector<>();
    Vector<Integer> vec2d= new Vector<>();
    Vector<Integer> vec3= new Vector<>();
    Vector<Integer> vec3f= new Vector<>();
    Vector<Integer> vec3d= new Vector<>();
    Vector<Integer> vec4= new Vector<>();
    Vector<Integer> vec5= new Vector<>();
    
    
    


    public Mypanel() {
       // layout();
        
        //this.setFocusable(true);
        this.setBackground(Color.WHITE);
        yourline=new JRadioButton("line");
        rec=new JRadioButton("rectangle");
        oval=new JRadioButton("oval");
        handline=new JRadioButton("free hand");
        eraser=new JRadioButton("erase");
        dotted=new JCheckBox("dotted");
        filled=new JCheckBox("filled");
        s.add(rec);
        s.add(yourline);
        s.add(oval);
        s.add(handline);
        s.add(eraser);
      
        red=new JButton("red");
        green=new JButton("green");
        blue=new JButton("blue");
        black=new JButton("black");
        clear=new JButton("clear");
          this.add(rec);  
          this.add(yourline);
          this.add(oval);
          this.add(handline);
          this.add(eraser);
          this.add(red);
          this.add(black);
          this.add(green);
          this.add(blue);
          this.add(clear);
          this.add(clear);
          this.add(filled);
          this.add(dotted);
        //colors
        
         red.addActionListener(new ActionListener()
            {
            @Override
            public void actionPerformed(ActionEvent e)
            {
           c=1;
            
            }
            
            });
          black.addActionListener(new ActionListener()
            {
            @Override
            public void actionPerformed(ActionEvent e)
            {
           c=0;
            
            }
            
            });
            
            green.addActionListener(new ActionListener()
            {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                c=2;
            }
            
            });
            
            
            blue.addActionListener(new ActionListener()
            {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                
                c=3;
               
            
           // updateUI();
            }
            
            });
            
            
            
            //line
            
        yourline.addActionListener((ActionEvent e) -> {
            z12=1;
            
            
            addMouseListener(new MouseListener(){
                @Override
                public void mouseClicked(MouseEvent e) {
                }
                
                @Override
                public void mousePressed(MouseEvent e) {
                    x1=e.getX();
                    y1=e.getY();
                    
                }
                
                @Override
                public void mouseReleased(MouseEvent e) {
                    x2=e.getX();
                    y2=e.getY();
                    if(f2==0)
                {
                    if (z12==1)
                    {
                        vec.add(x1);
                        vec.add(y1);
                        vec.add(x2);
                        vec.add(y2);
                        vec.add(c);
                        
                        updateUI();
                    }
                    else {
                        vec.add(0);
                        vec.add(0);
                        vec.add(0);
                        vec.add(0);
                        vec.add(c);
                        
                        vecd.add(0);
                        vecd.add(0);
                        vecd.add(0);
                        vecd.add(0);
                        vecd.add(c);
                    }    
                    }
                    if(f2==1)
                {if (z12==1)
                    {
                        vecd.add(x1);
                        vecd.add(y1);
                        vecd.add(x2);
                        vecd.add(y2);
                        vecd.add(c);
                        
                        updateUI();
                    }
                    else {
                        
                        vec.add(0);
                        vec.add(0);
                        vec.add(0);
                        vec.add(0);
                        vec.add(c);
                        vecd.add(0);
                        vecd.add(0);
                        vecd.add(0);
                        vecd.add(0);
                        vecd.add(c);
                    }  
                    
                }
                    
                }
                
                @Override
                public void mouseEntered(MouseEvent e) {
                }
                
                @Override
                public void mouseExited(MouseEvent e) {
                }
            });
            
            addMouseMotionListener(new MouseAdapter() {
                @Override
                public void mouseDragged(MouseEvent e) {
                    x2=e.getX();
                    //System.out.println("hi"+x2);
                    y2=e.getY();
                    //System.out.println("hi"+y2);
                    repaint();
                }
                
                @Override
                public void mouseMoved(MouseEvent e) {
                }
            } );
        });
         //oval
            
        oval.addActionListener((ActionEvent e) -> {
            z12=3;
            
            
            addMouseListener(new MouseListener(){
                @Override
                public void mouseClicked(MouseEvent e) {
                }
                
                @Override
                public void mousePressed(MouseEvent e) {
                    ox1=e.getX();
                    oy1=e.getY();
                    
                }
                
                @Override
                public void mouseReleased(MouseEvent e) {
                    ox2=e.getX();
                    oy2=e.getY();
                    if(f==0&&f2==0)
                {
                    if (z12==3)
                    {
                        vec3.add(ox1);
                        vec3.add(oy1);
                        vec3.add(ox2);
                        vec3.add(oy2);
                        vec3.add(c);
                        
                        updateUI();
                    }
                    else {
                        vec3.add(0);
                        vec3.add(0);
                        vec3.add(0);
                        vec3.add(0);
                        vec3.add(c);
                        vec3f.add(0);
                        vec3f.add(0);
                        vec3f.add(0);
                        vec3f.add(0);
                        vec3f.add(c);
                        vec3d.add(0);
                        vec3d.add(0);
                        vec3d.add(0);
                        vec3d.add(0);
                        vec3d.add(c);
                    }    
                    }
                    if(f==1)
                {if (z12==3)
                    {
                        vec3f.add(ox1);
                        vec3f.add(oy1);
                        vec3f.add(ox2);
                        vec3f.add(oy2);
                        vec3f.add(c);
                        
                        updateUI();
                    }
                    else {
                        vec3f.add(0);
                        vec3f.add(0);
                        vec3f.add(0);
                        vec3f.add(0);
                        vec3f.add(c);
                        vec3.add(0);
                        vec3.add(0);
                        vec3.add(0);
                        vec3.add(0);
                        vec3.add(c);
                        vec3d.add(0);
                        vec3d.add(0);
                        vec3d.add(0);
                        vec3d.add(0);
                        vec3d.add(c);
                    }  
                    
                }
                    if(f2==1)
                {if (z12==3)
                    {
                        vec3d.add(ox1);
                        vec3d.add(oy1);
                        vec3d.add(ox2);
                        vec3d.add(oy2);
                        vec3d.add(c);
                        
                        updateUI();
                    }
                    else {
                        vec3f.add(0);
                        vec3f.add(0);
                        vec3f.add(0);
                        vec3f.add(0);
                        vec3f.add(c);
                        vec3d.add(0);
                        vec3d.add(0);
                        vec3d.add(0);
                        vec3d.add(0);
                        vec3d.add(c);
                        vec3.add(0);
                        vec3.add(0);
                        vec3.add(0);
                        vec3.add(0);
                        vec3.add(c);
                    }  
                    
                }
                }
                @Override
                public void mouseEntered(MouseEvent e) {
                }
                
                @Override
                public void mouseExited(MouseEvent e) {
                }
            });
            
            addMouseMotionListener(new MouseMotionListener()
            {
                @Override
                public void mouseDragged(MouseEvent e) {
                    ox2=e.getX();
                    oy2=e.getY();
                    updateUI();
                }
                
                @Override
                public void mouseMoved(MouseEvent e) {
                }
                
            });
        });
                
       
          
          //rectangle
          
           rec.addActionListener(new ActionListener()
            {
                
            @Override
            public void  actionPerformed(ActionEvent ex)
            {
              
             z12=2;
                addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent ex) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void mousePressed(MouseEvent ex) {
                
                rx1=ex.getX();
                ry1=ex.getY();
                
               
            }

            @Override
            public void mouseReleased(MouseEvent ex) {
                
                if(f==0&&f2==0)
                {
                    if (z12==2)
                    {
                        vec2.add(rx1);
                        vec2.add(ry1);
                        vec2.add(rx2);
                        vec2.add(ry2);
                        vec2.add(c);
                        
                        updateUI();
                    }
                    else {
                        vec2.add(0);
                        vec2.add(0);
                        vec2.add(0);
                        vec2.add(0);
                        vec2.add(c);
                        vec2f.add(0);
                        vec2f.add(0);
                        vec2f.add(0);
                        vec2f.add(0);
                        vec2f.add(c);
                        vec2d.add(0);
                        vec2d.add(0);
                        vec2d.add(0);
                        vec2d.add(0);
                        vec2d.add(c);
                    }    
                    }
                    if(f==1)
                {if (z12==2)
                    {
                        vec2f.add(rx1);
                        vec2f.add(ry1);
                        vec2f.add(rx2);
                        vec2f.add(ry2);
                        vec2f.add(c);
                        
                        updateUI();
                    }
                    else {
                        vec2f.add(0);
                        vec2f.add(0);
                        vec2f.add(0);
                        vec2f.add(0);
                        vec2f.add(c);
                        vec2.add(0);
                        vec2.add(0);
                        vec2.add(0);
                        vec2.add(0);
                        vec2.add(c);
                        vec2d.add(0);
                        vec2d.add(0);
                        vec2d.add(0);
                        vec2d.add(0);
                        vec2d.add(c);
                    }  
                    
                }
                    if(f2==1)
                {if (z12==2)
                   
                    {
                        vec2d.add(rx1);
                        vec2d.add(ry1);
                        vec2d.add(rx2);
                        vec2d.add(ry2);
                        vec2d.add(c);
                        
                        updateUI();
                    }
                    else {
                        vec2f.add(0);
                        vec2f.add(0);
                        vec2f.add(0);
                        vec2f.add(0);
                        vec2f.add(c);
                        vec2d.add(0);
                        vec2d.add(0);
                        vec2d.add(0);
                        vec2d.add(0);
                        vec2d.add(c);
                        vec2.add(0);
                        vec2.add(0);
                        vec2.add(0);
                        vec2.add(0);
                        vec2.add(c);
                    }  
                   }
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
           
            addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
               rx2=e.getX();
                ry2=e.getY();
                updateUI();
            }

            @Override
            public void mouseMoved(MouseEvent e) {
            }
        } 
            
        );}});
            
            //Freehand line
            
            handline.addActionListener(new ActionListener()
            {
                
            @Override
            public void  actionPerformed(ActionEvent ex)
            {
              
             z12=4;
                addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent ex) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void mousePressed(MouseEvent ex) {
                
                //hx1=ex.getX();
                //hy1=ex.getY();
                
               
            }

            @Override
            public void mouseReleased(MouseEvent ex) {
                
                //hx2=hx1;
                //hy2=hy1;
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
           
            addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
            hx1=e.getX();
            hy1=e.getY();
            hx2=hx1;
            hy2=hy1;
            if(z12==4)
                   {
                vec4.add(hx1);
                vec4.add(hy1);
                vec4.add(hx2);
                vec4.add(hy2);
                vec4.add(c);
                
               updateUI();
                   }
                   else{
                  
               vec4.add(0);
               vec4.add(0);
               vec4.add(0);
               vec4.add(0);
               vec4.add(c);
                }
            updateUI();
            }

            @Override
            public void mouseMoved(MouseEvent e) {
            }
        } 
            
        );
            
            
            }}
            
            
            );
                
       //eraser
            
            eraser.addActionListener(new ActionListener()
            {
                
            @Override
            public void  actionPerformed(ActionEvent ex)
            {
              
             z12=5;
                addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent ex) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void mousePressed(MouseEvent ex) {
                
                //hx1=ex.getX();
                //hy1=ex.getY();
                
               
            }

            @Override
            public void mouseReleased(MouseEvent ex) {
                
                //hx2=hx1;
                //hy2=hy1;
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
           
            addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
            ex1=e.getX();
            ey1=e.getY();
            ex2=0;
            ey2=0;
            if(z12==5)
                   {
                vec5.add(ex1);
                vec5.add(ey1);
                vec5.add(ex2);
                vec5.add(ey2);
                
                
               updateUI();
                   }
                   else{
                  
               vec5.add(0);
               vec5.add(0);
               vec5.add(0);
               vec5.add(0);
               
                }
            updateUI();
            }

            @Override
            public void mouseMoved(MouseEvent e) {
            }
        } 
            
        );
            
            
            }}
            
            
            );
          //clearall
            
            clear.addActionListener(new ActionListener()
            {
                
            @Override
            public void  actionPerformed(ActionEvent ex)
            {
                vec.clear();
                vecd.clear();
                vec2.clear();
                vec2f.clear();
                vec2d.clear();
                vec3.clear();
                vec3f.clear();
                vec3d.clear();
                vec4.clear();
                vec5.clear();
                
                x1=x2=y1=y2=rx1=rx2=ry1=ry2=ox1=ox2=ox2=oy1=oy2=hx1=hx2=hy1=hy2=c=0;
              //  System.out.println(".actionPerformed()");
                repaint();
              
               }}
            
            
            );
               //filled
            
            filled.addActionListener(new ActionListener()
            {
                
            @Override
            public void  actionPerformed(ActionEvent ex)
            {
               if(f==0)
                  f=1;
               else if
               (f==1)
                  f=0;
              //  System.out.println(".actionPerformed()");
                //repaint();
              
               }}
            
            
            ); 
            //dashed
            
            dotted.addActionListener(new ActionListener()
            {
                
            @Override
            public void  actionPerformed(ActionEvent ex)
            {
               if(f2==0)
                  f2=1;
               else if
               (f2==1)
                  f2=0;
              //  System.out.println(".actionPerformed()");
                //repaint();
              
               }}
            
            
            );
    }
                
        
    @Override
    public void paint(Graphics g){
        
        super.paint(g);
        
  
        for(int i=0;i<vec.size();i+=5)
        {
            
            if(vec.get(i+4)==0)
            {
                g.setColor(Color.black);
                
            }
            
            if(vec.get(i+4)==1)
            {
                g.setColor(Color.RED);
                
            }
            if(vec.get(i+4)==2)
            {
                g.setColor(Color.GREEN);
                
            }
            if(vec.get(i+4)==3)
            {
                g.setColor(Color.BLUE);
                
            }
            
        g.drawLine(vec.get(i), vec.get(i+1), vec.get(i+2), vec.get(i+3));
        
        
    }
        for(int i=0;i<vecd.size();i+=5)
        {
            
            if(vecd.get(i+4)==0)
            {
                g.setColor(Color.black);
                
            }
            
            if(vecd.get(i+4)==1)
            {
                g.setColor(Color.RED);
                
            }
            if(vecd.get(i+4)==2)
            {
                g.setColor(Color.GREEN);
                
            }
            if(vecd.get(i+4)==3)
            {
                g.setColor(Color.BLUE);
                
            }
            Graphics2D gg= (Graphics2D) g.create();
            Stroke dashed =new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);
            gg.setStroke(dashed);
            
        gg.drawLine(vecd.get(i), vecd.get(i+1), vecd.get(i+2), vecd.get(i+3));
        gg.dispose();
        
    }
         for(int i=0;i<vec2.size();i+=5)
        {
            if(vec2.get(i+4)==0)
            {
                g.setColor(Color.black);
                
            }
            
            if(vec2.get(i+4)==1)
            {
                g.setColor(Color.RED);
                
            }
            if(vec2.get(i+4)==2)
            {
                g.setColor(Color.GREEN);
                
            }
            if(vec2.get(i+4)==3)
            {
                g.setColor(Color.BLUE);
                
            }
            
            
        g.drawRect(vec2.get(i), vec2.get(i+1), abs(vec2.get(i+2)-vec2.get(i)),abs( vec2.get(i+3)-vec2.get(i+1)));
    }
         
         for(int i=0;i<vec2f.size();i+=5)
        {
            
            if(vec2f.get(i+4)==0)
            {
                g.setColor(Color.black);
                
            }
            
            if(vec2f.get(i+4)==1)
            {
                g.setColor(Color.RED);
                
            }
            if(vec2f.get(i+4)==2)
            {
                g.setColor(Color.GREEN);
                
            }
            if(vec2f.get(i+4)==3)
            {
                g.setColor(Color.BLUE);
                
            }
            
        g.fillRect(vec2f.get(i), vec2f.get(i+1), abs(vec2f.get(i)-vec2f.get(i+2)), abs(vec2f.get(i+1)-vec2f.get(i+3)));
        
        
    }
         for(int i=0;i<vec2d.size();i+=5)
        {
            
            if(vec2d.get(i+4)==0)
            {
                g.setColor(Color.black);
                
            }
            
            if(vec2d.get(i+4)==1)
            {
                g.setColor(Color.RED);
                
            }
            if(vec2d.get(i+4)==2)
            {
                g.setColor(Color.GREEN);
                
            }
            if(vec2d.get(i+4)==3)
            {
                g.setColor(Color.BLUE);
                
            }
            Graphics2D gg= (Graphics2D) g.create();
            Stroke dashed =new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);
            gg.setStroke(dashed);
            
        gg.drawRect(vec2d.get(i), vec2d.get(i+1), abs(vec2d.get(i)-vec2d.get(i+2)), abs(vec2d.get(i+1)-vec2d.get(i+3)));
        gg.dispose();
        
    }
         for(int i=0;i<vec3.size();i+=5)
        {
            
            if(vec3.get(i+4)==0)
            {
                g.setColor(Color.black);
                
            }
            
            if(vec3.get(i+4)==1)
            {
                g.setColor(Color.RED);
                
            }
            if(vec3.get(i+4)==2)
            {
                g.setColor(Color.GREEN);
                
            }
            if(vec3.get(i+4)==3)
            {
                g.setColor(Color.BLUE);
                
            }
            
        g.drawOval(vec3.get(i), vec3.get(i+1), abs(vec3.get(i)-vec3.get(i+2)), abs(vec3.get(i+1)-vec3.get(i+3)));
        
        
    }
         for(int i=0;i<vec3f.size();i+=5)
        {
            
            if(vec3f.get(i+4)==0)
            {
                g.setColor(Color.black);
                
            }
            
            if(vec3f.get(i+4)==1)
            {
                g.setColor(Color.RED);
                
            }
            if(vec3f.get(i+4)==2)
            {
                g.setColor(Color.GREEN);
                
            }
            if(vec3f.get(i+4)==3)
            {
                g.setColor(Color.BLUE);
                
            }
            
        g.fillOval(vec3f.get(i), vec3f.get(i+1), abs(vec3f.get(i)-vec3f.get(i+2)), abs(vec3f.get(i+1)-vec3f.get(i+3)));
        
        
    }
         for(int i=0;i<vec3d.size();i+=5)
        {
            
            if(vec3d.get(i+4)==0)
            {
                g.setColor(Color.black);
                
            }
            
            if(vec3d.get(i+4)==1)
            {
                g.setColor(Color.RED);
                
            }
            if(vec3d.get(i+4)==2)
            {
                g.setColor(Color.GREEN);
                
            }
            if(vec3d.get(i+4)==3)
            {
                g.setColor(Color.BLUE);
                
            }
            Graphics2D gg= (Graphics2D) g.create();
            Stroke dashed =new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);
            gg.setStroke(dashed);
            
        gg.drawOval(vec3d.get(i), vec3d.get(i+1), abs(vec3d.get(i)-vec3d.get(i+2)), abs(vec3d.get(i+1)-vec3d.get(i+3)));
        gg.dispose();
        
    }
         for(int i=0;i<vec4.size();i+=5)
        {
            
            if(vec4.get(i+4)==0)
            {
                g.setColor(Color.black);
                
            }
            
            if(vec4.get(i+4)==1)
            {
                g.setColor(Color.RED);
                
            }
            if(vec4.get(i+4)==2)
            {
                g.setColor(Color.GREEN);
                
            }
            if(vec4.get(i+4)==3)
            {
                g.setColor(Color.BLUE);
                
            }
            
        g.fillRect(vec4.get(i), vec4.get(i+1), 2, 2);
        }
       for(int i=0;i<vec5.size();i+=4)
        {
          g.setColor(Color.WHITE);
          
            
        g.fillRect(vec5.get(i), vec5.get(i+1), 20,20);
        }
       if (z12==1 && f2==0)
       {
           if(c==0)
            {
                g.setColor(Color.black);
                
            }
            
            if(c==1)
            {
                g.setColor(Color.RED);
                
            }
            if(c==2)
            {
                g.setColor(Color.GREEN);
                
            }
            if(c==3)
            {
                g.setColor(Color.BLUE);
                
            }
        g.drawLine(x1,y1,x2,y2);
       }
       if (z12==1 && f2==1)
      {
          if(c==0)
            {
                g.setColor(Color.black);
                
            }
            
            if(c==1)
            {
                g.setColor(Color.RED);
                
            }
            if(c==2)
            {
                g.setColor(Color.GREEN);
                
            }
            if(c==3)
            {
                g.setColor(Color.BLUE);
                
            }
            Graphics2D gg= (Graphics2D) g.create();
            Stroke dashed =new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);
            gg.setStroke(dashed);
            
        gg.drawLine(x1, y1, x2, y2);
        gg.dispose();
        
      }
      if (z12==2&&f==0&&f2==0)
      {
          if(c==0)
            {
                g.setColor(Color.black);
                
            }
            
            if(c==1)
            {
                g.setColor(Color.RED);
                
            }
            if(c==2)
            {
                g.setColor(Color.GREEN);
                
            }
            if(c==3)
            {
                g.setColor(Color.BLUE);
                
            }
            
        g.drawRect(rx1,ry1,abs(rx2-rx1),abs(ry2-ry1));
            
      }
      if (z12==2 && f==1)
      {
          if(c==0)
            {
                g.setColor(Color.black);
                
            }
            
            if(c==1)
            {
                g.setColor(Color.RED);
                
            }
            if(c==2)
            {
                g.setColor(Color.GREEN);
                
            }
            if(c==3)
            {
                g.setColor(Color.BLUE);
                
            }
        g.fillRect(rx1,ry1,abs(rx2-rx1),abs(ry2-ry1));
      }
        if (z12==2 && f2==1 )
      {
          if(c==0)
            {
                g.setColor(Color.black);
                
            }
            
            if(c==1)
            {
                g.setColor(Color.RED);
                
            }
            if(c==2)
            {
                g.setColor(Color.GREEN);
                
            }
            if(c==3)
            {
                g.setColor(Color.BLUE);
                
            }
            Graphics2D gg= (Graphics2D) g.create();
            Stroke dashed =new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);
            gg.setStroke(dashed);
            
        gg.drawRect(rx1, ry1, abs(rx2-rx1), abs(ry2-ry1));
        gg.dispose();
        
      }
        if (z12==3&&f==0&&f2==0)
      {
          if(c==0)
            {
                g.setColor(Color.black);
                
            }
            
            if(c==1)
            {
                g.setColor(Color.RED);
                
            }
            if(c==2)
            {
                g.setColor(Color.GREEN);
                
            }
            if(c==3)
            {
                g.setColor(Color.BLUE);
                
            }
        g.drawOval(ox1,oy1,abs(ox2-ox1),abs(oy2-oy1));
      }
        if (z12==3 && f==1)
      {
          if(c==0)
            {
                g.setColor(Color.black);
                
            }
            
            if(c==1)
            {
                g.setColor(Color.RED);
                
            }
            if(c==2)
            {
                g.setColor(Color.GREEN);
                
            }
            if(c==3)
            {
                g.setColor(Color.BLUE);
                
            }
        g.fillOval(ox1,oy1,abs(ox2-ox1),abs(oy2-oy1));
      }
        if (z12==3 && f2==1)
      {
          if(c==0)
            {
                g.setColor(Color.black);
                
            }
            
            if(c==1)
            {
                g.setColor(Color.RED);
                
            }
            if(c==2)
            {
                g.setColor(Color.GREEN);
                
            }
            if(c==3)
            {
                g.setColor(Color.BLUE);
                
            }
            Graphics2D gg= (Graphics2D) g.create();
            Stroke dashed =new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);
            gg.setStroke(dashed);
            
        gg.drawOval(ox1, oy1, abs(ox2-ox1), abs(oy2-oy1));
        gg.dispose();
        
      }
if (z12==4)
       {
           if(c==0)
            {
                g.setColor(Color.black);
                
            }
            
            if(c==1)
            {
                g.setColor(Color.RED);
                
            }
            if(c==2)
            {
                g.setColor(Color.GREEN);
                
            }
            if(c==3)
            {
                g.setColor(Color.BLUE);
                
            }
        g.fillRect(hx1,hy1,2,2);
       }
if (z12==5)
       {
           g.setColor(Color.WHITE);
        g.fillRect(ex1,ey1,20,20);
       }

 
    
}
   
    
}
            