package org.collectionsFramework;

import java.util.*;


public class MapExample implements List1 {
    Map<String,Integer>hmap;
    public MapExample(){
        hmap = new HashMap<>();
    }

    @Override
    public void addMethod(String key) {
        if(hmap.containsKey(key)){
            hmap.put(key,hmap.get(key)+1);
        }
        else{
            hmap.put(key,1);
        }
    }
    @Override
    public List<String> getMathod() {
        List<String>obj = new ArrayList<>();
        for(Map.Entry<String,Integer>map : hmap.entrySet()){
//           obj.add(map.getKey());
            obj.add(String.valueOf(map.getValue()));
        }
        return obj;
    }
    @Override
    public Map<String, Integer> getAll() {
        return hmap;
    }


}
