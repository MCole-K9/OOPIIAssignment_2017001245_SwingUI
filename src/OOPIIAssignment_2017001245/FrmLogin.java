package OOPIIAssignment_2017001245;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmLogin  extends JFrame{

    private JTextField txtUserName;
    private JPasswordField txtPassword;
    private JPanel pnlLogin;
    private JLabel lblPassword;
    private JLabel lblUserName;
    private JLabel lblLogin;
    private JButton btnLogin;
    private JButton btnCancel;



    public FrmLogin() throws HeadlessException {
        setContentPane(this.pnlLogin);
        setVisible(true);
        setSize(600, 400);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        String UserName = "admin";
        String Password = "matthew123";

        final int maxLoginAtmpt = 3;
        final int[] failedLoginAtmpt = {0};


        btnLogin.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if(txtUserName.getText().equals(UserName) && String.valueOf(txtPassword.getPassword()).equals(Password) ){

                    JOptionPane.showMessageDialog(new JFrame(), "Success");

                }else{


                    failedLoginAtmpt[0]++;

                    if(failedLoginAtmpt[0] >= maxLoginAtmpt){

                        //close application
                        JOptionPane.showMessageDialog(new JFrame(), "Closing");

                    }else{

                        JOptionPane.showMessageDialog(new JFrame(), "Incorrect UserName or Password\n" +
                                "Attempts Remaining: "+ (maxLoginAtmpt - failedLoginAtmpt[0]));
                    }


                }
            }
        });
    }

    public static void main(String[] args) {
        FrmLogin frmLogin = new FrmLogin();
    }
}
