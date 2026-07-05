package dataStructures;

public class Map {

    private String key;
    private String value;
    private int count;

    public boolean isEmpty(){
        return count == 0;
    }

    public void put(String key, String value){
        this.key = key;
        this.value = value;
        count++;
    }

    public int size(){
        return count;
    }
}
