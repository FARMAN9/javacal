
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {
    TextField Display = new TextField(10);

    final private Font myfont = new Font("NONE", Font.ITALIC, 40);
    final private Font myfont2 = new Font("NONE", Font.BOLD, 20);
    JButton n1, n2, n3, n4, n5, n6, n7, n8, n9, n0;
    JButton fplus, fmun, fdiv, fmul, fequl, dot, clear, delete, pm;
    JButton num[] = new JButton[10];
    JButton fun[] = new JButton[9];
    double number;
    double number2;
    double result;
    char op;

    Calculator() {
        setTitle("Calculator beta 2");

        // display//
        JPanel Displayx = new JPanel();
        JLabel non = new JLabel();
        JLabel non2 = new JLabel();
        Displayx.setLayout(new GridLayout(3, 1, 0, 0));
        Displayx.setBounds(55, 88, 88, 77);
        Displayx.add(non);
        Display.setEditable(false);

        Displayx.setVisible(true);
        Displayx.setOpaque(false);
        Display.setFont(myfont);
        Displayx.add(Display);
        non2.setFont(myfont);
        Displayx.add(non2);
        // end display//
        // center keypad//
        JPanel keybadnum = new JPanel();
        keybadnum.setFont(myfont);
        n1 = new JButton("1");
        n1.setFont(myfont2);
        n2 = new JButton("2");
        n2.setFont(myfont2);
        n3 = new JButton("3");
        n3.setFont(myfont2);
        n4 = new JButton("4");
        n4.setFont(myfont2);
        n5 = new JButton("5");
        n5.setFont(myfont2);
        n6 = new JButton("6");
        n6.setFont(myfont2);
        n7 = new JButton("7");
        n7.setFont(myfont2);
        n8 = new JButton("8");
        n8.setFont(myfont2);
        n9 = new JButton("9");
        n9.setFont(myfont2);
        n0 = new JButton("0");
        n0.setFont(myfont2);
        fplus = new JButton("+");
        fplus.setFont(myfont2);
        fmun = new JButton("-");
        fmun.setFont(myfont2);
        fdiv = new JButton("/");
        fdiv.setFont(myfont2);
        fmul = new JButton("*");
        fmul.setFont(myfont2);
        fequl = new JButton("=");
        fequl.setFont(myfont2);
        dot = new JButton(".");
        dot.setFont(myfont2);
        keybadnum.setLayout(new GridLayout(4, 3, 6, 10));
        num[1] = n1;
        num[2] = n2;
        num[3] = n3;
        num[4] = n4;
        num[5] = n5;
        num[6] = n6;
        num[7] = n7;
        num[8] = n8;
        num[9] = n9;
        num[0] = n0;
        fun[0] = fplus;
        fun[1] = fmul;
        fun[2] = fdiv;
        fun[3] = fmun;
        fun[4] = fequl;
        fun[5] = dot;
        keybadnum.add(n1);
        keybadnum.add(n2);
        keybadnum.add(n3);
        keybadnum.add(fplus);
        keybadnum.add(n4);
        keybadnum.add(n5);
        keybadnum.add(n6);
        keybadnum.add(fmun);
        keybadnum.add(n7);
        keybadnum.add(n8);
        keybadnum.add(n9);
        keybadnum.add(fdiv);
        keybadnum.add(dot);
        keybadnum.add(n0);
        keybadnum.add(fequl);
        keybadnum.add(fmul);
        pm = new JButton("(+/-)");
        pm.setFont(myfont2);

        clear = new JButton("C");
        clear.setBackground(Color.red);

        clear.setFocusable(false);
        clear.setFont(myfont2);
        delete = new JButton("delete");

        delete.setFocusable(false);
        delete.setFont(myfont2);
        fun[6] = clear;
        fun[7] = delete;
        fun[8] = pm;
        for (int i = 0; i < 10; i++) {
            num[i].addActionListener(this);
            num[i].setFocusable(false);
            num[i].setBackground(Color.MAGENTA);
        }
        for (int i = 0; i < 9; i++) {
            fun[i].addActionListener(this);
            fun[i].setFocusable(false);
            if (i != 6) {
                fun[i].setBackground(Color.pink);
            } else {
                fun[i].setBackground(Color.red);
            }

        }
        keybadnum.setOpaque(false);
        // end keypad //
        // bottumempty//
        JTextArea emplty = new JTextArea();
        emplty.setOpaque(false);
        JTextArea emplty2 = new JTextArea();
        emplty2.setOpaque(false);
        JTextArea emplty3 = new JTextArea();
        emplty3.setOpaque(false);
        JPanel delclr = new JPanel();
        delclr.setLayout(new GridLayout(1, 5, 5, 10));
        delclr.add(emplty2);
        delclr.add(pm);
        delclr.add(delete);
        delclr.add(clear);
        delclr.add(emplty3);

        delclr.setOpaque(false);
        JPanel bottum = new JPanel();

        bottum.setLayout(new GridLayout(3, 1, 5, 5));
        bottum.add(emplty);
        bottum.add(delclr);

        bottum.setOpaque(false);
        // end bottum//
        // east panel//
        JPanel east = new JPanel();
        east.setOpaque(false);
        // end east panel//
        // west panel//
        JPanel west = new JPanel();
        west.setOpaque(false);
        // end west panel//

        JPanel mainfream = new JPanel();
        mainfream.setLayout(new BorderLayout());
        mainfream.setBackground(new Color(190, 142, 116));
        setSize(500, 600);
        mainfream.add(Displayx, BorderLayout.NORTH);
        mainfream.add(keybadnum, BorderLayout.CENTER);
        mainfream.add(bottum, BorderLayout.SOUTH);
        mainfream.add(east, BorderLayout.EAST);
        mainfream.add(west, BorderLayout.WEST);
        setMaximumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        add(mainfream);

    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();

    }

    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == num[i]) {
                Display.setText(Display.getText().concat(String.valueOf(i)));

            }
        }
        if (e.getSource() == dot) {

            Display.setText(Display.getText().concat("."));
        }
        if (e.getSource() == fplus) {
            number = Double.parseDouble(Display.getText());
            op = '+';
            Display.setText("");

        }
        if (e.getSource() == fdiv) {
            number = Double.parseDouble(Display.getText());
            op = '/';
            Display.setText("");

        }
        if (e.getSource() == fmul) {
            number = Double.parseDouble(Display.getText());
            op = '*';
            Display.setText("");

        }
        if (e.getSource() == fmun) {
            number = Double.parseDouble(Display.getText());
            op = '-';
            Display.setText("");

        }

        if (e.getSource() == fequl) {
            number2 = Double.parseDouble(Display.getText());
            switch (op) {
                case '+':
                    result = number + number2;
                    break;
                case '-':
                    result = number - number2;
                    break;
                case '/':
                    result = number / number2;
                    break;
                case '*':
                    result = number * number2;
                    break;
            }
            Display.setText(String.valueOf(result));
            number = number2;

        }
        if (e.getSource() == clear) {
            Display.setText("");
            number = 0;
            number2 = 0;
        }
        if (e.getSource() == delete) {
            String temp = Display.getText();
            Display.setText("");
            StringBuffer tem2 = new StringBuffer(temp);
            tem2.deleteCharAt(tem2.length() - 1);
            Display.setText(String.valueOf(tem2));
        }
        if (e.getSource() == pm) {
            if (Display.getText() == "") {
                Display.setText("-");
            }
            // else{
            // Display.setText(Display.getText().append("-"));
            // under processing
            // }
        }
    }

}