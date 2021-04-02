package presentacion;

import negocios.TdaSuma;

import javax.swing.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class FormOperacionesAritmeticas {
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JButton button1;

    TdaSuma s;
    public FormOperacionesAritmeticas() {
        panel1.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("FormOperacionesAritmeticas");
        frame.setContentPane(new FormOperacionesAritmeticas().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
