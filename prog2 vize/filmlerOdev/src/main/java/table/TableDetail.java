/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table;

import com.myWebServices.havadurumu.dto.SubCategoryDTO;
import helper.Helper;
import java.awt.Color;
import javax.swing.JTable;

/**
 *
 * @author isoba
 */
public class TableDetail {

    public TableDetail(JTable jTable1, SubCategoryDTO subCategoryDTO) {
           
        String[] columns = {"Id ","Adı", "Yayın Yılı", "Ülke", "İmdb"};
        Object[][] data =Helper.ListSubToObjectArry(subCategoryDTO.getListDetail());
        TableDetailModel model = new TableDetailModel(columns, data);      
        jTable1.setModel(model);       
         
    }
    
}
