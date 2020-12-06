package clientforkyrsach;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class Table1 extends AbstractTableModel
{

    private int colnum=5;
 
 private String[] colNames = 
 {
  "КодКлиента","Фамилия","Имя","Отчество","Адрес"
 };
private  ArrayList<String[]> ResultSets=new ArrayList<>();
    
public Table1(ArrayList<String[]> ResultSets) 
 {
     this.ResultSets=ResultSets;
 }
  public Table1() 
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
  return row[columnindex];
 }
    @Override
      public String getColumnName(int param)
 {
  return colNames[param];
 }
 @Override
            public Class getColumnClass(int col) {
                if (col == 0 ) 
                    return Integer.class;
                return String.class;
            }

    
}

