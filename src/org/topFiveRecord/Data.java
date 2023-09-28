package org.topFiveRecord;

public class Data implements Comparable {
    private String key;
    private int count;

    public Data(String key, int count) {
        this.key = key;
        this.count = count;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Data() {
    }

    @Override
    public int compareTo(Object o) {
        Data obj = (Data)o;

        if(this.count-obj.count>0){
            return 1;
        }
        else if(this.count-obj.count<0){
            return -1;
        }
        else{
            return 0;
        }
    }
}
