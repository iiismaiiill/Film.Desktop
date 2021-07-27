package com.myWebServices.havadurumu.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by DERYAK on 15.05.2020.
 */

public class MainCategoryDTO implements Serializable {

    public String Name;
    public int  MainId;
    private List<SubCategoryDTO> List;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getMainId() {
        return MainId;
    }

    public void setMainId(int MainId) {
        this.MainId = MainId;
    }

    public List<SubCategoryDTO> getList() {
        return List;
    }

    public void setList(List<SubCategoryDTO> List) {
        this.List = List;
    }

}
