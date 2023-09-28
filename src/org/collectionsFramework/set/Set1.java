package org.collectionsFramework.set;

import org.collectionsFramework.List1;

import java.util.*;

public class Set1 implements List1 {
    private Set<String> set;
    public Set1(){
//       set= new HashSet<>();
//       set= new LinkedHashSet<>();
        set = new TreeSet<>();
//       set = new TreeSet<>(Comparator.reverseOrder());
    }

    @Override
    public void addMethod(String st) {
        set.add(st);
    }

    @Override
    public List<String> getMathod() {
        List<String>list= new ArrayList<>();
        list.addAll(set);
        return list;
    }

    @Override
    public Map<String, Integer> getAll() {
        return null;
    }
}
