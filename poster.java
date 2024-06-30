  /* CENG 497 LAB WORK 11  */
 /* Name: Berkay Karadayı */


//package lab11;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class poster extends JFrame {
    BufferedImage b1;
    BufferedImage b;
   
    int width;
    int height;
    int w;
    int h;
	private BufferedImage buffer;
    public poster() {
    	//buffer = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB); 
        try {
        	b = ImageIO.read(new File("a2.jpg"));
        	//b1 = ImageIO.read(new File("C:/Users/BERKAY/Desktop/c.jpg"));
        } catch (IOException ex) {
            ex.printStackTrace();
            System.exit(0);
        }
//        h = b1.getHeight();
//        w = b1.getWidth();
        
        height = b.getHeight();
        width = b.getWidth();
        
        
    }
    
    public void paint(Graphics g) {
    	 
    	 
    	
    	Graphics2D g2 = (Graphics2D) g;
    	Image img1 = Toolkit.getDefaultToolkit().getImage("b.jpg");
    	 g2.drawImage(img1, 0, 0, this);
    	
        
     

        TexturePaint paint = new TexturePaint(b,new Rectangle2D.Double(0,0,width,height));
        
//        TexturePaint paint2 = new TexturePaint(b1,
//                            new Rectangle2D.Double(0,0,w,h));
       
        //g2.setPaint(paint2);
         g2.setPaint(paint);
       
         Composite c = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, .5f);
         
               //g2.setBackground(new Color(0, 0, 0, 0));
        
         
         //g2.drawOval(50, 50, 900, 500);
         
         
         
        g2.setComposite(c);
         
    g2.fill(new Ellipse2D.Double(30,40,770,450));
    
    }
    
    public static void main(String[] args) {
        JFrame f = new poster();
        f.setTitle("Dark Side Of The Friendship");
        f.setSize(1030,580);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
