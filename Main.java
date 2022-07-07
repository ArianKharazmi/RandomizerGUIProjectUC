package com.company;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import javax.swing.border.*;

public class Main extends JFrame {

    Random rand = new Random();
    float r = rand.nextFloat();
    float g = rand.nextFloat() / 2f;
    float b = rand.nextFloat() / 2f;
    private int tool = 1;
    int modX, modY, ogX, ogY;
    public Main() {
        initComponents();
    }
    private void initComponents() {
        // Build up a custom JPanel
        jPanel2 = new Panel2();
        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        jPanel2.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
            public void mouseReleased(MouseEvent evt) {
                jPanel2MouseReleased(evt);
            }
        });
        jPanel2.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        this.setContentPane(jPanel2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }
    private void jPanel2MouseDragged(MouseEvent evt) {
        if (tool == 1) {
            modX = evt.getX();
            modY = evt.getY();
            ogX = modX;
            ogY = modY;
            System.out.println(modX + " " + modY);
        }
    }
    private void jPanel2MousePressed(MouseEvent evt) {
        ogX = evt.getX();
        ogY = evt.getY();
        System.out.println(ogX + " " + ogY);
    }
    private void jPanel2MouseReleased(MouseEvent evt) {
        if (tool == 2) {
            modX = evt.getX();
            modY = evt.getY();
            System.out.println("Line" + ogX + "to" + modX);
        }
    }
    public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    private Color randColor() {
        Random rand = new Random();
        float r1 = rand.nextFloat();
        float g1 = rand.nextFloat();
        float b1 = rand.nextFloat();
        Color randomColor1 = new Color(r1, g1, b1);
        return randomColor1;


    }


    private int randWidth() {
        Random rand = new Random();
        int r1 = rand.nextInt(80-25) + 25;
        return r1;
    }

    private int randHeight() {
        Random rand = new Random();
        int r1 = rand.nextInt(80-25) + 25;
        return r1;
    }
    //for(int x=0;x<modX;x++)
    //        for(int y=0;y<modY;y++) {



    private JPanel jPanel2;
    // Declare Variable
    class Panel2 extends JPanel {
        Panel2() {
            // set a preferred size for the custom panel.
            setPreferredSize(new Dimension(420,420));
        }
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            int tool = (int)(Math.random()*256);
            super.paintComponent(g);
            g.setColor(Color.GRAY);
            g.fillOval(modY, modX, ogX, ogY);

            // Outer Squares, First Row
            //First Box Color
            g.setColor(randColor());
            g.fillRect(0, 5,100, 100);

            g.setColor(randColor());
            g.fillRect(0, 5,90, 90);

            g.setColor(randColor());
            g.fillRect(100,5,100,100);
            // Outer Squares First Row
            g.drawRect(0, 5, 100, 100);
            g.drawRect(100, 5, 100, 100);
            g.drawRect(200, 5, 100, 100);
            g.drawRect(300, 5, 100, 100);

            g.setColor(randColor());
            g.fillRect(100,5,90,90);
            g.setColor(randColor());
            g.fillRect(100,5,90,90);

            //
            g.setColor(randColor());
            g.fillRect(200,5,100,100);
            g.setColor(randColor());
            g.fillRect(200,5,90,90);

            g.setColor(randColor());
            g.fillRect(300,5,100,100);
            g.setColor(randColor());
            g.fillRect(300,5,90,90);

            g.setColor(randColor());
            g.fillRect(0,105,100,100);
            g.setColor(randColor());
            g.fillRect(0,105,90,90);

            g.setColor(randColor());
            g.fillRect(100,105,100,100);
            g.setColor(randColor());
            g.fillRect(105,105,90,90);


            //g.setColor(new Color((int)(Math.random()256),(int)(Math.random()256),(int)(Math.random()256)));
            //g.setColor(new Color((int)(Math.random()256),(int)(Math.random()256),(int)(Math.random()256)));
            //g.setColor(new Color((int)(Math.random()256),(int)(Math.random()256),(int)(Math.random()256)));

            g.setColor(randColor());
            g.fillRect(200,105,100,100);
            g.setColor(randColor());
            g.fillRect(205,105,90,90);

            g.setColor(randColor());
            g.fillRect(300,105,100,100);
            g.setColor(randColor());
            g.fillRect(305,105,90,90);

            g.setColor(randColor());
            g.fillRect(0,205,100,100);
            g.setColor(randColor());
            g.fillRect(5,205,90,90);

            g.setColor(randColor());
            g.fillRect(100,205,100,100);
            g.setColor(randColor());
            g.fillRect(105,205,90,90);

            g.setColor(randColor());
            g.fillRect(200,205,100,100);
            g.setColor(randColor());
            g.fillRect(205,205,90,90);

            g.setColor(randColor());
            g.fillRect(300,205,100,100);
            g.setColor(randColor());
            g.fillRect(305,205,90,90);

            g.setColor(randColor());
            g.fillRect(0,305,100,100);
            g.setColor(randColor());
            g.fillRect(5,305,90,90);

            g.setColor(randColor());
            g.fillRect(100,305,100,100);
            g.setColor(randColor());
            g.fillRect(105,305,90,90);

            g.setColor(randColor());
            g.fillRect(200,305,100,100);
            g.setColor(randColor());
            g.fillRect(205,305,90,90);

            g.setColor(randColor());
            g.fillRect(300,305,100,100);
            g.setColor(randColor());
            g.fillRect(305,305,90,90);


            // Outer Squares, Second Row
            g.drawRect(0, 105, 100, 100);
            g.drawRect(100, 105, 100, 100);
            g.drawRect(200, 105, 100, 100);
            g.drawRect(300, 105, 100, 100);
            // Outer Squares, Third Row
            g.drawRect(0, 205, 100, 100);
            g.drawRect(100, 205, 100, 100);
            g.drawRect(200, 205, 100, 100);
            g.drawRect(300, 205, 100, 100);
            // Outer Squares, Fourth Row
            g.drawRect(0, 305, 100, 100);
            g.drawRect(100, 305, 100, 100);
            g.drawRect(200, 305, 100, 100);
            g.drawRect(300, 305, 100, 100);
            // The Inner Squares Below
            //First Row
            g.drawRect(5, 10, 90, 90);
            g.drawRect(105, 10, 90, 90);
            g.drawRect(205, 10, 90, 90);
            g.drawRect(305, 10, 90, 90);
            //Second Row
            g.drawRect(5, 105, 90, 90);
            g.drawRect(105, 105, 90, 90);
            g.drawRect(205, 105, 90, 90);
            g.drawRect(305, 105, 90, 90);
            //Third Row
            g.drawRect(5, 205, 90, 90);
            g.drawRect(105, 205, 90, 90);
            g.drawRect(205, 205, 90, 90);
            g.drawRect(305, 205, 90, 90);
            //Fourth Row
            g.drawRect(5, 305, 90, 90);
            g.drawRect(105, 305, 90, 90);
            g.drawRect(205, 305, 90, 90);
            g.drawRect(305, 305, 90, 90);
            // First Circle, 3rd Column
            int w = randWidth();
            int h = randHeight();
            g.drawRoundRect(222, 27,w,h,100, 100);
            g.setColor(randColor());
            g.fillRoundRect(222,27,w,h,100,100);
            // Second Circle, 1st Column
            int w2 = randWidth();
            int h2 = randHeight();
            g.drawRoundRect(22, 127,w2,h2,100, 100);
            g.setColor(randColor());
            g.fillRoundRect(22,127,w2,h2,100,100);
            // Third Circle, 3rd Column
            int w3 = randWidth();
            int h3 = randHeight();
            g.drawRoundRect(222, 227,w3,h3,100, 100);
            g.setColor(randColor());
            g.fillRoundRect(222,227,w3,h3,100,100);
            // Fourth Circle, 4th Column
            int w4 = randWidth();
            int h4 = randHeight();
            g.drawRoundRect(322, 327,w4,h4,100, 100);
            g.setColor(randColor());
            g.fillRoundRect(322,327,w4,h4,100,100);

        }
    }
}