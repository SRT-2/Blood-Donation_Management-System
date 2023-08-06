/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package donor;


import java.util.ArrayList;
import java.io.File;
import java.util.ArrayList;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

/**
 *
 * @author user
 */
public class Excelreader {
    
    public ArrayList getExcelData(String st){
        ArrayList m=new ArrayList();
        try{
            Workbook ReadExcel= Workbook.getWorkbook(new File(st));
            Sheet sheet= ReadExcel.getSheet(0);
            int a=sheet.getColumns();
            int b=sheet.getRows();
            
            for (int i=1;i<b;i++){
                ArrayList in=new ArrayList();
                For(int j=0;j<a;j++)
            }
             
            
        }
    }
    
}
