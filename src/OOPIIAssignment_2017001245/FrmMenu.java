package OOPIIAssignment_2017001245;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmMenu {
    private JLabel lblMenu;
    private JButton btnOrder;
    private JButton btnViewFileRecords;
    private JButton btnLogout;
    private JButton btnViewOrderList;
    private JPanel pnlMenu;

    public FrmMenu() {
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open Order Form
            }
        });
        btnViewFileRecords.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Open form with jtable view (source == file);
            }
        });
    }
}
