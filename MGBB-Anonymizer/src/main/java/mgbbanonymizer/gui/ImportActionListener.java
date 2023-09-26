package mgbbanonymizer.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ImportActionListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {

        Object[][] data = {
            {new Boolean(false), "Kathy", "Smith",
             "Snowboarding", new Integer(5), new Boolean(false)}};

        
        ContentHandler.getTableModel().setData(data);
        
        System.out.println(ContentHandler.getTableModel().getValueAt(0, 0));
        JOptionPane.showConfirmDialog(null, 
                "Daten werden geladen und transformiert", "Bestätigung", JOptionPane.OK_CANCEL_OPTION);
        // 0=yes, 1=no

    }

}
