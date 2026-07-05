package dataStructures;

public class Stack {

    private String [] items;
    private int count;

    public Stack(int size){

        items = new String[size];
    }

    public boolean isEmpty(){

        return count == 0;
    }

    public void push(String add){
        boolean itemsIsFull = isFull();
        if (itemsIsFull) {
            throw new IllegalArgumentException("The Stack Is Full");
        }
        else {
            items[count++] = add;
        }
    }

    public int size(){
        return count;
    }

    public String pop(){
        boolean itemIsEmpty = isEmpty();
        if(itemIsEmpty){
           throw new IllegalArgumentException("Stack Is Empty");
        }
        if (count > 0) --count;
        return items[count];
    }
    public String peek(){
        boolean itemIsEmpty = isEmpty();
        if(itemIsEmpty){
            throw new IllegalArgumentException("Nothing to see, Stack Is Empty");
        }
        return items[count-1];
    }
    public boolean isFull(){
        return items.length == count;
    }
}
