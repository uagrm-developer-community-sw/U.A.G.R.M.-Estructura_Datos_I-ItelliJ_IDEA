import presentaciones.FormularioTdaBoolean;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class FormularioPrincipalTda {
    private JPanel pnlTdaPractico1;
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
        pnlTdaPractico1.addComponentListener(new ComponentAdapter() {
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("FormularioPrincipalTda");
        frame.setContentPane(new FormularioPrincipalTda().pnlTdaPractico1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
