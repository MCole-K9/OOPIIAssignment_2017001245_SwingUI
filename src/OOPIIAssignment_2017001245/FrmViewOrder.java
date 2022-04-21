package OOPIIAssignment_2017001245;

import javax.swing.*;

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
    private JButton button1;
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

        }catch (NumberFormatException ex){

            JOptionPane.showMessageDialog(pnlViewOrder.getRootPane(), "A Number Was Entered Where Words are expected");

        }catch (Exception ex){

        }


    }
}
