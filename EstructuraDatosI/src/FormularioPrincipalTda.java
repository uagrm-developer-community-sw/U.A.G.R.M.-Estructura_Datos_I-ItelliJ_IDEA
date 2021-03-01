import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import PracticoI.Presentaciones.FormularioBoolean;

public class FormularioPrincipalTda {
    private JPanel pnPFT;
    private JButton TDADUPLAButton;
    private JButton TDASTRINGTEXTOButton;
    private JButton TDABOOLEANButton;
    private JButton TDAFECHAButton;
    private JButton TDAPERIODOButton;
    private JButton TDAFRACCIONESButton;
    private JButton TDAPUNTOButton;
    private JButton btnIngresar;

    public FormularioPrincipalTda() {


        TDADUPLAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("hola mundo");
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("FormularioPrincipalTda");
        frame.setContentPane(new FormularioPrincipalTda().pnPFT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
