package Tela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    private double num1;
    private double num2;
    private String operador;
    private double result;
    private double calcular;


    public TelaCalculadora() {
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BarraDeTexto.setText(BarraDeTexto.getText() + 1);
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BarraDeTexto.setText(BarraDeTexto.getText() + 2);
            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BarraDeTexto.setText(BarraDeTexto.getText() + 3);
            }
        });

        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BarraDeTexto.setText(BarraDeTexto.getText() + 4);
            }
        });

        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BarraDeTexto.setText(BarraDeTexto.getText() + 5);
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BarraDeTexto.setText(BarraDeTexto.getText() + 6);
            }
        });

        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BarraDeTexto.setText(BarraDeTexto.getText() + 7);
            }
        });

        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BarraDeTexto.setText(BarraDeTexto.getText() + 8);
            }
        });

        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BarraDeTexto.setText(BarraDeTexto.getText() + 9);
            }
        });

        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BarraDeTexto.setText(BarraDeTexto.getText() + 0);
            }
        });

        btn10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BarraDeTexto.setText(BarraDeTexto.getText() + ".");
            }
        });

        btn13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num1 = Double.parseDouble(BarraDeTexto.getText());
                    operador = "+";
                    BarraDeTexto.setText("");
                } catch (NumberFormatException ex) {
                    BarraDeTexto.setText("Erro! Limpe a tela");
                }
            }
        });

        btn14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num1 = Double.parseDouble(BarraDeTexto.getText());
                    operador = "-";
                    BarraDeTexto.setText("");
                } catch (NumberFormatException ex) {
                    BarraDeTexto.setText("Erro! Limpe a tela");
                }
            }
        });

        btn12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num1 = Double.parseDouble(BarraDeTexto.getText());
                    operador = "*";
                    BarraDeTexto.setText("");
                } catch (NumberFormatException ex) {
                    BarraDeTexto.setText("Erro! Limpe a tela");
                }
            }
        });

        btn11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num1 = Double.parseDouble(BarraDeTexto.getText());
                    operador = "/";
                    BarraDeTexto.setText("");
                } catch (NumberFormatException ex) {
                    BarraDeTexto.setText("Erro! Limpe a tela");
                }
            }
        });

        btn16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BarraDeTexto.setText(" ");
            }
        });
        //////////////////////////////////////////////////////////
        btn15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num2 = Double.parseDouble(BarraDeTexto.getText());
                    switch (operador) {
                        case "+":
                            result = num1 + num2;
                            break;
                        case "-":
                            result = num1 - num2;
                            break;
                        case "*":
                            result = num1 * num2;
                            break;
                        case "/":
                            if (num2 == 0) {
                                BarraDeTexto.setText("Erro: Divisão por zero");
                                return;
                            }
                            result = num1 / num2;
                            break;
                        default:
                            result = 0;
                    }

                    BarraDeTexto.setText(String.valueOf(result));

                } catch (NumberFormatException ex) {
                    BarraDeTexto.setText("Erro! Limpe a tela");
                }
            }
        });
        //////////////////////////////////////////////////////////

    }// fim do construtor

    public static void main(String[] args) {
        JFrame frame = new JFrame("TelaCalculadora");
        frame.setContentPane(new TelaCalculadora().TelaFundo);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(400, 400);
    }
}
