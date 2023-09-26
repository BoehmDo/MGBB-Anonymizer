package mgbbanonymizer;

import javax.swing.*;

import mgbbanonymizer.gui.ContentHandler;

/**
 * Hello world!
 *
 */
public class App 
{
      public static void main(String args[]){

        //tempgui
        JFrame frame = new JFrame("BZKF Upload Tool - Austausch von anonymisierten Therapieempfehlungen");
        ContentHandler.setFrame(frame);
        ContentHandler.initializeContent();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setUndecorated(true);
        frame.setVisible(true);

     }
}
