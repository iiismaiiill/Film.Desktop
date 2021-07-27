/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myWebServices.havadurumu.dto;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author isoba
 */
public class MainDTO implements Serializable{
    
   public  List<EmployeesDTO> employees ;

    public List<EmployeesDTO> getEmployees() {
        return employees;
    }

    public void setEmployees(List<EmployeesDTO> employees) {
        this.employees = employees;
    }
   
    
}
