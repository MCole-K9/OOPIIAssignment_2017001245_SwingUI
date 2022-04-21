package OOPIIAssignment_2017001245;

import javax.swing.*;
import javax.swing.text.Utilities;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmLogin{

    private JTextField txtUserName;
    private JPasswordField txtPassword;
    public JPanel pnlLogin;
    private JLabel lblPassword;
    private JLabel lblUserName;
    private JLabel lblLogin;
    private JButton btnLogin;
    private JButton btnCancel;



    public FrmLogin() throws HeadlessException {
        /* setContentPane(this.pnlLogin);
        setVisible(true);
        setSize(600, 400);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        */


        String UserName = "admin";
        String Password = "matthew123";

        final int maxLoginAtmpt = 3;
        final int[] failedLoginAtmpt = {0};


        btnLogin.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if(txtUserName.getText().equals(UserName) && String.valueOf(txtPassword.getPassword()).equals(Password) ){

                    JOptionPane.showMessageDialog(pnlLogin.getRootPane(), "Success");
                    //dispose();
                    JFrame frame = (JFrame) SwingUtilities.getRoot((Component) e.getSource());
                    frame.setContentPane(new FrmMenu().pnlMenu);
                    frame.setVisible(true);

                }else{

                    failedLoginAtmpt[0]++;

                    if(failedLoginAtmpt[0] >= maxLoginAtmpt){

                        //close application
                        JOptionPane.showMessageDialog(pnlLogin.getRootPane(), "Closing");

                        JFrame frame = (JFrame) SwingUtilities.getRoot((Component) e.getSource());
                        frame.dispose();



                    }else{

                        JOptionPane.showMessageDialog(pnlLogin.getRootPane(), "Incorrect UserName or Password\n" +
                                "Attempts Remaining: "+ (maxLoginAtmpt - failedLoginAtmpt[0]));
                    }


                }
            }
        });
    }




    public static void main(String[] args) {
        JFrame frame = new JFrame("Book Order System");
        frame.setContentPane(new FrmLogin().pnlLogin);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setVisible(true);
    }
}
