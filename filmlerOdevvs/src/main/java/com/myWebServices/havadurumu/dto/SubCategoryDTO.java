package com.myWebServices.havadurumu.dto;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by DERYAK on 15.05.2020.
 */

public class SubCategoryDTO  {
    public int SubMainID;
    public String SubName;
    private List<ViewDetailDTO> ListDetail;

    public int getSubMainID() {
        return SubMainID;
    }
    
    public void setSubMainID(int subMainID) {
        SubMainID = subMainID;
    }

    public String getSubName() {
        return SubName;
    }
   
    public void setSubName(String subName) {
        SubName = subName;
    }

    public List<ViewDetailDTO> getListDetail() {
        return ListDetail;
    }

    public void setListDetail(List<ViewDetailDTO> ListDetail) {
        this.ListDetail = ListDetail;
    }

     @Override
        public String toString() {
            return SubName;
        }
}

