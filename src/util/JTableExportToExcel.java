/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.table.TableModel;

/**
 *
 * @author 健鑫
 */
public  class JTableExportToExcel {
    /**
     * 选择文件
     * 
     * @param jTable 需要导出的table
     * @param fileNameString 导出文件名
     */
    public static void chooseFile(JTable jTable,String fileNameString) {
    JFileChooser jf = new JFileChooser();  
    jf.setFileSelectionMode(JFileChooser.SAVE_DIALOG | JFileChooser.DIRECTORIES_ONLY);  
    jf.showDialog(null,null);  
    File fi = jf.getSelectedFile();  
    String f = fi.getAbsolutePath()+fileNameString;  
    File f1=new File(f);
    try{  
        exportTable(jTable, f1);
    }  
    catch(IOException e){}  
        
    }
    /**
     * 向文件中写入
     * 
     * @param table 需要导出的表
     * @param file 导出的文件
     * @throws IOException 异常
     */
    public static void exportTable(JTable table, File file) throws IOException {
       TableModel model = table.getModel();
       BufferedWriter bWriter = new BufferedWriter(new FileWriter(file));
       for(int i=0; i < model.getColumnCount(); i++) {
           bWriter.write(model.getColumnName(i));
           bWriter.write("\t");
       }
       bWriter.newLine();
       for(int i=0; i< model.getRowCount(); i++) {
           for(int j=0; j < model.getColumnCount(); j++) {
               bWriter.write(model.getValueAt(i,j).toString());
               bWriter.write("\t");
           }
           bWriter.newLine();
       }
       bWriter.close();
   }
}
