package OOPIIAssignment_2017001245;
//Matthew Cole - 2017001245

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmMenu {
    private JLabel lblMenu;
    private JButton btnOrder;
    private JButton btnViewFileRecords;
    private JButton btnLogout;
    private JButton btnViewOrderList;
    public JPanel pnlMenu;

    public FrmMenu() {

        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getRoot((Component) e.getSource());
                CPane.ContentP.addPane(frame.getContentPane());
                frame.setContentPane(new FrmOrder().pnlOrder);
                frame.setVisible(true);
            }
        });
        btnViewFileRecords.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame frame = (JFrame) SwingUtilities.getRoot((Component) e.getSource());
                CPane.ContentP.addPane(frame.getContentPane());
                frame.setContentPane(new FrmFileOrders().pnlFileOrders);
                frame.setVisible(true);
            }
        });
        btnLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getRoot((Component) e.getSource());
                frame.dispose();
                /*
                CPane.ContentP.addPane(frame.getContentPane());
                frame.setContentPane(new FrmLogin().pnlLogin);
                frame.setVisible(true);
                */
            }
        });
        btnViewOrderList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getRoot((Component) e.getSource());
                CPane.ContentP.addPane(frame.getContentPane());
                frame.setContentPane(new FrmListOrders().pnlListOrders);
                frame.setVisible(true);
            }
        });
    }
}
