package org.topFiveRecord;

import java.util.*;
public class ListMap implements InterfaceDemo{
    Queue<Data>queue;
    Map<String,Data>map;
    @Override
    public void addKey(String key){
       int i = 1;
       if(map.containsKey(key)){
           Data data = map.get(key);
           queue.remove(data);
           data.setCount(i+1);
           map.put(key,data);
           queue.add(data);
       }
       else{
           Data data = new Data(key,i);
           map.put(key,data);
           queue.add(data);
       }
    }
    @Override
    public List<String> returnlist() {
        List<String> list= new ArrayList<>();

        for(int i = 0; i<=4; i++){
            list.add(queue.poll().getKey());
        }
        return list;
    }
    @Override
    public Map<String, Data> returnmap() {
        return null;
    }
    public ListMap() {
      queue = new PriorityQueue<>(Comparator.reverseOrder());
      map = new TreeMap<>();
    }
}
