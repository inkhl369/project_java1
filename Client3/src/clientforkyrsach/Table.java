package clientforkyrsach;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class Table extends AbstractTableModel 
{

    private int colnum=4;
 
 private String[] colNames = 
 {
  "Код","Тип авто","Модель","Цена"
 };
private  ArrayList<String[]> ResultSets=new ArrayList<>();
    
public Table(ArrayList<String[]> ResultSets) 
 {
     this.ResultSets=ResultSets;
 }
  public Table() 
 {
 }
  
    @Override
    public int getRowCount() {
        return ResultSets.size();
    }

    @Override
    public int getColumnCount() {
        return colnum;
    }

    @Override
     public Object getValueAt(int rowindex, int columnindex) 
 {
  String[] row = ResultSets.get(rowindex);
  if (columnindex==0)
  {
  int name=Integer.parseInt(row[columnindex]);
  return name;
  }
  if (columnindex==3)
  {
  double name=Double.parseDouble(row[columnindex]);
  return name;
  }
  return row[columnindex];
 }
    @Override
      public String getColumnName(int param)
 {
  return colNames[param];
 }
 @Override
            public Class getColumnClass(int col) {
                if (col == 0) 
                    return Integer.class;
                if (col == 3) 
                    return Double.class;
                return String.class;
            }

    
}
