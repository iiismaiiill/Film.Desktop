
package table;

import javax.swing.table.AbstractTableModel;

public class TableDetailModel extends AbstractTableModel{
    
    private String[] columnNames;
    private Object[][] data;
    
    public TableDetailModel(String[] columnNames, Object[][] data){
        this.columnNames = columnNames;
        this.data = data;
    }
 
    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
       data[rowIndex][columnIndex] = aValue; //To change body of generated methods, choose Tools | Templates.
    }
    

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return data[0][columnIndex].getClass();
    }
    
    
    
}
