/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientforkyrsach;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ilya
 */
public class Table2 extends AbstractTableModel 
{

    private int colnum=6;
 
 private String[] colNames = 
 {
  "КодЗаказа","Дата","Название","Модель","Цена","Описание"
 };
private  ArrayList<String[]> ResultSets=new ArrayList<>();
    
public Table2(ArrayList<String[]> ResultSets) 
 {
     this.ResultSets=ResultSets;
 }
  public Table2() 
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
  if (columnindex==4)
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
                if (col == 4) 
                    return Double.class;
                return String.class;
            }

    
}


