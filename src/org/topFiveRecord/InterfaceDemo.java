package org.topFiveRecord;

import java.util.*;

public interface InterfaceDemo {
    default void addKey(String key){
    }
    List<String> returnlist();
    Map<String,Data>returnmap();
}
