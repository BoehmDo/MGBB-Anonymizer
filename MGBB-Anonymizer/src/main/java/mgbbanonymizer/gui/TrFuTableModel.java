package mgbbanonymizer.gui;

import javax.swing.table.AbstractTableModel;

class TrFuTableModel extends AbstractTableModel {
    
    private Object[][] data;

    public TrFuTableModel(Object[][] data) {
        this.data = data;
    }

    private String[] columnNames = {"inclusion",
                                    "Therapy Recommendation",
                                    "Alterations",
                                    "Entrez Gene ID",
                                    "Therapy Recommendation Date",
                                    "TMB"};

    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        return data.length;
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        return data[row][col];
    }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

    /*
     * Don't need to implement this method unless your table's
     * editable.
     */
    public boolean isCellEditable(int row, int col) {
        //Note that the data/cell address is constant,
        //no matter where the cell appears onscreen.
        if (col < 2) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * Don't need to implement this method unless your table's
     * data can change.
     */
    public void setValueAt(Object value, int row, int col) {
        data[row][col] = value;
        fireTableCellUpdated(row, col);
    }

    public void setData(Object[][] dataN) {
        data = dataN;
        fireTableDataChanged();
    }
}
