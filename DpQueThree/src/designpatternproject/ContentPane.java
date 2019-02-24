


package designpatternproject;

import java.awt.GridLayout;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.*;
import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

/**
 *
 * @author Milkias
 */

public class ContentPane extends javax.swing.JFrame implements salaryInterface{   
    DefaultTreeModel treeModel;
    DefaultMutableTreeNode p1, p2;
    DefaultMutableTreeNode rootNode;
    Toolkit toolkit = Toolkit.getDefaultToolkit();
    ArrayList<Integer> salaries = new ArrayList<>();
    
//    JTree tree;
    
    public ContentPane() {
        initComponents();
        
        rootNode = new DefaultMutableTreeNode("Company's CEO");
        treeModel = new DefaultTreeModel(rootNode);
        this.treeCatagories_one.setModel(treeModel);
        
//        
//    JScrollPane scrollPane = new JScrollPane(treeCatagories_one);
//    add(scrollPane);
        
    }
   
      
   public DefaultMutableTreeNode addObject(Object child) {
        DefaultMutableTreeNode parentNode = null;
        TreePath parentPath = treeCatagories_one.getSelectionPath();

        if (parentPath == null) {
          parentNode = rootNode;
        } else {
          parentNode = (DefaultMutableTreeNode) (parentPath.getLastPathComponent());
        }

        return addObject(parentNode, child, true);
  }

  public DefaultMutableTreeNode addObject(DefaultMutableTreeNode parent,Object child) {
        return addObject(parent, child, false);
  }

  public DefaultMutableTreeNode addObject(DefaultMutableTreeNode parent,Object child, boolean shouldBeVisible) {
        DefaultMutableTreeNode childNode = new DefaultMutableTreeNode(child);

        if (parent == null) {
          parent = rootNode;
        }

        treeModel.insertNodeInto(childNode, parent, parent.getChildCount());

        if (shouldBeVisible) {
          treeCatagories_one.scrollPathToVisible(new TreePath(childNode.getPath()));
        }
        return childNode;
  }
  
  
 @Override
  public void computeSalary(DefaultMutableTreeNode node){
     int sum = 0;
     int i;
     int childCount  = node.getChildCount();
    
    TreePath currentSelection = treeCatagories_one.getSelectionPath();
    if (currentSelection != null) {
      DefaultMutableTreeNode currentNode = (DefaultMutableTreeNode) (currentSelection.getLastPathComponent());
      MutableTreeNode parent = (MutableTreeNode) (currentNode.getParent());
     
      String salary_input = emp_salary.getText().trim();
      int salary = Integer.parseInt(salary_input);
      if(parent !=null){
           for(i = 1; i< childCount; i++){
               sum += salary; 
           }
            lMessage.setText("The sum of Salary is:  " + childCount);
      }else{
          lMessage.setText("The salary added is: " + salary);
       }
       
       return;
      
    }
   
    
  }
   @Override
    public void printError(){
          System.out.println("There is no error.");
  }
  
 public void printNode(DefaultMutableTreeNode node){
     int childCount  = node.getChildCount();
//     System.out.println("-----" + node.toString() + "-----");
     for(int j = 0; j< childCount; j++){
         DefaultMutableTreeNode childNode = (DefaultMutableTreeNode) node.getChildAt(j);
         if(childNode.getChildCount() > 0){
             printNode(childNode);
             childCount += childCount;
         }else{
             System.out.println(childNode.toString());
         }
     }
     System.out.println("The number of child is : " + childCount);
//     System.out.println("+++" + node.toString() + "+++");
 }
  
  
  
  /** Remove the currently selected node. */
  public void removeCurrentNode() {
    TreePath currentSelection = treeCatagories_one.getSelectionPath();
    if (currentSelection != null) {
      DefaultMutableTreeNode currentNode = (DefaultMutableTreeNode) (currentSelection.getLastPathComponent());
      MutableTreeNode parent = (MutableTreeNode) (currentNode.getParent());
      if (parent != null) {
        treeModel.removeNodeFromParent(currentNode);
        return;
      }
    }

    // Either there was no selection, or the root was selected.
    toolkit.beep();
  }
      
      
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        treeCategories = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        emp_role = new java.awt.TextField();
        emp_name = new java.awt.TextField();
        emp_salary = new java.awt.TextField();
        add_button = new javax.swing.JButton();
        remove_button = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_compute = new javax.swing.JTable();
        lMessage = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        treeCatagories_one = new javax.swing.JTree();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Employee here");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 190, 40));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Role");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 60, 20));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 60, 20));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Salary");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 60, 20));
        jPanel1.add(emp_role, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 180, -1));
        jPanel1.add(emp_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 180, -1));
        jPanel1.add(emp_salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 180, -1));

        add_button.setText("Add");
        add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(add_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 80, 30));

        remove_button.setText("Remove");
        remove_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(remove_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 90, 30));

        table_compute.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Role", "Salary"
            }
        ));
        jScrollPane2.setViewportView(table_compute);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, 240));

        lMessage.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 390, 30));

        jButton1.setText("Salary");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, -1, 30));

        treeCategories.setRightComponent(jPanel1);

        jScrollPane1.setViewportView(treeCatagories_one);

        treeCategories.setLeftComponent(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(treeCategories, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(treeCategories, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_buttonActionPerformed
       
        
        lMessage.setText("");
        
        String name_input = emp_name.getText().trim();
        String role_input = emp_role.getText().trim();
        String salary_input = emp_salary.getText().trim();
        
        if(!name_input.equals("")){
            addObject(name_input);
            DefaultTableModel model = (DefaultTableModel) table_compute.getModel();
            model.addRow(new Object[]{name_input, role_input,salary_input});
        }else{
            lMessage.setText("Name can not be an empty, please fill the field properly!");
        }
        
       
        
    }//GEN-LAST:event_add_buttonActionPerformed

    private void remove_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_buttonActionPerformed
//       method to delete the name from the tree
       
//      deleting the row from the table 
        DefaultTableModel model = (DefaultTableModel) table_compute.getModel();
         if(table_compute.getSelectedRow() == -1){
             if(table_compute.getRowCount() == 0){
                 lMessage.setText("Table is empty");
             }else{
                 lMessage.setText("You must select the row to delete");
             }
         }else{
             model.removeRow(table_compute.getSelectedRow());
             removeCurrentNode();
         }
    }//GEN-LAST:event_remove_buttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.out.println("Button is clicked");
        DefaultTreeModel mymodel = (DefaultTreeModel) treeCatagories_one.getModel();
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) mymodel.getRoot();
        computeSalary(root);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContentPane().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_button;
    private java.awt.TextField emp_name;
    private java.awt.TextField emp_role;
    private java.awt.TextField emp_salary;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lMessage;
    private javax.swing.JButton remove_button;
    private javax.swing.JTable table_compute;
    private javax.swing.JTree treeCatagories_one;
    private javax.swing.JSplitPane treeCategories;
    // End of variables declaration//GEN-END:variables

}


