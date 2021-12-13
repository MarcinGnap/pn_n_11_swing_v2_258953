package tb.soft;

import java.awt.*;

class MyCanva extends Canvas {

    Point p = MouseInfo.getPointerInfo().getLocation();
    int MouseX = p.x;
    int MouseY = p.y;

    public void drawOval(Graphics g, int MouseX, int MouseY){
        g.drawOval(MouseX, MouseY, 25, 25);
    }

    public void drawRect(Graphics g, int MouseX, int MouseY){
        g.drawRect(MouseX, MouseY, 25, 25);
    }

}