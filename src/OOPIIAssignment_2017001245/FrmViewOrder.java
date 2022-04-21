package OOPIIAssignment_2017001245;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmViewOrder {
    private JLabel lblID;
    private JLabel lblAuthor;
    private JLabel lblTitle;
    private JLabel lblPDate;
    private JLabel lblPrice;
    private JTextField txtBookID;
    private JTextField txtAuthor;
    private JTextField txtTitle;
    private JTextField txtPublishedDate;
    private JTextField txtPrice;
    private JTextField txtQty;
    private JLabel lblBookOrder;
    private JTextField txtSubtotal;
    private JButton btnBack;
    private JButton btnMenu;
    public JPanel pnlViewOrder;

    public FrmViewOrder(Book book) {


        try {

            txtBookID.setText(String.valueOf(book.getBookID()));
            txtAuthor.setText(book.getAuthorName());
            txtTitle.setText(book.getTitle());
            txtPublishedDate.setText(book.getPublishedDate());
            txtPrice.setText(String.valueOf(book.getPrice()));
            txtQty.setText(String.valueOf(book.getQuantity()));
            txtSubtotal.setText(String.valueOf(book.CalculateTotal()));

        }catch (NullPointerException ex){

            JOptionPane.showMessageDialog(this.pnlViewOrder, "Values in Object NOt Set / Null");

        }catch (Exception ex){
            JOptionPane.showMessageDialog(this.pnlViewOrder, "Error Occurred");
        }


        btnMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame frame = (JFrame) SwingUtilities.getRoot((Component) e.getSource());
                CPane.ContentP.addPane(frame.getContentPane());
                frame.setContentPane(new FrmMenu().pnlMenu);
                frame.setVisible(true);

            }
        });

        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame frame = (JFrame) SwingUtilities.getRoot((Component) e.getSource());
                frame.setContentPane(CPane.ContentP.getLastPane());
                frame.setVisible(true);
            }
        });
    }
}
