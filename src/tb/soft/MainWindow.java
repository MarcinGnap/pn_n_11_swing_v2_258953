package tb.soft;

import com.sun.tools.javac.Main;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import java.util.Random;
import java.awt.Canvas;

public class MainWindow extends JFrame {
    private static final String title = "Click me!";

    public static void main(String[] args, Graphics g) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    JPanel panel = new JPanel();
                    MainWindow frame = new MainWindow(panel, g);
                    frame.add(panel);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace(System.err);
                }
            }
        });
    }

    public MainWindow(JPanel panel, Graphics g) throws HeadlessException {
        super(title);
        buildFrame(panel, g);
    }

    protected void buildFrame(JPanel panel, Graphics g) {

        setBounds(0, 0, 640, 640);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.setLayout(null);

        JPanel newPanel = new JPanel();

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
                runNewFrame(newPanel, g);
            }
        });
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                runNewFrame(newPanel, g);
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

    public void runNewFrame(JPanel newPanel, Graphics g){
        MainWindow newFrame = new MainWindow(newPanel, g);
        newFrame.setVisible(true);
        KeyEvent event = null;

        cnvs kanwa = new cnvs();

        Point p = MouseInfo.getPointerInfo().getLocation();
        int MouseX = p.x;
        int MouseY = p.y;

        setBounds(0, 0, 640, 640);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        newPanel.setLayout(null);

        JPanel newContentPane = new JPanel();

        newContentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(newContentPane);
        newContentPane.setLayout(null);

        newPanel.setBounds(0, 0, 640, 640);
        newContentPane.add(newPanel);
        newContentPane.add(kanwa);

        if (event.getKeyCode() == KeyEvent.VK_M){
            cnvs.paintRect(g, MouseX, MouseY);
        }
        if (event.getKeyCode() == KeyEvent.VK_K){
            cnvs.paintOval(g, MouseX, MouseY);
        }
    }

}