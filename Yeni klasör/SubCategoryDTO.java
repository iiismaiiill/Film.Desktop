package com.example.deryak.checkmanterminal.Test;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by DERYAK on 15.05.2020.
 */

public class SubCategoryDTO implements Serializable {
    public int SubMainID;
    public String SubName;
    private ArrayList<ViewDTO> ListDetail = new ArrayList<>();

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

    public ArrayList<ViewDTO> getListDetail() {
        return ListDetail;
    }

    public void setListDetail(ArrayList<ViewDTO> listDetail) {
        ListDetail = listDetail;
    }
}

