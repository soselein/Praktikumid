package praktikum12;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

/**
 * Ringjoone valemi jÃ¤rgi ringi joonistamise nÃ¤ide
 * @author Mikk Mangus
 */
@SuppressWarnings("serial")
public class Spiral extends Applet {

    private Graphics g;
    
    public void paint(Graphics g) {
        this.g = g;
        fillBg();
        drawSpiral();
    }
    
    /**
     * Katab tausta valgega
     */
    public void fillBg() {
        int w = getWidth();
        int h = getHeight();
        g.setColor(Color.white);
        g.fillRect(0, 0, w, h);
    }
    
    /**
     * Joonistab ringi
     */
    public void drawSpiral() {
        g.setColor(Color.black);
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        
        Polygon spiraal = new Polygon(); 
        
        for (double deg = 0; deg<=Math.PI*50; deg = deg + 0.03) {
        	double radius = 10 + deg*2;
            
        	
        	int x = (int) (radius * Math.cos(deg)) + centerX;
            int y = (int) (radius * Math.sin(deg)) + centerY;
            spiraal.addPoint(x, y);
        }
        g.drawPolygon(spiraal);
    }
}