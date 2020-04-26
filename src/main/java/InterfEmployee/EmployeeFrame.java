/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfEmployee;

import java.util.ArrayList;
import java.util.List;
import menajeremployee.Employee;
import menajeremployee.EmployeeDb;
import menajeremployee.model.EmployeeTabelModel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import enums.Gender;
import java.io.IOException;
import menajeremployee.XmlIOService;
import org.jdom2.JDOMException;
/**
 *
 * @author mihail
 */
public class EmployeeFrame extends javax.swing.JFrame {
    
    private EmployeeTabelModel model = new EmployeeTabelModel();

    /**
     * Creates new form EmployeeFrame
     */
    public EmployeeFrame() {
        initComponents();
        this.jEmployeeTabel.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jAction = new javax.swing.JLabel();
        jData = new javax.swing.JLabel();
        jFilter = new javax.swing.JLabel();
        jAddEmployee = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jImport = new javax.swing.JButton();
        jExport = new javax.swing.JButton();
        jPrint = new javax.swing.JButton();
        jAdd = new javax.swing.JButton();
        jCFilter = new javax.swing.JComboBox<>();
        jFormattedSearch = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEmployeeTabel = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu1.setText("jMenu1");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jAction.setText("Actions");

        jData.setText("Data");

        jFilter.setText("Filter");

        jAddEmployee.setText("Add Employee");
        jAddEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddEmployeeActionPerformed(evt);
            }
        });

        jButton2.setText("Edit Employee");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete Employee");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jImport.setText("Import");
        jImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jImportActionPerformed(evt);
            }
        });

        jExport.setText("Export");
        jExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExportActionPerformed(evt);
            }
        });

        jPrint.setText("Print");

        jAdd.setText("Cautare");
        jAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddActionPerformed(evt);
            }
        });

        jCFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IDNP", "Nume", "Prenume", "Salariu", "Data angajarii", "Data nasterii", "Gen" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jAction)
                        .addGap(101, 101, 101)
                        .addComponent(jData))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jAddEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jExport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jImport, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jFilter)
                        .addGap(112, 112, 112))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jFormattedSearch)
                            .addComponent(jCFilter, 0, 158, Short.MAX_VALUE)
                            .addComponent(jAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAction)
                    .addComponent(jData)
                    .addComponent(jFilter))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAddEmployee)
                    .addComponent(jImport)
                    .addComponent(jCFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jExport)
                    .addComponent(jFormattedSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3)
                        .addComponent(jPrint))
                    .addComponent(jAdd))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jEmployeeTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jEmployeeTabel);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jMenu2.setText("File");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("About");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddActionPerformed
        // TODO add your handling code here:
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        List<Employee> staff = new ArrayList<>();
        EmployeeDb edb = new EmployeeDb();

        switch(jCFilter.getSelectedIndex()){
            case 0: 
                staff = edb.get(Integer.parseInt(jFormattedSearch.getText()),2);
                break;
             case 1: 
                staff = edb.get(jFormattedSearch.getText(),3);
                break;       
             case 2: 
                staff = edb.get(jFormattedSearch.getText(),4);
                break;    
              case 3: 
                staff = edb.get(Double.parseDouble(jFormattedSearch.getText()),5);
                break;  
              case 4: 
                //jFormattedSearch.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd.MM.yyyy"))));
                staff = edb.get(LocalDate.parse(jFormattedSearch.getText(),formatter),6);
                //jFormattedSearch.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("'null'"))));
                break; 
              case 5: 
                //jFormattedSearch.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd.MM.yyyy"))));
                staff = edb.get(LocalDate.parse(jFormattedSearch.getText(),formatter),7);
                //jFormattedSearch.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("'null'"))));
                break;
              case 6: 
                Gender gender=null;  
                try{
                  gender = Gender.valueOfIgnoreCase(jFormattedSearch.getText());
                }
                catch(IllegalArgumentException e){
                  gender = Gender.valueOf(jFormattedSearch.getText());
                }

                if(gender!=null){
                  staff = edb.get(gender,8);
                  //jFormattedSearch.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("'null'"))));
                }
                break;
        }
        
        
        model.clear();
        for (Employee emp : staff) {
          model.add(emp);
        }
    }//GEN-LAST:event_jAddActionPerformed

    private void jAddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddEmployeeActionPerformed
        // TODO add your handling code here:
        EmployeeDb edb = new EmployeeDb();
        AddDialog add = new AddDialog(this,true);
        add.setVisible(true);
        //add.setResultAdd();
        Employee emp = add.getResult();
        edb.insertOne(emp);
        model.add(emp);
    }//GEN-LAST:event_jAddEmployeeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        EmployeeDb edb = new EmployeeDb();
        int row = jEmployeeTabel.getSelectedRow();
        //System.out.println("Row = " + row);
        //String Name = (String)jEmployeeTabel.getValueAt(row, 2);
        //System.out.println("Name = " + Name);
        //System.out.print("id= " + String.valueOf(jEmployeeTabel.getValueAt(row,0)));
        Employee emp = new Employee((int)jEmployeeTabel.getValueAt(row,0),(int)jEmployeeTabel.getValueAt(row,1),(String)jEmployeeTabel.getValueAt(row, 2),
        (String)jEmployeeTabel.getValueAt(row, 3),(double)jEmployeeTabel.getValueAt(row, 4),LocalDate.parse((String)jEmployeeTabel.getValueAt(row, 5),formatter),
        LocalDate.parse((String)jEmployeeTabel.getValueAt(row, 6),formatter),(Gender)jEmployeeTabel.getValueAt(row, 7));
        AddDialog add = new AddDialog(this,true);
        add.setResultEdit(emp);
        emp = add.getResult();
        //System.out.println("getBirthDay()" + String.valueOf(emp.getBirthDay()));
        edb.update(emp);
        model.update(row, emp);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        EmployeeDb edb = new EmployeeDb();
        int row = jEmployeeTabel.getSelectedRow();
        Employee emp = new Employee((int)jEmployeeTabel.getValueAt(row,0),(String)jEmployeeTabel.getValueAt(row, 2),
        (String)jEmployeeTabel.getValueAt(row, 3),(double)jEmployeeTabel.getValueAt(row, 4),LocalDate.parse((String)jEmployeeTabel.getValueAt(row, 5),formatter),
        LocalDate.parse((String)jEmployeeTabel.getValueAt(row, 6),formatter),(Gender)jEmployeeTabel.getValueAt(row, 7));
        edb.delete(emp);
        model.delete(row);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jImportActionPerformed
        // TODO add your handling code here:
      List<Employee> staff = new ArrayList<>();
      XmlIOService xmlRead = new XmlIOService();
      try{
        staff=xmlRead.readFromFile();
      }
      catch(JDOMException|IOException ex){
        System.out.println("Datele nu au fost citite din fisier ");
      }
      model.clear();
      for (Employee emp : staff) {
        model.add(emp);
      }   
      EmployeeDb edb = new EmployeeDb();
      edb.insert(staff);
    }//GEN-LAST:event_jImportActionPerformed

    private void jExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExportActionPerformed
        // TODO add your handling code here:
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
      List<Employee> staff = new ArrayList<>();  
      for(int row=0; row<jEmployeeTabel.getRowCount(); row++){
        staff.add(new Employee((int)jEmployeeTabel.getValueAt(row,0),(int)jEmployeeTabel.getValueAt(row,1),(String)jEmployeeTabel.getValueAt(row, 2),
        (String)jEmployeeTabel.getValueAt(row, 3),(double)jEmployeeTabel.getValueAt(row, 4),LocalDate.parse((String)jEmployeeTabel.getValueAt(row, 5),formatter),
        LocalDate.parse((String)jEmployeeTabel.getValueAt(row, 6),formatter),(Gender)jEmployeeTabel.getValueAt(row, 7)));
      }
      XmlIOService xmlFile = new XmlIOService();
      try {
        xmlFile.writeToFile(staff);
      }
      catch(IOException ex){
        System.out.println("Datele nu au fost salvate in fisier ");
      }
    }//GEN-LAST:event_jExportActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAction;
    private javax.swing.JButton jAdd;
    private javax.swing.JButton jAddEmployee;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jCFilter;
    private javax.swing.JLabel jData;
    private javax.swing.JTable jEmployeeTabel;
    private javax.swing.JButton jExport;
    private javax.swing.JLabel jFilter;
    private javax.swing.JFormattedTextField jFormattedSearch;
    private javax.swing.JButton jImport;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jPrint;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}