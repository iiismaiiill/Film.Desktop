/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import com.myWebServices.havadurumu.dto.SubCategoryDTO;
import com.myWebServices.havadurumu.dto.ViewDetailDTO;
import java.util.List;

/**
 *
 * @author isoba
 */
public class Helper {
    public static Object[][] ListSubToObjectArry(List<ViewDetailDTO> viewDetailDTOs){
         Object[][]  data =new Object[viewDetailDTOs.size()][7];
        for (int i = 0; i < viewDetailDTOs.size(); i++) {
           ViewDetailDTO dto=viewDetailDTOs.get(i);
             data[i][0]=dto.getId();
             data[i][1]=dto.getAdi();
             data[i][2]=dto.getYayınTarihi();
             data[i][3]=dto.getUlke();
             data[i][4]=dto.getImdbPuan();
             data[i][5]=dto.getResim();
             data[i][6]=dto.getAciklama();
        }
  
        return data;
    }
}
