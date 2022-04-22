package OOPIIAssignment_2017001245;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FrmOrder extends JFrame {
    private JTextField txtBookID;
    private JTextField txtAuthor;
    private JTextField txtTitle;
    private JTextField txtPublishedDate;
    private JTextField txtPrice;
    private JTextField txtQty;
    private JLabel lblBookOrder;
    private JLabel lblID;
    private JLabel lblAuthor;
    private JLabel lblTitle;
    private JLabel lblPDate;
    private JLabel lblPrice;
    private JButton btnAddToList;
    private JButton btnAddToFile;
    private JButton btnClear;
    public JPanel pnlOrder;
    private JButton btnBack;

    public FrmOrder()  {

        try{
            File file = new File("Order.dat");

            if (!file.createNewFile()){

                BookRecords.FileRecords.ReadFromFile();
            }

        }catch(Exception ex){

            JOptionPane.showMessageDialog(pnlOrder.getRootPane(), "Error Occurred: /n" + ex.getMessage() + "\n" + ex.getClass());

        }

        btnAddToList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    Book book = new Book(Integer.parseInt(txtBookID.getText()), txtAuthor.getText(), txtTitle.getText(), txtPublishedDate.getText(), Float.parseFloat(txtPrice.getText()),Integer.parseInt(txtQty.getText()));

                    BookRecords.ListRecords.AddRecord(book);

                    JFrame frame = (JFrame) SwingUtilities.getRoot((Component) e.getSource());
                    CPane.ContentP.addPane(frame.getContentPane());
                    frame.setContentPane(new FrmViewOrder(book).pnlViewOrder);
                    frame.setVisible(true);

                }catch (NumberFormatException ex){

                    JOptionPane.showMessageDialog(pnlOrder.getRootPane(), "Letters were Entered / Blank Space Left Where Numbers are expected");
                }

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
        btnAddToFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    Book book = new Book(Integer.parseInt(txtBookID.getText()), txtAuthor.getText(), txtTitle.getText(), txtPublishedDate.getText(), Float.parseFloat(txtPrice.getText()),Integer.parseInt(txtQty.getText()));

                    BookRecords.FileRecords.AddRecord(book);
                    BookRecords.FileRecords.WriteToFile();

                    JFrame frame = (JFrame) SwingUtilities.getRoot((Component) e.getSource());
                    CPane.ContentP.addPane(frame.getContentPane());
                    frame.setContentPane(new FrmViewOrder(book).pnlViewOrder);
                    frame.setVisible(true);

                }catch (NumberFormatException ex){

                    JOptionPane.showMessageDialog(pnlOrder.getRootPane(), "Letters were Entered / Blank Space Left Where Numbers are expected");

                }catch (IOException ex){

                    JOptionPane.showMessageDialog(pnlOrder.getRootPane(), "Error Occurred: /n" + ex.getMessage());

                }

            }
        });
    }
}
