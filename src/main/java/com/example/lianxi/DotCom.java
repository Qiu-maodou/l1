package com.example.lianxi;

import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> loc) {
        this.locationCells = loc;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String checkYoursels(String userInput){
        String result="miss";
        int index=locationCells.indexOf(userInput);
        if(index>=0){
            locationCells.remove(index);

            if(locationCells.isEmpty()){
                result="kill";
            }else {
                result="hit";
            }
        }
        return result;
    }
}
