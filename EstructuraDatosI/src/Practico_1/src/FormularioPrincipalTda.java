import presentaciones.FormularioTdaBoolean;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularioPrincipalTda {
    private JPanel panel1;
    private JButton TDABOOLEANButton;
    private JButton TDADUPLAButton;
    private JButton TDASTRINGTEXTOButton;
    private JButton TDAFECHAButton;
    private JButton TDAPERIODOButton;
    private JButton TDAFRACCIONESButton;
    private JButton TDAPUNTOButton;

    public FormularioPrincipalTda() {
        TDABOOLEANButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FormularioTdaBoolean ftb = new FormularioTdaBoolean();
                //ftb.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("FormularioPrincipalTda");
        frame.setContentPane(new FormularioPrincipalTda().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
