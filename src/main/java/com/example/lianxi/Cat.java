package com.example.lianxi;

public class Cat extends Animal{
    int size;
    String name;

    void bark(){
        if(size>60){
            System.out.println("Wooof!Wooof!");
        }else if(size>14){
            System.out.println("Ruff!Ruff!");
        }else {
            System.out.println("Yip!Yip!");
        }
    }
}
