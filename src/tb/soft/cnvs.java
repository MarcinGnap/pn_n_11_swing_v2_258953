package tb.soft;

import java.awt.*;
import java.awt.Graphics;

class cnvs extends Canvas {

    public void paint(Graphics g){
        g.setColor(Color.GREEN);
        g.fillRect(50, 50, 50, 50);
    }

    public void paintOval(Graphics g){
        g.setColor(Color.GREEN);
        g.drawOval(50, 50, 50, 50);
    }

}