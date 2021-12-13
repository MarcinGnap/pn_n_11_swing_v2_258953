package tb.soft;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class MainWindow extends JFrame {
    private static final String title = "Log in Window";

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    JPanel panel = new JPanel();
                    MainWindow frame = new MainWindow(panel);
                    frame.add(panel);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace(System.err);
                }
            }
        });
    }

    public MainWindow(JPanel panel) throws HeadlessException {
        super(title);
        buildFrame(panel);
    }

    protected void buildFrame(JPanel panel) {

        setBounds(0, 0, 640, 640);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.setLayout(null);

        JPanel contentPane = new JPanel();

        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        panel.setBounds(0, 0, 640, 640);
        contentPane.add(panel);

        JButton btn = new JButton("Click");
        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                Random random = new Random();
                int x = random.nextInt(515);
                int y = random.nextInt(555);
                btn.setLocation(x, y);
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                runCanva();
            }
        });
        btn.setBounds(20, 500, 100, 35);
        panel.add(btn);

        JButton reset = new JButton("Reset");
        reset.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                btn.setLocation(515, 555);
            }
        });
        reset.setBounds(515, 555, 100, 35);
        panel.add(reset);
    }

    public void runCanva(){

    }
}

class MyCanva extends Canvas{

    public void drawOval(Graphics g, int MouseX, int MouseY){
        g.drawOval(MouseX, MouseY, 25, 25);
    }

    public void drawRect(Graphics g, int MouseX, int MouseY){
        g.drawRect(MouseX, MouseY, 25, 25);
    }

}