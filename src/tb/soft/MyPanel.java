package tb.soft;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class MyPanel extends JPanel{

    public MyPanel() {
        setBorder(new LineBorder(new Color(0, 0, 0), 0, false));
        setBackground(Color.LIGHT_GRAY);
        setLayout(null);
    }
}
