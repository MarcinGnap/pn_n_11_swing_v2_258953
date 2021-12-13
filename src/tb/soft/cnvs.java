package tb.soft;

import java.awt.*;
import java.awt.Graphics;

class cnvs extends Canvas {

    public void paint(Graphics g, int MouseX, int MouseY){
        g.setColor(Color.GREEN);
        g.fillRect(MouseX, MouseY, 50, 50);
    }

    public void paintOval(Graphics g, int MouseX, int MouseY){
        g.setColor(Color.GREEN);
        g.drawOval(MouseX, MouseY, 50, 50);
    }

}