package Tela;

import javax.swing.*;

public class TelaCalculadora {
    private JPanel TelaFundo;
    private JTextField BarraDeTexto;
    private JButton btn7;
    private JButton btn12;
    private JButton btn13;
    private JButton btn14;
    private JButton btn11;
    private JButton btn3;
    private JButton btn2;
    private JButton btn1;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn0;
    private JButton btn8;
    private JButton btn9;
    private JButton btn10;
    private JButton btn15;
    private JButton btn16;

    public static void main(String[] args) {
        JFrame frame = new JFrame("TelaCalculadora");
        frame.setContentPane(new TelaCalculadora().TelaFundo);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(400, 400);
    }
}
