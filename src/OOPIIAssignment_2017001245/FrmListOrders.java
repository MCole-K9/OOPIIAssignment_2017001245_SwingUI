package OOPIIAssignment_2017001245;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class FrmListOrders {
    private JTable tblListOrder;
    private JButton btnBack;
    public JPanel pnlListOrders;

    public FrmListOrders() {

        List<Book> orders  = BookRecords.ListRecords.GetRecords();

        String tblCOl [] = new String[] {"ID","Author", "Title", "Date Published", "Price", "Quantity", "Subtotal"};

        DefaultTableModel tableModel = new DefaultTableModel(tblCOl, 0);

        for(Book order: orders){

            Object row [] = new Object[]{
                    order.getBookID(),
                    order.getAuthorName(),
                    order.getTitle(),
                    order.getPublishedDate(),
                    "$"+ String.valueOf(order.getPrice()),
                    order.getQuantity(),
                    "$"+ String.valueOf(order.CalculateTotal()),
            };

            tableModel.addRow(row);
        }
        tblListOrder.setModel(tableModel);


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
