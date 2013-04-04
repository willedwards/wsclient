package com.company;/**
 * Author: wge
 * Date: 04/04/2013
 * Time: 12:50
 */

import java.io.Serializable;

public class Account implements Serializable
{

    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name) {
      this.name = name;
    }
}