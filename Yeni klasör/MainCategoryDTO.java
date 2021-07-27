package com.example.deryak.checkmanterminal.Test;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by DERYAK on 15.05.2020.
 */

public class MainCategoryDTO implements Serializable {

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public ArrayList<SubCategoryDTO> getListDetail() {
        return ListDetail;
    }

    public void setListDetail(ArrayList<SubCategoryDTO> listDetail) {
        ListDetail = listDetail;
    }

    public String Name;
    private ArrayList<SubCategoryDTO> ListDetail=new ArrayList<>();

}
