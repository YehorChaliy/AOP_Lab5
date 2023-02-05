package com.company;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;

public class Main extends Frame {
    Main(String s, int w, int h) {
        super(s);
        setSize(w, h);
        Color background = new Color(223, 186, 155);
        setBackground(background);
        setVisible(true);
        setLocationRelativeTo(null);
        setLayout(null);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ev) {
                System.exit(0);
            }
        });

        TextField name = new TextField();
        name.setBounds(200, 400, 315, 47);
        name.setFont(new Font("Serif", Font.PLAIN, 27));
        add(name);

        Button next = new Button("Далі");
        next.setForeground(new Color(255, 255, 255));
        next.setBackground(new Color(140, 0, 0));
        next.setFont(new Font("Serif", 1, 21));
        next.setBounds(589, 430, 123, 50);
        add(next);

        Checkbox right = new Checkbox("Я погоджуюсь з", true);
        right.setFont(new Font("Serif", Font.PLAIN, 20));
        right.setBounds(65, 475, 153, 30);
        add(right);


    }

    public void paint(Graphics g) {

        Color mainColor = new Color(0, 0, 0);

        g.setColor(new Color(140, 0, 0));
        g.setFont(new Font("Serif", 3, 33));
        g.drawString("Конвертація документів ", 30, 85);

        g.setColor(mainColor);
        g.setFont(new Font("Serif", 0, 24));
        g.drawString("Оберіть завдання: ", 60, 155);

        Image img = (new ImageIcon("C:/My projects/AOP/Lab5/src/images/img1.png")).getImage();
        g.drawImage(img, 150, 170, 70, 70, null);

        Image img2 = (new ImageIcon("C:/My projects/AOP/Lab5/src/images/img2.png")).getImage();
        g.drawImage(img2, 155, 250, 61, 61, null);

        Image img3 = (new ImageIcon("C:/My projects/AOP/Lab5/src/images/img3.png")).getImage();
        g.drawImage(img3, 155, 330, 75, 75, null);

        g.setColor(mainColor);
        g.setFont(new Font("Serif", 0, 21));
        g.drawString("Конвертувати в PDF ", 245, 210);

        g.setColor(mainColor);
        g.setFont(new Font("Serif", 0, 21));
        g.drawString("Конвертувати в Microsoft Word ", 245, 290);

        g.setColor(mainColor);
        g.setFont(new Font("Serif", 0, 21));
        g.drawString("Перетворити на документ Microsoft Excel ", 245, 370);

        g.setColor(mainColor);
        g.setFont(new Font("Serif", 2, 21));
        g.drawString("Ім'я файлу", 87, 430);

        Color lastPart = new Color(0,0,255);
        g.setColor(lastPart);
        g.setFont(new Font("Serif", Font.PLAIN, 20));
        g.drawString("Умовами", 219,496);
    }

    public static void main(String[] args) {
        Main Frame = new Main("Лабораторна робота №5", 750, 530);
        Frame.setSize(750, 530);
    }
}
