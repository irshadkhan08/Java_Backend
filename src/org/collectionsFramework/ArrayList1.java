package org.collectionsFramework;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class ArrayList1 implements List1{
    List<String>str;
    public  ArrayList1(){
        str = new ArrayList<>();
    }
    @Override
    public void addMethod(String st) {
       str.add(st);
    }
    @Override
    public List<String> getMathod() {
        return str;
    }
    @Override
    public Map<String, Integer> getAll() {
        return null;
    }
}
