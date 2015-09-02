/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package java.sql;
package evansinterface;
import static evansinterface.BoxItems.*;
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import com.opencsv.CSVReader;
import java.io.FileReader;





/**
 *
 * @author Nate Hindman and Dakota Dolde
 */ 
 
public final class mainWindow extends javax.swing.JFrame {
    private Object br;
    
        
        

    mainWindow() throws FileNotFoundException, IOException  {
      //  int line =1;
        initComponents();
        templateFile = openFile();
        jLabel11.setForeground(Color.green);
        jLabel11.setText("No Additional Instructions");
        
            readcomments();
        
        if(templateFile == null){
            System.exit(0);
        }
            
        
        
        progress = 1;
        changedAn = false;
        fileReader = new CsvFileReader(templateFile);
        allData = fileReader.getLines();
        getDataRange();
        
        jProgressBar1.setMaximum(dataRange);
        jProgressBar1.setValue(progress);
        jProgressBar1.setString(progress + "/" + dataRange);
        jComboBox3.setModel(new DefaultComboBoxModel(fileReader.getBoxItems(TANTALUM)));
        jComboBox4.setModel(new DefaultComboBoxModel(fileReader.getBoxItems(ANODE)));
        jComboBox5.setModel(new DefaultComboBoxModel(fileReader.getBoxItems(ANODE)));
        jComboBox6.setModel(new DefaultComboBoxModel(fileReader.getBoxItems(ANODE)));
        jComboBox7.setModel(new DefaultComboBoxModel(fileReader.getBoxItems(ANODE)));
        jComboBox8.setModel(new DefaultComboBoxModel(fileReader.getBoxItems(ANODE)));
        jComboBox9.setModel(new DefaultComboBoxModel(fileReader.getBoxItems(CATHODE)));
        jComboBox1.setModel(new DefaultComboBoxModel(fileReader.getBoxItems(GLASSING)));
    }
     
    private void getDataRange(){
        int q = 0;
        while(allData[1][q] != null){q++;}
        dataRange = q;
    }
      
      
      


    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jDialog1 = new javax.swing.JDialog();
        jMenuItem1 = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        fileSelect = new javax.swing.JFileChooser();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox();
        jProgressBar1 = new javax.swing.JProgressBar();
        nextButton = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenuItem1.setText("jMenuItem1");

        fileSelect.setCurrentDirectory(new java.io.File("/Z:\\\\Database Current\\Assembly Lots\\"));
            fileSelect.setDialogTitle("Select CSV Template File");
            fileSelect.setFileFilter(new FileNameExtensionFilter("CSV FILES", "csv", "commaSeperatedValue"));

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            jTextField2.setText("1");
            jTextField2.setToolTipText("Serial Number");
            jTextField2.setMaximumSize(new java.awt.Dimension(102, 2147483647));
            jTextField2.setName(""); // NOI18N
            jTextField2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jTextField2ActionPerformed(evt);
                }
            });

            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel1.setText("Current Item");
            jLabel1.setToolTipText("");

            jLabel2.setText("Header Glassing");

            jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel4.setText("Tantalum Lot");

            jComboBox3.setMaximumRowCount(20);
            jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
            jComboBox3.setMaximumSize(new java.awt.Dimension(102, 32767));
            jComboBox3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jComboBox3ActionPerformed(evt);
                }
            });

            jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel5.setText("Anode Lot 1");

            jComboBox4.setMaximumRowCount(20);
            jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
            jComboBox4.setMaximumSize(new java.awt.Dimension(102, 32767));
            jComboBox4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jComboBox4ActionPerformed(evt);
                }
            });

            jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel6.setText("Anode Lot 2");

            jComboBox5.setMaximumRowCount(20);
            jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
            jComboBox5.setMaximumSize(new java.awt.Dimension(102, 32767));
            jComboBox5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jComboBox5ActionPerformed(evt);
                }
            });

            jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel7.setText("Anode Lot 3");

            jComboBox6.setMaximumRowCount(20);
            jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
            jComboBox6.setMaximumSize(new java.awt.Dimension(102, 32767));
            jComboBox6.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jComboBox6ActionPerformed(evt);
                }
            });

            jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel8.setText("Anode Lot 4");

            jComboBox7.setMaximumRowCount(20);
            jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
            jComboBox7.setMaximumSize(new java.awt.Dimension(102, 32767));
            jComboBox7.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jComboBox7ActionPerformed(evt);
                }
            });

            jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel9.setText("Anode Lot 5");

            jComboBox8.setMaximumRowCount(20);
            jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
            jComboBox8.setMaximumSize(new java.awt.Dimension(102, 32767));
            jComboBox8.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jComboBox8ActionPerformed(evt);
                }
            });

            jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel10.setText("Cathode Lot");

            jComboBox9.setMaximumRowCount(20);
            jComboBox9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
            jComboBox9.setMaximumSize(new java.awt.Dimension(102, 32767));
            jComboBox9.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jComboBox9ActionPerformed(evt);
                }
            });

            jProgressBar1.setMaximum(40);
            jProgressBar1.setMinimum(1);
            jProgressBar1.setToolTipText("Progress");
            jProgressBar1.setString("1/40");
            jProgressBar1.setStringPainted(true);

            nextButton.setText("Next");
            nextButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    nextButtonActionPerformed(evt);
                }
            });

            jTextField4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jTextField4ActionPerformed(evt);
                }
            });

            backButton.setText("Back");
            backButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    backButtonActionPerformed(evt);
                }
            });

            jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel3.setText("Notes");

            jComboBox1.setMaximumRowCount(20);
            jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1" }));
            jComboBox1.setMaximumSize(new java.awt.Dimension(102, 32767));
            jComboBox1.setMinimumSize(new java.awt.Dimension(102, 27));
            jComboBox1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jComboBox1ActionPerformed(evt);
                }
            });

            jLabel11.setText("jLabel11");

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField4)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(backButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nextButton))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBox4, 0, 102, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jComboBox5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jComboBox6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createSequentialGroup()
                    .addGap(142, 142, 142)
                    .addComponent(jLabel11)
                    .addGap(0, 0, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel2))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nextButton)
                        .addComponent(backButton)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel11)
                    .addContainerGap())
            );

            jProgressBar1.getAccessibleContext().setAccessibleName("");

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
 
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
      
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        changedAn = true;
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
        changedAn = true;
    }//GEN-LAST:event_jComboBox7ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        changedAn = true;
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jComboBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox8ActionPerformed
        changedAn = true;
    }//GEN-LAST:event_jComboBox8ActionPerformed

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
        changedAn = true;
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void jComboBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox9ActionPerformed
     
    }//GEN-LAST:event_jComboBox9ActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        writeDatas();
        
        if(progress > dataRange){
            writeOutFile();
            System.exit(0);
        }
    }//GEN-LAST:event_nextButtonActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed
   
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        if(progress > 1){
        progress--;
        jTextField2.setText(String.valueOf(progress));
        jProgressBar1.setValue(progress);
        jProgressBar1.setString(progress + "/" + dataRange);
        }
    }//GEN-LAST:event_backButtonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new mainWindow().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(mainWindow.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(mainWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    private File openFile(){
        int returnVal = fileSelect.showOpenDialog(this);
    if (returnVal == JFileChooser.APPROVE_OPTION) {
        File file = fileSelect.getSelectedFile();
        try {
            return file;
        } catch (Exception ex) {
          System.out.println("problem accessing file"+file.getAbsolutePath());
          return null;
        }
    } else {
        System.out.println("File access cancelled by user.");
        return null;
    }
    }
    
    
    private String checkNA(String inString){
        if(inString.equals("-----"))
            return "";
        else return inString;
    }
    
    
    private boolean isNum(String str){
        try{
            double d = Double.parseDouble(str);
        }
        catch(NumberFormatException nfe){
            return false;
        }
        return true;
        
    }
    
    private String compileOutput(){
        String oneOut = "";
        oneOut += ",,,,,,,,";
        oneOut += checkNA(jComboBox4.getSelectedItem().toString());
        oneOut += ",";
        oneOut += checkNA(jComboBox5.getSelectedItem().toString());
        oneOut += ",";
        oneOut += checkNA(jComboBox6.getSelectedItem().toString());
        oneOut += ",";
        oneOut += checkNA(jComboBox7.getSelectedItem().toString());
        oneOut += ",";
        oneOut += checkNA(jComboBox8.getSelectedItem().toString());
        oneOut += ",";
        oneOut += checkNA(jComboBox9.getSelectedItem().toString());
        oneOut += ",,";
        oneOut += checkNA(jComboBox3.getSelectedItem().toString());
        oneOut += ",,";
        oneOut += checkNA(jComboBox1.getSelectedItem().toString());
        oneOut += ",,,,,,,,,,";
        return oneOut;
    }
    
    private void anCheck(){
        if(changedAn){
            if(jComboBox8.getSelectedIndex() > 0){
                jComboBox7.setSelectedIndex(jComboBox8.getSelectedIndex());
            }
            if(jComboBox7.getSelectedIndex() > 0){
                jComboBox6.setSelectedIndex(jComboBox7.getSelectedIndex());
            }
            if(jComboBox6.getSelectedIndex() > 0){
                jComboBox5.setSelectedIndex(jComboBox6.getSelectedIndex());
            }
            if(jComboBox5.getSelectedIndex() > 0){
                jComboBox4.setSelectedIndex(jComboBox5.getSelectedIndex());
            }
            changedAn = false;
        }
    }
    
    private void writeOutFile(){
        try {
            FileWriter fileOut = new FileWriter(templateFile, false);
            fileOut.write("");
            fileOut = new FileWriter(templateFile, true);
            BufferedWriter writeOut = new BufferedWriter(fileOut);
            
            for (String allData1 : allData[0]) {
                writeOut.append(allData1 + "\n");
            }
            
            for(int i = 0; i < dataRange; i++){
                writeOut.append(allData[1][i]);
            }
            
            for (String allData1 : allData[2]) {
                if(allData1 != null)
                    writeOut.append(allData1 + "\n");
            }
            
            writeOut.close();
            
        } catch (IOException ex) {
            System.out.println("File not written.");
        }
    }
    
    private void writeDatas(){
        if(progress <= dataRange){
        while(progress < Integer.parseInt(jTextField2.getText())){
            if(progress < dataRange){
                dataText = allData[1][progress - 1];
                dataText = dataText.substring(0, dataText.indexOf(','));

                allData[1][progress - 1] = dataText + ",," + progress + newOut + ",\n";

                progress++;
            }
        }
        
        dataText = allData[1][progress - 1];
        dataText = dataText.substring(0, dataText.indexOf(','));
        
        newOut = compileOutput();
        
        allData[1][progress - 1] = dataText + ",," + progress + newOut + jTextField4.getText() + ",\n";
        
        jTextField4.setText("");
        
        anCheck();
        
        progress++;
        jTextField2.setText(String.valueOf(progress));
        jProgressBar1.setValue(progress);
        jProgressBar1.setString(progress + "/" + dataRange);
        
        if(progress >= dataRange - 1){
            nextButton.setText("Finish");
        }
        }
     
}
    void readcomments() throws FileNotFoundException, IOException{
          File file = fileSelect.getSelectedFile();
        CSVReader reader = new CSVReader(new FileReader(file+".csv"));
     String [] nextLine;
     while ((nextLine = reader.readNext()) != null) { //while the row isn't blank
        // nextLine[] is an array of values from the line
        System.out.println(nextLine[0] + nextLine[1] + "etc...");
        if(nextLine[20]!=null){  // if there are comments 
            jLabel11.setForeground(Color.red); //turn jlabel red
            jLabel11.setText(nextLine[20]);  // show the instructions
        }
     }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFileChooser fileSelect;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JComboBox jComboBox9;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton nextButton;
    // End of variables declaration//GEN-END:variables

private String dataText;
private String stuff;
private File templateFile;
private String noteText;
private String duplicateText;
private int progress;
private String[][] allData;
private String[] topData;
private String[] enteredData;
private int dataRange;
String newOut;
private final CsvFileReader fileReader;
boolean changedAn;


    
}
