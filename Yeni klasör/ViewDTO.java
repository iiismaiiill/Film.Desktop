package com.example.deryak.checkmanterminal.Test;

import java.io.Serializable;

/**
 * Created by DERYAK on 15.05.2020.
 */

public class ViewDTO implements Serializable {
    public int id;
    public String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
