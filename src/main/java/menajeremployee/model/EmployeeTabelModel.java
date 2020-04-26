package menajeremployee.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import menajeremployee.Employee;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class EmployeeTabelModel extends AbstractTableModel{
  private List<Employee> list;
  private String[] columnNames = {"id","idnp","name","surname","salary","hireDay","birthDay","gender"};
  
  public EmployeeTabelModel(){
    this.list = new ArrayList<>();
  }
    
  @Override
  public int getRowCount(){
    return list.size();
  }
  @Override
  public int getColumnCount(){
    return columnNames.length;
  }
  @Override
  public String getColumnName(int column){
    return columnNames[column];
  }
  @Override
  public Object getValueAt(int rowIndex,int ColumnIndex){
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    switch(ColumnIndex){
      case 0: return this.list.get(rowIndex).getId();
      case 1: return this.list.get(rowIndex).getIdnp();  
      case 2: return this.list.get(rowIndex).getName(); 
      case 3: return this.list.get(rowIndex).getsurName(); 
      case 4: return this.list.get(rowIndex).getSalary(); 
      case 5: return this.list.get(rowIndex).getHireDay().format(formatter); 
      case 6: return this.list.get(rowIndex).getBirthDay().format(formatter); 
      case 7: return this.list.get(rowIndex).getGender(); 
      default:
          throw new IllegalArgumentException("Cannot find column " + ColumnIndex);
    }
  }
 
  public void clear(){
    this.list.clear();
    this.fireTableDataChanged();
  }
  
  public void add(Employee emp){
    this.list.add(emp);
    this.fireTableDataChanged();
  }
  
  public Employee get(int row){
    return this.list.get(row);
  }
  
  public void update(int row,Employee edited){
    this.list.set(row,edited);
    this.fireTableDataChanged();
  }
    
  public void delete(int selectedRow){
    this.list.remove(selectedRow);
    this.fireTableDataChanged();
  }
}
