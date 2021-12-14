package tb.soft;

import java.awt.*;
import java.awt.Graphics;

class cnvs extends Canvas {
    public static void paintRect(Graphics g, int MouseX, int MouseY){
        g.setColor(Color.GREEN);
        g.fillRect(MouseX, MouseY, 50, 50);
    }

    public static void paintOval(Graphics g, int MouseX, int MouseY){
        g.setColor(Color.GREEN);
        g.drawOval(MouseX, MouseY, 50, 50);
    }

}