package mgbbanonymizer.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;

public class ContentHandler {
   
    private static Object[][] data = {};
    private static JFrame frame;
    private static TrFuTableModel tableModel;

    public static void setFrame(JFrame frameN) {
        frame = frameN;
    }
    
    public static JFrame getFrame() {
        return frame;
    }

    public static Object[][] getData(){
        return data;
    }

    public static void setData(Object[][] dataN) {
        data = dataN;
    }

    public static void setTableModel(TrFuTableModel tableModelN) {
        tableModel = tableModelN;
    }

    public static TrFuTableModel getTableModel() {
        return tableModel;
    }

    public static void initializeContent(){
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,500);

        tableModel = new TrFuTableModel(data);

        JButton etlButton = new JButton("Load Data");
        etlButton.addActionListener(new ImportActionListener());

        JButton uploadButton = new JButton("Upload");
        uploadButton.addActionListener(new UploadActionListener());

        JSplitPane etlSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        etlSplitPane.setLeftComponent(etlButton);
        etlSplitPane.setRightComponent(uploadButton);

        JTable trfuTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(trfuTable);

        JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
        splitPane.setBottomComponent(scrollPane);
        splitPane.setTopComponent(etlSplitPane);

        frame.getContentPane().add(splitPane);
    }

}
