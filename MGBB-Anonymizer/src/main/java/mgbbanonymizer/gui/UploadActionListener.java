package mgbbanonymizer.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import mgbbanonymizer.gui.ContentHandler;

public class UploadActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        int input = JOptionPane.showConfirmDialog(null, 
                "Möchten sie die ausgewählten Datensätze hochladen?", "Bestätigung",JOptionPane.YES_NO_OPTION);
        // 0=yes, 1=no
        System.out.println(input);
        
        //throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}
