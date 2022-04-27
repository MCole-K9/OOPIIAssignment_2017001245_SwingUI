package OOPIIAssignment_2017001245;
//Matthew Cole - 2017001245
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class FrmFileOrders {
    private JTable tblListOrder;
    private JButton btnBack;
    public JPanel pnlFileOrders;

    public FrmFileOrders() {

        try{

            BookRecords.FileRecords.ReadFromFile();

        }catch (IOException ex){

            JOptionPane.showMessageDialog(pnlFileOrders.getRootPane(), "No Records Available\nMake an Order");

        }
        catch(Exception ex){

            JOptionPane.showMessageDialog(pnlFileOrders.getRootPane(), "Error Occurred: /n" + ex.getMessage() + "\n" + ex.getClass());

        }

        List<Book> orders  = BookRecords.FileRecords.GetRecords();

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
