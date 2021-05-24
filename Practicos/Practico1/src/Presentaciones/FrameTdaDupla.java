package Presentaciones;

import Negocios.dupla;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameTdaDupla extends JFrame{
    private JPanel mainPanel;
    private JButton btnDupla;
    private JTextField txtF1;
    private JTextField txtF2;
    private JLabel lbResultado;

    dupla d;
    public FrameTdaDupla(String titel) {
        super(titel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        btnDupla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int a = Integer.parseInt(txtF1.getText());
                int b = Integer.parseInt(txtF2.getText());
                //d.setA(a);
                //d.setB(b);
                int resul= a+b;
                lbResultado.setText(Integer.toString(resul));
                //lbResultado.setText(Integer.toString(d.opercionSuma()));

            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new FrameTdaDupla("Formulario Dupla Tda");
        frame.setVisible(true);
    }
}
